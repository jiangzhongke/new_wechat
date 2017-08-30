package com.baolishang.springboot.daos;

import com.baolishang.springboot.models.ReceiveUser;
import com.baolishang.springboot.models.WeChatTemplateDetail;

import java.util.List;

/**
 * Created by hello on 2016/9/12.
 */
public interface WechatModelDao {


    List<ReceiveUser> getUser(String code);
    List<WeChatTemplateDetail> getTemplateDetail(Long templateId);

}
