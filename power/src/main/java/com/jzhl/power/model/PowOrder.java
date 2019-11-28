package com.jzhl.power.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * pow_order
 * @author 
 */
public class PowOrder implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 支付订单编号
     */
    private String orderPay;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 下单途径 (0微信/1充电卡/2高超便民)
     */
    private String orderWay;

    /**
     * 设备id
     */
    private Integer deviceId;

    /**
     * 端口id
     */
    private Integer devicePortId;

    /**
     * 端口号
     */
    private Integer port;

    /**
     * 公司id
     */
    private Integer companyId;

    /**
     * 项目id
     */
    private Integer heId;

    /**
     * 设备小区id
     */
    private Integer devDistrictId;

    /**
     * 用户id (0无关联用户/微信用户/高超便民用户)
     */
    private Integer userId;

    /**
     * 用户类型 (0无关联用户/1微信用户/1高超便民用户)
     */
    private String userType;

    /**
     * 充电卡id
     */
    private Integer cardId;

    /**
     * 卡号
     */
    private String cardNo;

    /**
     * 订单开始时间
     */
    private Date startTime;

    /**
     * 订单结束时间
     */
    private Date endTime;

    /**
     * 订单支付金额
     */
    private BigDecimal payFee;

    /**
     * 自动结算后退回金额
     */
    private BigDecimal returnFee;

    /**
     * 单位金额
     */
    private BigDecimal unitFee;

    /**
     * 单位时间 分钟
     */
    private Integer unitMin;

    /**
     * 0不退还金额 1退还多余金额
     */
    private String returnFeeStatus;

    /**
     * 0不允许手动结束 1允许手动结束
     */
    private String selfHelpCloseStatus;

    /**
     * 订单状态 (0等待充电 1充电中 2充电完成 3充电失败)
     */
    private String orderStatus;

    /**
     * 结束状态 (1正常 2指令结束 3负载丢失 4时间到结束 5过载结束 6涓流充电时掉电 9复位重启结束充电)
     */
    private String endStatus;

    /**
     * 订单总电量
     */
    private String sumPower;

    /**
     * 备用字段1
     */
    private String reserveOne;

    /**
     * 备用字段2
     */
    private String reserveTwo;

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

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderPay() {
        return orderPay;
    }

    public void setOrderPay(String orderPay) {
        this.orderPay = orderPay;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderWay() {
        return orderWay;
    }

    public void setOrderWay(String orderWay) {
        this.orderWay = orderWay;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getDevicePortId() {
        return devicePortId;
    }

    public void setDevicePortId(Integer devicePortId) {
        this.devicePortId = devicePortId;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getHeId() {
        return heId;
    }

    public void setHeId(Integer heId) {
        this.heId = heId;
    }

    public Integer getDevDistrictId() {
        return devDistrictId;
    }

    public void setDevDistrictId(Integer devDistrictId) {
        this.devDistrictId = devDistrictId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public BigDecimal getPayFee() {
        return payFee;
    }

    public void setPayFee(BigDecimal payFee) {
        this.payFee = payFee;
    }

    public BigDecimal getReturnFee() {
        return returnFee;
    }

    public void setReturnFee(BigDecimal returnFee) {
        this.returnFee = returnFee;
    }

    public BigDecimal getUnitFee() {
        return unitFee;
    }

    public void setUnitFee(BigDecimal unitFee) {
        this.unitFee = unitFee;
    }

    public Integer getUnitMin() {
        return unitMin;
    }

    public void setUnitMin(Integer unitMin) {
        this.unitMin = unitMin;
    }

    public String getReturnFeeStatus() {
        return returnFeeStatus;
    }

    public void setReturnFeeStatus(String returnFeeStatus) {
        this.returnFeeStatus = returnFeeStatus;
    }

    public String getSelfHelpCloseStatus() {
        return selfHelpCloseStatus;
    }

    public void setSelfHelpCloseStatus(String selfHelpCloseStatus) {
        this.selfHelpCloseStatus = selfHelpCloseStatus;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getEndStatus() {
        return endStatus;
    }

    public void setEndStatus(String endStatus) {
        this.endStatus = endStatus;
    }

    public String getSumPower() {
        return sumPower;
    }

    public void setSumPower(String sumPower) {
        this.sumPower = sumPower;
    }

    public String getReserveOne() {
        return reserveOne;
    }

    public void setReserveOne(String reserveOne) {
        this.reserveOne = reserveOne;
    }

    public String getReserveTwo() {
        return reserveTwo;
    }

    public void setReserveTwo(String reserveTwo) {
        this.reserveTwo = reserveTwo;
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
        PowOrder other = (PowOrder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderPay() == null ? other.getOrderPay() == null : this.getOrderPay().equals(other.getOrderPay()))
            && (this.getOrderNo() == null ? other.getOrderNo() == null : this.getOrderNo().equals(other.getOrderNo()))
            && (this.getOrderWay() == null ? other.getOrderWay() == null : this.getOrderWay().equals(other.getOrderWay()))
            && (this.getDeviceId() == null ? other.getDeviceId() == null : this.getDeviceId().equals(other.getDeviceId()))
            && (this.getDevicePortId() == null ? other.getDevicePortId() == null : this.getDevicePortId().equals(other.getDevicePortId()))
            && (this.getPort() == null ? other.getPort() == null : this.getPort().equals(other.getPort()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getHeId() == null ? other.getHeId() == null : this.getHeId().equals(other.getHeId()))
            && (this.getDevDistrictId() == null ? other.getDevDistrictId() == null : this.getDevDistrictId().equals(other.getDevDistrictId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getUserType() == null ? other.getUserType() == null : this.getUserType().equals(other.getUserType()))
            && (this.getCardId() == null ? other.getCardId() == null : this.getCardId().equals(other.getCardId()))
            && (this.getCardNo() == null ? other.getCardNo() == null : this.getCardNo().equals(other.getCardNo()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getPayFee() == null ? other.getPayFee() == null : this.getPayFee().equals(other.getPayFee()))
            && (this.getReturnFee() == null ? other.getReturnFee() == null : this.getReturnFee().equals(other.getReturnFee()))
            && (this.getUnitFee() == null ? other.getUnitFee() == null : this.getUnitFee().equals(other.getUnitFee()))
            && (this.getUnitMin() == null ? other.getUnitMin() == null : this.getUnitMin().equals(other.getUnitMin()))
            && (this.getReturnFeeStatus() == null ? other.getReturnFeeStatus() == null : this.getReturnFeeStatus().equals(other.getReturnFeeStatus()))
            && (this.getSelfHelpCloseStatus() == null ? other.getSelfHelpCloseStatus() == null : this.getSelfHelpCloseStatus().equals(other.getSelfHelpCloseStatus()))
            && (this.getOrderStatus() == null ? other.getOrderStatus() == null : this.getOrderStatus().equals(other.getOrderStatus()))
            && (this.getEndStatus() == null ? other.getEndStatus() == null : this.getEndStatus().equals(other.getEndStatus()))
            && (this.getSumPower() == null ? other.getSumPower() == null : this.getSumPower().equals(other.getSumPower()))
            && (this.getReserveOne() == null ? other.getReserveOne() == null : this.getReserveOne().equals(other.getReserveOne()))
            && (this.getReserveTwo() == null ? other.getReserveTwo() == null : this.getReserveTwo().equals(other.getReserveTwo()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getDelFlag() == null ? other.getDelFlag() == null : this.getDelFlag().equals(other.getDelFlag()))
            && (this.getBuildUserid() == null ? other.getBuildUserid() == null : this.getBuildUserid().equals(other.getBuildUserid()))
            && (this.getBuildTime() == null ? other.getBuildTime() == null : this.getBuildTime().equals(other.getBuildTime()))
            && (this.getUpdateUserid() == null ? other.getUpdateUserid() == null : this.getUpdateUserid().equals(other.getUpdateUserid()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderPay() == null) ? 0 : getOrderPay().hashCode());
        result = prime * result + ((getOrderNo() == null) ? 0 : getOrderNo().hashCode());
        result = prime * result + ((getOrderWay() == null) ? 0 : getOrderWay().hashCode());
        result = prime * result + ((getDeviceId() == null) ? 0 : getDeviceId().hashCode());
        result = prime * result + ((getDevicePortId() == null) ? 0 : getDevicePortId().hashCode());
        result = prime * result + ((getPort() == null) ? 0 : getPort().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getHeId() == null) ? 0 : getHeId().hashCode());
        result = prime * result + ((getDevDistrictId() == null) ? 0 : getDevDistrictId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserType() == null) ? 0 : getUserType().hashCode());
        result = prime * result + ((getCardId() == null) ? 0 : getCardId().hashCode());
        result = prime * result + ((getCardNo() == null) ? 0 : getCardNo().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getPayFee() == null) ? 0 : getPayFee().hashCode());
        result = prime * result + ((getReturnFee() == null) ? 0 : getReturnFee().hashCode());
        result = prime * result + ((getUnitFee() == null) ? 0 : getUnitFee().hashCode());
        result = prime * result + ((getUnitMin() == null) ? 0 : getUnitMin().hashCode());
        result = prime * result + ((getReturnFeeStatus() == null) ? 0 : getReturnFeeStatus().hashCode());
        result = prime * result + ((getSelfHelpCloseStatus() == null) ? 0 : getSelfHelpCloseStatus().hashCode());
        result = prime * result + ((getOrderStatus() == null) ? 0 : getOrderStatus().hashCode());
        result = prime * result + ((getEndStatus() == null) ? 0 : getEndStatus().hashCode());
        result = prime * result + ((getSumPower() == null) ? 0 : getSumPower().hashCode());
        result = prime * result + ((getReserveOne() == null) ? 0 : getReserveOne().hashCode());
        result = prime * result + ((getReserveTwo() == null) ? 0 : getReserveTwo().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getDelFlag() == null) ? 0 : getDelFlag().hashCode());
        result = prime * result + ((getBuildUserid() == null) ? 0 : getBuildUserid().hashCode());
        result = prime * result + ((getBuildTime() == null) ? 0 : getBuildTime().hashCode());
        result = prime * result + ((getUpdateUserid() == null) ? 0 : getUpdateUserid().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderPay=").append(orderPay);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", orderWay=").append(orderWay);
        sb.append(", deviceId=").append(deviceId);
        sb.append(", devicePortId=").append(devicePortId);
        sb.append(", port=").append(port);
        sb.append(", companyId=").append(companyId);
        sb.append(", heId=").append(heId);
        sb.append(", devDistrictId=").append(devDistrictId);
        sb.append(", userId=").append(userId);
        sb.append(", userType=").append(userType);
        sb.append(", cardId=").append(cardId);
        sb.append(", cardNo=").append(cardNo);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", payFee=").append(payFee);
        sb.append(", returnFee=").append(returnFee);
        sb.append(", unitFee=").append(unitFee);
        sb.append(", unitMin=").append(unitMin);
        sb.append(", returnFeeStatus=").append(returnFeeStatus);
        sb.append(", selfHelpCloseStatus=").append(selfHelpCloseStatus);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", endStatus=").append(endStatus);
        sb.append(", sumPower=").append(sumPower);
        sb.append(", reserveOne=").append(reserveOne);
        sb.append(", reserveTwo=").append(reserveTwo);
        sb.append(", status=").append(status);
        sb.append(", delFlag=").append(delFlag);
        sb.append(", buildUserid=").append(buildUserid);
        sb.append(", buildTime=").append(buildTime);
        sb.append(", updateUserid=").append(updateUserid);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}