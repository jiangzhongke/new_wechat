package com.baolishang.springboot.beans;

/**
 * Created by will on 2016/9/6.
 */
public enum ResponseCode {

    success("success", "成功"),
    login_required("login_first","请先登录"),
    validation_code_not_correct("validation_code_not_correct", "验证码不正确"),
    password_format_error("password_format_error", "密码格式错误"),
    net_failed("net_failed", "网络延迟，提交失败"),
    captcha_error("withdraw_amount_error", "验证码错误"),
    login_failed("login_failed", "用户名或密码错误"),
    sina_realname_verified_null("realname_verify_first","请在新浪实名注册");


    private String code;
    private String 	desc;
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    ResponseCode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
