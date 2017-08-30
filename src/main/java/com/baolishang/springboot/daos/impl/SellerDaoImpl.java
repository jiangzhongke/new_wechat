package com.baolishang.springboot.daos.impl;

import com.baolishang.springboot.daos.SellerDao;
import com.baolishang.springboot.exceptions.ObjectNotFoundException;
import com.baolishang.springboot.models.Seller;
import com.baolishang.springboot.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.baolishang.springboot.utils.ReflectUtils.getGenericName;

/**
 * Created by hello on 2016/9/12.
 */
@Repository
public class SellerDaoImpl implements SellerDao {

    @Autowired
    private SellerRepository sellerRepository;
    @Override
    public Seller getSellerByLoginName(String loginName){
        Seller seller = sellerRepository.getSellerByLoginName(loginName);
//        checkExists(seller);
        return seller;
    }


    @Override
    public Seller get(Long sellerId){
        return sellerRepository.getOne(sellerId);
    }

    @Override
    public void save(Seller seller){
        sellerRepository.save(seller);
    }

    protected void checkExists(Object object){
        if (object == null) throw new ObjectNotFoundException(getGenericName(this.getClass(), 0));
    }


}
