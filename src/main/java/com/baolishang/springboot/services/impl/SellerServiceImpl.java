package com.baolishang.springboot.services.impl;

import com.baolishang.springboot.beans.ResponseCode;
import com.baolishang.springboot.daos.SellerDao;
import com.baolishang.springboot.exceptions.BaseException;
import com.baolishang.springboot.models.Seller;
import com.baolishang.springboot.services.SellerService;
import com.baolishang.springboot.utils.MD5Utils;
import com.baolishang.springboot.utils.SHA256Utils;
import com.baolishang.springboot.utils.SafeUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by will on 16/9/12.
 */
@Service
public class SellerServiceImpl implements SellerService {

    private static final Logger logger = LoggerFactory.getLogger(SellerServiceImpl.class);

    @Autowired
    private SellerDao sellerDao;

    public Seller doLogin(Seller sellerRequest, HttpServletRequest request) {

            if (sellerRequest.getLoginPwd().length() < 6 || sellerRequest.getLoginPwd().length() > 12)
                throw new BaseException(ResponseCode.password_format_error, HttpStatus.BAD_REQUEST);

            Seller seller = sellerDao.getSellerByLoginName(sellerRequest.getLoginName());
            if(seller == null) {
                throw new BaseException(ResponseCode.login_failed, HttpStatus.UNAUTHORIZED);
            }
            String oldLoginPwd = seller.getLoginPwd();
            if (SafeUtils.isNotEmpty(oldLoginPwd)) {
                //老用户, 需要更新登陆密码加密方式
                String tmpmd5password = MD5Utils.getMD5(sellerRequest.getLoginPwd());
                //密码验证失败
                if (!tmpmd5password.equals(SafeUtils.getString(oldLoginPwd))) {
                    throw new BaseException(ResponseCode.login_failed, HttpStatus.UNAUTHORIZED);
                }

                //旧密码验证成功,更新新密码
                String loginSalt = RandomStringUtils.randomAlphanumeric(32);
                String sha256_password = encryptPassword(sellerRequest.getLoginPwd(), loginSalt);

                seller.setNewLoginPwd(sha256_password);
                seller.setLoginSalt(loginSalt);
                seller.setLoginPwd("");
                sellerDao.save(seller);
            }

            if (!verifyPassword(seller, sellerRequest.getLoginPwd()))
                throw new BaseException(ResponseCode.login_failed, HttpStatus.UNAUTHORIZED);

            setUserIdToSession(request, seller.getId());
            return seller;


    }

    public Seller get(Long userId) {
        return sellerDao.get(userId);
    }


    public Long checkLoginAndReturnUserId(HttpServletRequest request) {
        Object userId = request.getSession().getAttribute("userId");
        //验证登陆信息session是否正确
        if (userId == null) throw new BaseException(ResponseCode.login_required, HttpStatus.UNAUTHORIZED);
        return Long.valueOf(userId.toString());
    }

    public void checkSinaRealNameVerified(Integer sinaRealNameVerified) {
        if (sinaRealNameVerified == null)
            throw new BaseException(ResponseCode.sina_realname_verified_null, HttpStatus.UNAUTHORIZED
            );
    }

    private String encryptPassword(String password, String salt) {
        return SHA256Utils.SHA256Encrypt(password, salt);
    }

    private Boolean verifyPassword(Seller seller, String enteredPassword) {
        String encrypted = encryptPassword(enteredPassword, seller.getLoginSalt());
        return seller.getNewLoginPwd().equals(encrypted);
    }

    public HttpServletRequest setUserIdToSession(HttpServletRequest request, Long id) {
        request.getSession().setAttribute("userId", id);
        Seller seller = sellerDao.get(id);
        request.getSession().setAttribute("name", seller.getName());
        return request;
    }

    public void save(Seller seller) {
        sellerDao.save(seller);
    }


}
