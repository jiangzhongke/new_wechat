package com.baolishang.springboot.models;

import com.baolishang.springboot.bases.BaseModel;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by will on 2016/9/6.
 */
@Entity
@Table(name="t_seller")
public class Seller extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id",unique = true, nullable = false)
    private Long id;
    /**
     * t_seller.Name=名称
     */
    @Column(name="Name")
    private String name;
    /**
     * t_seller.Code=代码
     */
    @Column(name="Code")
    private String code;
    /**
     * t_seller.LoginName=登录名
     */
    @Column(name="LoginName")
    private String loginName;
    /**
     *t_seller.LoginPwd=登录密码
     */
    @Column(name="loginPwd")
    private String loginPwd;
    /**
     *t_seller.LoginPwd=登录密码
     */
    @Column(name="newLoginPwd")
    private String newLoginPwd;
    /**
     *t_seller.loginSalt=盐
     */
    @Column(name="loginSalt")
    private String loginSalt;
    /**
     *t_seller.SinaFundVerified=新浪会员激活标记位,0:未激活;1:激活
     */
    @Column(name="SinaFundVerified")
    private Integer sinaFundVerified;
    /**
     * t_seller.SinaBalance=新浪余额
     */
    @Column(name="SinaBalance")
    private BigDecimal sinaBalance;
    /**
     *t_seller.SinaAvailableAmount=新浪可用余额
     */
    @Column(name="SinaAvailableAmount")
    private BigDecimal sinaAvailableAmount;
    /**
     *t_seller.SinaFreezenAmount=新浪冻结金额
     */
    @Column(name="SinaFreezenAmount")
    private BigDecimal sinaFreezenAmount;
    /**
     *t_seller.SinaRealNameVerified=新浪账户认证
     */
    @Column(name="SinaRealNameVerified")
    private Integer sinaRealNameVerified;
    /**
     *t_seller.ActiveSinaShortCardId=新浪绑卡ID号
     */
    @Column(name="ActiveSinaShortCardId")
    private String activeSinaShortCardId;
    /**
     *t_seller.SinaConfirmStatus=新浪审核状态,0:未通过;1:通过;
     */
    @Column(name="SinaConfirmStatus")
    private Integer sinaConfirmStatus;
    /**
     *t_seller.SinaPhoneVerified=新浪手机认证
     */
    @Column(name="SinaPhoneVerified")
    private Integer sinaPhoneVerified;
    /**
     *t_seller.SinaConfirmDesp=新浪返回描述信息
     */
    @Column(name="SinaConfirmDesp")
    private String sinaConfirmDesp;
    /**
     *t_seller.SinaCrackerDay=存钱罐昨日收益
     */
    @Column(name="SinaCrackerDay")
    private BigDecimal sinaCrackerDay;
    /**
     *t_seller.SinaCrackerMonth=存钱罐一月收益
     */
    @Column(name="SinaCrackerMonth")
    private BigDecimal sinaCrackerMonth;
    /**
     *t_seller.SinaCrackerTotal=存钱罐总收益
     */
    @Column(name="SinaCrackerTotal")
    private BigDecimal sinaCrackerTotal;
    /**
     *t_seller.SinaPassword=支付密码
     */
    @Column(name="SinaPassword")
    private String sinaPassword;
    /**
     *t_seller.FullName=全称
     */
    @Column(name="FullName")
    private String fullName;
    /**
     *t_seller.ZipCode=邮编
     */
    @Column(name="ZipCode")
    private String zipCode;
    /**
     *Address=地址
     */
    @Column(name="Address")
    private String address;
    /**
     *LegalPerson=法人
     */
    @Column(name="LegalPerson")
    private String legalPerson;
    /**
     *LegalIdNo=法人身份证
     */
    @Column(name="LegalIdNo")
    private String legalIdNo;
    /**
     *CorpType=公司性质,1:国营企业;2:民营企业;3:外资企业;4:合资企业;5:其他;
     */
    @Column(name="CorpType")
    private Integer corpType;
    /**
     *BankLicense=开户银行许可证
     */
    @Column(name="BankLicense")
    private String bankLicense;
    /**
     *BussLicense=营业执照号
     */
    @Column(name="BussLicense")
    private String bussLicense;
    /**
     *website=企业网址
     */
    @Column(name="website")
    private String website;
    /**
     *LicenseAddress=营业执照所在地
     */
    @Column(name="LicenseAddress")
    private String licenseAddress;
    /**
     *LicenseExpireDate=执照过期日（营业期限）
     */
    @Column(name="LicenseExpireDate")
    private String licenseExpireDate;
    /**
     *BusinessScope=营业范围
     */
    @Column(name="BusinessScope")
    private String businessScope;
    /**
     *Summary=企业简介
     */
    @Column(name="Summary")
    private String summary;
    /**
     *LegalPersonPhone=法人手机号码
     */
    @Column(name="LegalPersonPhone")
    private String legalPersonPhone;
    /**
     *Province=开户行省份
     */
    @Column(name="Province")
    private String province;
    /**
     *City=开户行城市
     */
    @Column(name="City")
    private String city;
    /**
     *BankBranch=支行名称
     */
    @Column(name="BankBranch")
    private String bankBranch;
    /**
     *OrgCreditNo=机构信用代码
     */
    @Column(name="OrgCreditNo")
    private String orgCreditNo;
    /**
     *RegCaptial=注册资金
     */
    @Column(name="RegCaptial")
    private String regCaptial;
    /**
     *TaxRegNbr=税务登记号
     */
    @Column(name="TaxRegNbr")
    private String taxRegNbr;
    /**
     *Bank=开户行
     */
    @Column(name="Bank")
    private String bank;
    /**
     *BankAccount=银行账号
     */
    @Column(name="BankAccount")
    private String bankAccount;
    /**
     *FundsOrgID=资金托管机构
     */
    @Column(name="FundsOrgID")
    private String fundsOrgID;
    /**
     *RegAddr=注册地址
     */
    @Column(name="RegAddr")
    private String regAddr;
    /**
     *RegPhone=注册登记电话
     */
    @Column(name="RegPhone")
    private String regPhone;
    /**
     *OrgaCode=组织代码
     */
    @Column(name="OrgaCode")
    private String orgaCode;
    /**
     *ContactName=联系人
     */
    @Column(name="ContactName")
    private String contactName;
    /**
     *ContactPhone=联系电话
     */
    @Column(name="ContactPhone")
    private String contactPhone;
    /**
     *ContactMobile=联系人手机
     */
    @Column(name="ContactMobile")
    private String contactMobile;
    /**
     *ContactEmail=联系人邮箱
     */
    @Column(name="ContactEmail")
    private String contactEmail;
    /**
     *CreditLevel=信用级别
     */
    @Column(name="CreditLevel")
    private String creditLevel;
    /**
     *Balance=账户余额
     */
    @Column(name="Balance")
    private BigDecimal  Balance;
    /**
     *AvailableAmount=可用额度
     */
    @Column(name="AvailableAmount")
    private BigDecimal availableAmount;
    /**
     *FreezenAmount=冻结金额
     */
    @Column(name="FreezenAmount")
    private BigDecimal  freezenAmount;
    /**
     *ActiveBankCode=绑定银行代码
     */
    @Column(name="ActiveBankCode")
    private String activeBankCode;
    /**
     *ActiveCardNo=绑定银行卡号
     */
    @Column(name="ActiveCardNo")
    private String activeCardNo;
    /**
     *ActiveCardStatus=绑定卡状态
     */
    @Column(name="ActiveCardStatus")
    private Byte activeCardStatus;
    /**
     *t_seller.AutoRepayment=自动还款,0:否;1:是;
     */
    @Column(name="AutoRepayment")
    private Byte autoRepayment;
    /**
     *t_seller.Status=状态 0:无效;1:生效;
     */
    @Column(name="Status")
    private Byte status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getNewLoginPwd() {
        return newLoginPwd;
    }

    public void setNewLoginPwd(String newLoginPwd) {
        this.newLoginPwd = newLoginPwd;
    }

    public String getLoginSalt() {
        return loginSalt;
    }

    public void setLoginSalt(String loginSalt) {
        this.loginSalt = loginSalt;
    }

    public Integer getSinaFundVerified() {
        return sinaFundVerified;
    }

    public void setSinaFundVerified(Integer sinaFundVerified) {
        this.sinaFundVerified = sinaFundVerified;
    }

    public BigDecimal getSinaBalance() {
        return sinaBalance;
    }

    public void setSinaBalance(BigDecimal sinaBalance) {
        this.sinaBalance = sinaBalance;
    }

    public BigDecimal getSinaAvailableAmount() {
        return sinaAvailableAmount;
    }

    public void setSinaAvailableAmount(BigDecimal sinaAvailableAmount) {
        this.sinaAvailableAmount = sinaAvailableAmount;
    }

    public BigDecimal getSinaFreezenAmount() {
        return sinaFreezenAmount;
    }

    public void setSinaFreezenAmount(BigDecimal sinaFreezenAmount) {
        this.sinaFreezenAmount = sinaFreezenAmount;
    }

    public Integer getSinaRealNameVerified() {
        return sinaRealNameVerified;
    }

    public void setSinaRealNameVerified(Integer sinaRealNameVerified) {
        this.sinaRealNameVerified = sinaRealNameVerified;
    }

    public String getActiveSinaShortCardId() {
        return activeSinaShortCardId;
    }

    public void setActiveSinaShortCardId(String activeSinaShortCardId) {
        this.activeSinaShortCardId = activeSinaShortCardId;
    }

    public Integer getSinaConfirmStatus() {
        return sinaConfirmStatus;
    }

    public void setSinaConfirmStatus(Integer sinaConfirmStatus) {
        this.sinaConfirmStatus = sinaConfirmStatus;
    }

    public Integer getSinaPhoneVerified() {
        return sinaPhoneVerified;
    }

    public void setSinaPhoneVerified(Integer sinaPhoneVerified) {
        this.sinaPhoneVerified = sinaPhoneVerified;
    }

    public String getSinaConfirmDesp() {
        return sinaConfirmDesp;
    }

    public void setSinaConfirmDesp(String sinaConfirmDesp) {
        this.sinaConfirmDesp = sinaConfirmDesp;
    }

    public BigDecimal getSinaCrackerDay() {
        return sinaCrackerDay;
    }

    public void setSinaCrackerDay(BigDecimal sinaCrackerDay) {
        this.sinaCrackerDay = sinaCrackerDay;
    }

    public BigDecimal getSinaCrackerMonth() {
        return sinaCrackerMonth;
    }

    public void setSinaCrackerMonth(BigDecimal sinaCrackerMonth) {
        this.sinaCrackerMonth = sinaCrackerMonth;
    }

    public BigDecimal getSinaCrackerTotal() {
        return sinaCrackerTotal;
    }

    public void setSinaCrackerTotal(BigDecimal sinaCrackerTotal) {
        this.sinaCrackerTotal = sinaCrackerTotal;
    }

    public String getSinaPassword() {
        return sinaPassword;
    }

    public void setSinaPassword(String sinaPassword) {
        this.sinaPassword = sinaPassword;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    public String getLegalIdNo() {
        return legalIdNo;
    }

    public void setLegalIdNo(String legalIdNo) {
        this.legalIdNo = legalIdNo;
    }

    public Integer getCorpType() {
        return corpType;
    }

    public void setCorpType(Integer corpType) {
        this.corpType = corpType;
    }

    public String getBankLicense() {
        return bankLicense;
    }

    public void setBankLicense(String bankLicense) {
        this.bankLicense = bankLicense;
    }

    public String getBussLicense() {
        return bussLicense;
    }

    public void setBussLicense(String bussLicense) {
        this.bussLicense = bussLicense;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLicenseAddress() {
        return licenseAddress;
    }

    public void setLicenseAddress(String licenseAddress) {
        this.licenseAddress = licenseAddress;
    }

    public String getLicenseExpireDate() {
        return licenseExpireDate;
    }

    public void setLicenseExpireDate(String licenseExpireDate) {
        this.licenseExpireDate = licenseExpireDate;
    }

    public String getBusinessScope() {
        return businessScope;
    }

    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getLegalPersonPhone() {
        return legalPersonPhone;
    }

    public void setLegalPersonPhone(String legalPersonPhone) {
        this.legalPersonPhone = legalPersonPhone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    public String getOrgCreditNo() {
        return orgCreditNo;
    }

    public void setOrgCreditNo(String orgCreditNo) {
        this.orgCreditNo = orgCreditNo;
    }

    public String getRegCaptial() {
        return regCaptial;
    }

    public void setRegCaptial(String regCaptial) {
        this.regCaptial = regCaptial;
    }

    public String getTaxRegNbr() {
        return taxRegNbr;
    }

    public void setTaxRegNbr(String taxRegNbr) {
        this.taxRegNbr = taxRegNbr;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getFundsOrgID() {
        return fundsOrgID;
    }

    public void setFundsOrgID(String fundsOrgID) {
        this.fundsOrgID = fundsOrgID;
    }

    public String getRegAddr() {
        return regAddr;
    }

    public void setRegAddr(String regAddr) {
        this.regAddr = regAddr;
    }

    public String getRegPhone() {
        return regPhone;
    }

    public void setRegPhone(String regPhone) {
        this.regPhone = regPhone;
    }

    public String getOrgaCode() {
        return orgaCode;
    }

    public void setOrgaCode(String orgaCode) {
        this.orgaCode = orgaCode;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getCreditLevel() {
        return creditLevel;
    }

    public void setCreditLevel(String creditLevel) {
        this.creditLevel = creditLevel;
    }

    public BigDecimal getBalance() {
        return Balance;
    }

    public void setBalance(BigDecimal balance) {
        Balance = balance;
    }

    public BigDecimal getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(BigDecimal availableAmount) {
        this.availableAmount = availableAmount;
    }

    public BigDecimal getFreezenAmount() {
        return freezenAmount;
    }

    public void setFreezenAmount(BigDecimal freezenAmount) {
        this.freezenAmount = freezenAmount;
    }

    public String getActiveBankCode() {
        return activeBankCode;
    }

    public void setActiveBankCode(String activeBankCode) {
        this.activeBankCode = activeBankCode;
    }

    public String getActiveCardNo() {
        return activeCardNo;
    }

    public void setActiveCardNo(String activeCardNo) {
        this.activeCardNo = activeCardNo;
    }

    public Byte getActiveCardStatus() {
        return activeCardStatus;
    }

    public void setActiveCardStatus(Byte activeCardStatus) {
        this.activeCardStatus = activeCardStatus;
    }

    public Byte getAutoRepayment() {
        return autoRepayment;
    }

    public void setAutoRepayment(Byte autoRepayment) {
        this.autoRepayment = autoRepayment;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Seller() {
    }

    public Seller(String loginName, String loginPwd) {
        this.loginName = loginName;
        this.loginPwd = loginPwd;
    }

    public Seller(Long id, String loginName, String loginPwd) {
        this.id = id;
        this.loginName = loginName;
        this.loginPwd = loginPwd;
    }

    public Seller(Long id, String loginName, String loginPwd, String newLoginPwd,String loginSalt) {
        this.id = id;
        this.loginName = loginName;
        this.loginPwd = loginPwd;
        this.newLoginPwd = newLoginPwd;
        this.loginSalt = loginSalt;
    }

    public Seller(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Seller(Long id, String code,Integer sinaFundVerified) {
        this.id = id;
        this.code = code;
        this.sinaFundVerified = sinaFundVerified;
    }

    public Seller(Long id, String name, String code, Byte status) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.status = status;
    }
}
