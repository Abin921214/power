package com.jzhl.power.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * pow_device
 * @author 
 */
public class PowDevice implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 公司id (总后台分配公司id)
     */
    private Integer companyId;

    /**
     * 项目id (总后台分配项目id)
     */
    private Integer heId;

    /**
     * 物联小区id
     */
    private Integer devDistrictId;

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * 说明
     */
    private String deviceDesc;

    /**
     * 设备序列号
     */
    private String deviceSerial;

    /**
     * 设备自定义id
     */
    private String deviceCustomId;

    /**
     * 固件版本 1.0 自定义
     */
    private String deviceVer;

    /**
     * 秘钥
     */
    private String deviceKey;

    /**
     * 设备类型(2口 10口 16口 20口)
     */
    private Integer devicePortType;

    /**
     * 设备品牌(立联科技/魔方智联)
     */
    private String deviceBrand;

    /**
     * 设备型号(MF801)
     */
    private String deviceModel;

    /**
     * 端口
     */
    private String networkPort;

    /**
     * 域名
     */
    private String domainName;

    /**
     * 最小功率
     */
    private String minPow;

    /**
     * 最大功率
     */
    private String maxPow;

    /**
     * 最大充电时间(分钟)
     */
    private String maxTime;

    /**
     * 心跳间隔(秒)
     */
    private String heartbeat;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String area;

    /**
     * 街道
     */
    private String street;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 经度
     */
    private BigDecimal longitude;

    /**
     * 纬度
     */
    private BigDecimal latitude;

    /**
     * 在线状态 0在线 1不在线
     */
    private String online;

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

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceDesc() {
        return deviceDesc;
    }

    public void setDeviceDesc(String deviceDesc) {
        this.deviceDesc = deviceDesc;
    }

    public String getDeviceSerial() {
        return deviceSerial;
    }

    public void setDeviceSerial(String deviceSerial) {
        this.deviceSerial = deviceSerial;
    }

    public String getDeviceCustomId() {
        return deviceCustomId;
    }

    public void setDeviceCustomId(String deviceCustomId) {
        this.deviceCustomId = deviceCustomId;
    }

    public String getDeviceVer() {
        return deviceVer;
    }

    public void setDeviceVer(String deviceVer) {
        this.deviceVer = deviceVer;
    }

    public String getDeviceKey() {
        return deviceKey;
    }

    public void setDeviceKey(String deviceKey) {
        this.deviceKey = deviceKey;
    }

    public Integer getDevicePortType() {
        return devicePortType;
    }

    public void setDevicePortType(Integer devicePortType) {
        this.devicePortType = devicePortType;
    }

    public String getDeviceBrand() {
        return deviceBrand;
    }

    public void setDeviceBrand(String deviceBrand) {
        this.deviceBrand = deviceBrand;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getNetworkPort() {
        return networkPort;
    }

    public void setNetworkPort(String networkPort) {
        this.networkPort = networkPort;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getMinPow() {
        return minPow;
    }

    public void setMinPow(String minPow) {
        this.minPow = minPow;
    }

    public String getMaxPow() {
        return maxPow;
    }

    public void setMaxPow(String maxPow) {
        this.maxPow = maxPow;
    }

    public String getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(String maxTime) {
        this.maxTime = maxTime;
    }

    public String getHeartbeat() {
        return heartbeat;
    }

    public void setHeartbeat(String heartbeat) {
        this.heartbeat = heartbeat;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public String getOnline() {
        return online;
    }

    public void setOnline(String online) {
        this.online = online;
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
        PowDevice other = (PowDevice) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getHeId() == null ? other.getHeId() == null : this.getHeId().equals(other.getHeId()))
            && (this.getDevDistrictId() == null ? other.getDevDistrictId() == null : this.getDevDistrictId().equals(other.getDevDistrictId()))
            && (this.getDeviceName() == null ? other.getDeviceName() == null : this.getDeviceName().equals(other.getDeviceName()))
            && (this.getDeviceDesc() == null ? other.getDeviceDesc() == null : this.getDeviceDesc().equals(other.getDeviceDesc()))
            && (this.getDeviceSerial() == null ? other.getDeviceSerial() == null : this.getDeviceSerial().equals(other.getDeviceSerial()))
            && (this.getDeviceCustomId() == null ? other.getDeviceCustomId() == null : this.getDeviceCustomId().equals(other.getDeviceCustomId()))
            && (this.getDeviceVer() == null ? other.getDeviceVer() == null : this.getDeviceVer().equals(other.getDeviceVer()))
            && (this.getDeviceKey() == null ? other.getDeviceKey() == null : this.getDeviceKey().equals(other.getDeviceKey()))
            && (this.getDevicePortType() == null ? other.getDevicePortType() == null : this.getDevicePortType().equals(other.getDevicePortType()))
            && (this.getDeviceBrand() == null ? other.getDeviceBrand() == null : this.getDeviceBrand().equals(other.getDeviceBrand()))
            && (this.getDeviceModel() == null ? other.getDeviceModel() == null : this.getDeviceModel().equals(other.getDeviceModel()))
            && (this.getNetworkPort() == null ? other.getNetworkPort() == null : this.getNetworkPort().equals(other.getNetworkPort()))
            && (this.getDomainName() == null ? other.getDomainName() == null : this.getDomainName().equals(other.getDomainName()))
            && (this.getMinPow() == null ? other.getMinPow() == null : this.getMinPow().equals(other.getMinPow()))
            && (this.getMaxPow() == null ? other.getMaxPow() == null : this.getMaxPow().equals(other.getMaxPow()))
            && (this.getMaxTime() == null ? other.getMaxTime() == null : this.getMaxTime().equals(other.getMaxTime()))
            && (this.getHeartbeat() == null ? other.getHeartbeat() == null : this.getHeartbeat().equals(other.getHeartbeat()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getStreet() == null ? other.getStreet() == null : this.getStreet().equals(other.getStreet()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getLongitude() == null ? other.getLongitude() == null : this.getLongitude().equals(other.getLongitude()))
            && (this.getLatitude() == null ? other.getLatitude() == null : this.getLatitude().equals(other.getLatitude()))
            && (this.getOnline() == null ? other.getOnline() == null : this.getOnline().equals(other.getOnline()))
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
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getHeId() == null) ? 0 : getHeId().hashCode());
        result = prime * result + ((getDevDistrictId() == null) ? 0 : getDevDistrictId().hashCode());
        result = prime * result + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        result = prime * result + ((getDeviceDesc() == null) ? 0 : getDeviceDesc().hashCode());
        result = prime * result + ((getDeviceSerial() == null) ? 0 : getDeviceSerial().hashCode());
        result = prime * result + ((getDeviceCustomId() == null) ? 0 : getDeviceCustomId().hashCode());
        result = prime * result + ((getDeviceVer() == null) ? 0 : getDeviceVer().hashCode());
        result = prime * result + ((getDeviceKey() == null) ? 0 : getDeviceKey().hashCode());
        result = prime * result + ((getDevicePortType() == null) ? 0 : getDevicePortType().hashCode());
        result = prime * result + ((getDeviceBrand() == null) ? 0 : getDeviceBrand().hashCode());
        result = prime * result + ((getDeviceModel() == null) ? 0 : getDeviceModel().hashCode());
        result = prime * result + ((getNetworkPort() == null) ? 0 : getNetworkPort().hashCode());
        result = prime * result + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        result = prime * result + ((getMinPow() == null) ? 0 : getMinPow().hashCode());
        result = prime * result + ((getMaxPow() == null) ? 0 : getMaxPow().hashCode());
        result = prime * result + ((getMaxTime() == null) ? 0 : getMaxTime().hashCode());
        result = prime * result + ((getHeartbeat() == null) ? 0 : getHeartbeat().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getStreet() == null) ? 0 : getStreet().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getLongitude() == null) ? 0 : getLongitude().hashCode());
        result = prime * result + ((getLatitude() == null) ? 0 : getLatitude().hashCode());
        result = prime * result + ((getOnline() == null) ? 0 : getOnline().hashCode());
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
        sb.append(", companyId=").append(companyId);
        sb.append(", heId=").append(heId);
        sb.append(", devDistrictId=").append(devDistrictId);
        sb.append(", deviceName=").append(deviceName);
        sb.append(", deviceDesc=").append(deviceDesc);
        sb.append(", deviceSerial=").append(deviceSerial);
        sb.append(", deviceCustomId=").append(deviceCustomId);
        sb.append(", deviceVer=").append(deviceVer);
        sb.append(", deviceKey=").append(deviceKey);
        sb.append(", devicePortType=").append(devicePortType);
        sb.append(", deviceBrand=").append(deviceBrand);
        sb.append(", deviceModel=").append(deviceModel);
        sb.append(", networkPort=").append(networkPort);
        sb.append(", domainName=").append(domainName);
        sb.append(", minPow=").append(minPow);
        sb.append(", maxPow=").append(maxPow);
        sb.append(", maxTime=").append(maxTime);
        sb.append(", heartbeat=").append(heartbeat);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", area=").append(area);
        sb.append(", street=").append(street);
        sb.append(", address=").append(address);
        sb.append(", longitude=").append(longitude);
        sb.append(", latitude=").append(latitude);
        sb.append(", online=").append(online);
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