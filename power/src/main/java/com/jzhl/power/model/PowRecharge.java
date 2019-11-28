package com.jzhl.power.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * pow_recharge
 * @author 
 */
public class PowRecharge implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 充值类型(0后台充值/1总后台充值/2微信充值/3支付宝充值)
     */
    private String rechargeType;

    /**
     * 关联类型(0充值卡 1微信用户 2高超便民用户)
     */
    private String linkType;

    /**
     * 关联id(卡id 微信用户id 高超便民用户)
     */
    private Integer linkId;

    /**
     * 关联信息(卡号 / openid / 用户名)
     */
    private String linkInfo;

    /**
     * 微信支付时间
     */
    private Date wxPayTime;

    /**
     * 支付通知接收时间
     */
    private Date noticeTime;

    /**
     * 系统订单号(微信充值/支付宝充值)
     */
    private String payOrderNo;

    /**
     * 自定义订单号
     */
    private String customNo;

    /**
     * 充值金额/支付金额
     */
    private BigDecimal payment;

    /**
     * 状态（0正常 1停用）
     */
    private String status;

    /**
     * 是否删除（0存在 1删除）
     */
    private String delFlag;

    /**
     * 创建人id
     */
    private Integer buildUserid;

    /**
     * 创建时间
     */
    private Date buildTime;

    /**
     * 修改人id
     */
    private Integer updateUserid;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 公司id
     */
    private Integer companyId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRechargeType() {
        return rechargeType;
    }

    public void setRechargeType(String rechargeType) {
        this.rechargeType = rechargeType;
    }

    public String getLinkType() {
        return linkType;
    }

    public void setLinkType(String linkType) {
        this.linkType = linkType;
    }

    public Integer getLinkId() {
        return linkId;
    }

    public void setLinkId(Integer linkId) {
        this.linkId = linkId;
    }

    public String getLinkInfo() {
        return linkInfo;
    }

    public void setLinkInfo(String linkInfo) {
        this.linkInfo = linkInfo;
    }

    public Date getWxPayTime() {
        return wxPayTime;
    }

    public void setWxPayTime(Date wxPayTime) {
        this.wxPayTime = wxPayTime;
    }

    public Date getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(Date noticeTime) {
        this.noticeTime = noticeTime;
    }

    public String getPayOrderNo() {
        return payOrderNo;
    }

    public void setPayOrderNo(String payOrderNo) {
        this.payOrderNo = payOrderNo;
    }

    public String getCustomNo() {
        return customNo;
    }

    public void setCustomNo(String customNo) {
        this.customNo = customNo;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public Integer getBuildUserid() {
        return buildUserid;
    }

    public void setBuildUserid(Integer buildUserid) {
        this.buildUserid = buildUserid;
    }

    public Date getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(Date buildTime) {
        this.buildTime = buildTime;
    }

    public Integer getUpdateUserid() {
        return updateUserid;
    }

    public void setUpdateUserid(Integer updateUserid) {
        this.updateUserid = updateUserid;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        PowRecharge other = (PowRecharge) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRechargeType() == null ? other.getRechargeType() == null : this.getRechargeType().equals(other.getRechargeType()))
            && (this.getLinkType() == null ? other.getLinkType() == null : this.getLinkType().equals(other.getLinkType()))
            && (this.getLinkId() == null ? other.getLinkId() == null : this.getLinkId().equals(other.getLinkId()))
            && (this.getLinkInfo() == null ? other.getLinkInfo() == null : this.getLinkInfo().equals(other.getLinkInfo()))
            && (this.getWxPayTime() == null ? other.getWxPayTime() == null : this.getWxPayTime().equals(other.getWxPayTime()))
            && (this.getNoticeTime() == null ? other.getNoticeTime() == null : this.getNoticeTime().equals(other.getNoticeTime()))
            && (this.getPayOrderNo() == null ? other.getPayOrderNo() == null : this.getPayOrderNo().equals(other.getPayOrderNo()))
            && (this.getCustomNo() == null ? other.getCustomNo() == null : this.getCustomNo().equals(other.getCustomNo()))
            && (this.getPayment() == null ? other.getPayment() == null : this.getPayment().equals(other.getPayment()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getDelFlag() == null ? other.getDelFlag() == null : this.getDelFlag().equals(other.getDelFlag()))
            && (this.getBuildUserid() == null ? other.getBuildUserid() == null : this.getBuildUserid().equals(other.getBuildUserid()))
            && (this.getBuildTime() == null ? other.getBuildTime() == null : this.getBuildTime().equals(other.getBuildTime()))
            && (this.getUpdateUserid() == null ? other.getUpdateUserid() == null : this.getUpdateUserid().equals(other.getUpdateUserid()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRechargeType() == null) ? 0 : getRechargeType().hashCode());
        result = prime * result + ((getLinkType() == null) ? 0 : getLinkType().hashCode());
        result = prime * result + ((getLinkId() == null) ? 0 : getLinkId().hashCode());
        result = prime * result + ((getLinkInfo() == null) ? 0 : getLinkInfo().hashCode());
        result = prime * result + ((getWxPayTime() == null) ? 0 : getWxPayTime().hashCode());
        result = prime * result + ((getNoticeTime() == null) ? 0 : getNoticeTime().hashCode());
        result = prime * result + ((getPayOrderNo() == null) ? 0 : getPayOrderNo().hashCode());
        result = prime * result + ((getCustomNo() == null) ? 0 : getCustomNo().hashCode());
        result = prime * result + ((getPayment() == null) ? 0 : getPayment().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getDelFlag() == null) ? 0 : getDelFlag().hashCode());
        result = prime * result + ((getBuildUserid() == null) ? 0 : getBuildUserid().hashCode());
        result = prime * result + ((getBuildTime() == null) ? 0 : getBuildTime().hashCode());
        result = prime * result + ((getUpdateUserid() == null) ? 0 : getUpdateUserid().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", rechargeType=").append(rechargeType);
        sb.append(", linkType=").append(linkType);
        sb.append(", linkId=").append(linkId);
        sb.append(", linkInfo=").append(linkInfo);
        sb.append(", wxPayTime=").append(wxPayTime);
        sb.append(", noticeTime=").append(noticeTime);
        sb.append(", payOrderNo=").append(payOrderNo);
        sb.append(", customNo=").append(customNo);
        sb.append(", payment=").append(payment);
        sb.append(", status=").append(status);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", buildUserid=").append(buildUserid);
        sb.append(", buildTime=").append(buildTime);
        sb.append(", updateUserid=").append(updateUserid);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", remark=").append(remark);
        sb.append(", companyId=").append(companyId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}