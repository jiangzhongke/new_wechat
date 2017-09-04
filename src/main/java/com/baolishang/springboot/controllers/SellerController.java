package com.baolishang.springboot.controllers;

import com.baolishang.springboot.beans.ResponseCode;
import com.baolishang.springboot.configs.SystemConfiguration;
import com.baolishang.springboot.exceptions.BaseException;
import com.baolishang.springboot.models.ReceiveUser;
import com.baolishang.springboot.models.WeChatTemplateDetail;
import com.baolishang.springboot.services.WechatModelService;
import com.baolishang.springboot.utils.ResponseUtils;
import com.baolishang.springboot.utils.SafeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by will on 2016/9/6.
 */
@Controller
@RequestMapping(value = "/seller")
public class SellerController {
    private static final Logger logger = LoggerFactory.getLogger(SellerController.class);

    @Autowired
    private WechatModelService wechatModelService;
    @Scope("prototype")
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(ModelAndView modelAndView, HttpServletRequest request) throws Exception {
        try {
            modelAndView.setViewName("login/login");
            modelAndView.addObject("public_key", SystemConfiguration.get("RSA_PUBLIC_ROUTE"));
            return modelAndView;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("", e);
            return null;
        }
    }

    @Scope("prototype")
    @RequestMapping(value = "/do_login", method = RequestMethod.POST)
    public ResponseEntity userLogin(@RequestParam(value = "login_name", required = true) String loginName,
                                    @RequestParam(value = "login_password", required = true) String loginPassword,
                                    @RequestParam(value = "verify", required = true) String verify,
                                    HttpServletRequest request, HttpServletResponse response
    ) throws Exception {
        logger.info("login_name={}", loginName);
        logger.info("==================================================");

        List<ReceiveUser> list2 = wechatModelService.getUser("DD_001");
        ReceiveUser r1 = list2.get(1);
        logger.info(r1.toString());
        logger.info("list2=="+list2.toString());

        List<WeChatTemplateDetail> list1 = wechatModelService.getTemplateDetail(SafeUtils.getLong(r1.getWeChatId()));
        WeChatTemplateDetail d1 = list1.get(1);
        logger.info(d1.toString());
        logger.info("list1"+list1.toString());

        logger.info("==================================================");
        return ResponseUtils.restResponse("login_success", "登录成功", HttpStatus.OK);
    }


    @Scope("prototype")
    @RequestMapping(value = "logout", method = RequestMethod.POST)
    public ResponseEntity logout(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        try {
            request.getSession().removeAttribute("userId");
            request.getSession().removeAttribute("name");
            return ResponseUtils.restResponse("logout_success", "登出成功", HttpStatus.OK);
        } catch (Exception e) {
            logger.info("", e);
            throw new BaseException(ResponseCode.net_failed, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
