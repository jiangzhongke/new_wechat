package com.baolishang.springboot.repositories;

import com.baolishang.springboot.models.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by hello on 2016/9/12.
 */
@Transactional
public interface SellerRepository extends JpaRepository<Seller, Long> {

    Seller getOne(Long userId);

    Seller save(Seller seller);

    @Query("select st from Seller st where st.loginName= :loginName ")
    Seller getSellerByLoginName(@Param("loginName") String loginName);
}
