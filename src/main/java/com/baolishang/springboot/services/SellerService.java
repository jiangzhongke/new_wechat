package com.baolishang.springboot.services;

import com.baolishang.springboot.models.Seller;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by hello on 2016/9/12.
 */
public interface SellerService{


    Seller doLogin(Seller seller, HttpServletRequest request);

    Seller get(Long sellerId);


    void save(Seller seller);

}
