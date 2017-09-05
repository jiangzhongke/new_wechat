package com.baolishang.springboot.daos;

import com.baolishang.springboot.models.Seller;

/**
 * Created by hello on 2016/9/12.
 */
public interface ReceiverDao {

    Seller getSellerByLoginName(String loginName);

    Seller get(Long sellerId);

    void save(Seller seller);

}
