package com.jzhl.power.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PowDeviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public PowDeviceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andHeIdIsNull() {
            addCriterion("he_id is null");
            return (Criteria) this;
        }

        public Criteria andHeIdIsNotNull() {
            addCriterion("he_id is not null");
            return (Criteria) this;
        }

        public Criteria andHeIdEqualTo(Integer value) {
            addCriterion("he_id =", value, "heId");
            return (Criteria) this;
        }

        public Criteria andHeIdNotEqualTo(Integer value) {
            addCriterion("he_id <>", value, "heId");
            return (Criteria) this;
        }

        public Criteria andHeIdGreaterThan(Integer value) {
            addCriterion("he_id >", value, "heId");
            return (Criteria) this;
        }

        public Criteria andHeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("he_id >=", value, "heId");
            return (Criteria) this;
        }

        public Criteria andHeIdLessThan(Integer value) {
            addCriterion("he_id <", value, "heId");
            return (Criteria) this;
        }

        public Criteria andHeIdLessThanOrEqualTo(Integer value) {
            addCriterion("he_id <=", value, "heId");
            return (Criteria) this;
        }

        public Criteria andHeIdIn(List<Integer> values) {
            addCriterion("he_id in", values, "heId");
            return (Criteria) this;
        }

        public Criteria andHeIdNotIn(List<Integer> values) {
            addCriterion("he_id not in", values, "heId");
            return (Criteria) this;
        }

        public Criteria andHeIdBetween(Integer value1, Integer value2) {
            addCriterion("he_id between", value1, value2, "heId");
            return (Criteria) this;
        }

        public Criteria andHeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("he_id not between", value1, value2, "heId");
            return (Criteria) this;
        }

        public Criteria andDevDistrictIdIsNull() {
            addCriterion("dev_district_id is null");
            return (Criteria) this;
        }

        public Criteria andDevDistrictIdIsNotNull() {
            addCriterion("dev_district_id is not null");
            return (Criteria) this;
        }

        public Criteria andDevDistrictIdEqualTo(Integer value) {
            addCriterion("dev_district_id =", value, "devDistrictId");
            return (Criteria) this;
        }

        public Criteria andDevDistrictIdNotEqualTo(Integer value) {
            addCriterion("dev_district_id <>", value, "devDistrictId");
            return (Criteria) this;
        }

        public Criteria andDevDistrictIdGreaterThan(Integer value) {
            addCriterion("dev_district_id >", value, "devDistrictId");
            return (Criteria) this;
        }

        public Criteria andDevDistrictIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dev_district_id >=", value, "devDistrictId");
            return (Criteria) this;
        }

        public Criteria andDevDistrictIdLessThan(Integer value) {
            addCriterion("dev_district_id <", value, "devDistrictId");
            return (Criteria) this;
        }

        public Criteria andDevDistrictIdLessThanOrEqualTo(Integer value) {
            addCriterion("dev_district_id <=", value, "devDistrictId");
            return (Criteria) this;
        }

        public Criteria andDevDistrictIdIn(List<Integer> values) {
            addCriterion("dev_district_id in", values, "devDistrictId");
            return (Criteria) this;
        }

        public Criteria andDevDistrictIdNotIn(List<Integer> values) {
            addCriterion("dev_district_id not in", values, "devDistrictId");
            return (Criteria) this;
        }

        public Criteria andDevDistrictIdBetween(Integer value1, Integer value2) {
            addCriterion("dev_district_id between", value1, value2, "devDistrictId");
            return (Criteria) this;
        }

        public Criteria andDevDistrictIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dev_district_id not between", value1, value2, "devDistrictId");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNull() {
            addCriterion("device_name is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNotNull() {
            addCriterion("device_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameEqualTo(String value) {
            addCriterion("device_name =", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotEqualTo(String value) {
            addCriterion("device_name <>", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThan(String value) {
            addCriterion("device_name >", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThanOrEqualTo(String value) {
            addCriterion("device_name >=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThan(String value) {
            addCriterion("device_name <", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThanOrEqualTo(String value) {
            addCriterion("device_name <=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLike(String value) {
            addCriterion("device_name like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotLike(String value) {
            addCriterion("device_name not like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIn(List<String> values) {
            addCriterion("device_name in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotIn(List<String> values) {
            addCriterion("device_name not in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameBetween(String value1, String value2) {
            addCriterion("device_name between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotBetween(String value1, String value2) {
            addCriterion("device_name not between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceDescIsNull() {
            addCriterion("device_desc is null");
            return (Criteria) this;
        }

        public Criteria andDeviceDescIsNotNull() {
            addCriterion("device_desc is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceDescEqualTo(String value) {
            addCriterion("device_desc =", value, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceDescNotEqualTo(String value) {
            addCriterion("device_desc <>", value, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceDescGreaterThan(String value) {
            addCriterion("device_desc >", value, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceDescGreaterThanOrEqualTo(String value) {
            addCriterion("device_desc >=", value, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceDescLessThan(String value) {
            addCriterion("device_desc <", value, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceDescLessThanOrEqualTo(String value) {
            addCriterion("device_desc <=", value, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceDescLike(String value) {
            addCriterion("device_desc like", value, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceDescNotLike(String value) {
            addCriterion("device_desc not like", value, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceDescIn(List<String> values) {
            addCriterion("device_desc in", values, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceDescNotIn(List<String> values) {
            addCriterion("device_desc not in", values, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceDescBetween(String value1, String value2) {
            addCriterion("device_desc between", value1, value2, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceDescNotBetween(String value1, String value2) {
            addCriterion("device_desc not between", value1, value2, "deviceDesc");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialIsNull() {
            addCriterion("device_serial is null");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialIsNotNull() {
            addCriterion("device_serial is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialEqualTo(String value) {
            addCriterion("device_serial =", value, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialNotEqualTo(String value) {
            addCriterion("device_serial <>", value, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialGreaterThan(String value) {
            addCriterion("device_serial >", value, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialGreaterThanOrEqualTo(String value) {
            addCriterion("device_serial >=", value, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialLessThan(String value) {
            addCriterion("device_serial <", value, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialLessThanOrEqualTo(String value) {
            addCriterion("device_serial <=", value, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialLike(String value) {
            addCriterion("device_serial like", value, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialNotLike(String value) {
            addCriterion("device_serial not like", value, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialIn(List<String> values) {
            addCriterion("device_serial in", values, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialNotIn(List<String> values) {
            addCriterion("device_serial not in", values, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialBetween(String value1, String value2) {
            addCriterion("device_serial between", value1, value2, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andDeviceSerialNotBetween(String value1, String value2) {
            addCriterion("device_serial not between", value1, value2, "deviceSerial");
            return (Criteria) this;
        }

        public Criteria andDeviceCustomIdIsNull() {
            addCriterion("device_custom_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceCustomIdIsNotNull() {
            addCriterion("device_custom_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceCustomIdEqualTo(String value) {
            addCriterion("device_custom_id =", value, "deviceCustomId");
            return (Criteria) this;
        }

        public Criteria andDeviceCustomIdNotEqualTo(String value) {
            addCriterion("device_custom_id <>", value, "deviceCustomId");
            return (Criteria) this;
        }

        public Criteria andDeviceCustomIdGreaterThan(String value) {
            addCriterion("device_custom_id >", value, "deviceCustomId");
            return (Criteria) this;
        }

        public Criteria andDeviceCustomIdGreaterThanOrEqualTo(String value) {
            addCriterion("device_custom_id >=", value, "deviceCustomId");
            return (Criteria) this;
        }

        public Criteria andDeviceCustomIdLessThan(String value) {
            addCriterion("device_custom_id <", value, "deviceCustomId");
            return (Criteria) this;
        }

        public Criteria andDeviceCustomIdLessThanOrEqualTo(String value) {
            addCriterion("device_custom_id <=", value, "deviceCustomId");
            return (Criteria) this;
        }

        public Criteria andDeviceCustomIdLike(String value) {
            addCriterion("device_custom_id like", value, "deviceCustomId");
            return (Criteria) this;
        }

        public Criteria andDeviceCustomIdNotLike(String value) {
            addCriterion("device_custom_id not like", value, "deviceCustomId");
            return (Criteria) this;
        }

        public Criteria andDeviceCustomIdIn(List<String> values) {
            addCriterion("device_custom_id in", values, "deviceCustomId");
            return (Criteria) this;
        }

        public Criteria andDeviceCustomIdNotIn(List<String> values) {
            addCriterion("device_custom_id not in", values, "deviceCustomId");
            return (Criteria) this;
        }

        public Criteria andDeviceCustomIdBetween(String value1, String value2) {
            addCriterion("device_custom_id between", value1, value2, "deviceCustomId");
            return (Criteria) this;
        }

        public Criteria andDeviceCustomIdNotBetween(String value1, String value2) {
            addCriterion("device_custom_id not between", value1, value2, "deviceCustomId");
            return (Criteria) this;
        }

        public Criteria andDeviceVerIsNull() {
            addCriterion("device_ver is null");
            return (Criteria) this;
        }

        public Criteria andDeviceVerIsNotNull() {
            addCriterion("device_ver is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceVerEqualTo(String value) {
            addCriterion("device_ver =", value, "deviceVer");
            return (Criteria) this;
        }

        public Criteria andDeviceVerNotEqualTo(String value) {
            addCriterion("device_ver <>", value, "deviceVer");
            return (Criteria) this;
        }

        public Criteria andDeviceVerGreaterThan(String value) {
            addCriterion("device_ver >", value, "deviceVer");
            return (Criteria) this;
        }

        public Criteria andDeviceVerGreaterThanOrEqualTo(String value) {
            addCriterion("device_ver >=", value, "deviceVer");
            return (Criteria) this;
        }

        public Criteria andDeviceVerLessThan(String value) {
            addCriterion("device_ver <", value, "deviceVer");
            return (Criteria) this;
        }

        public Criteria andDeviceVerLessThanOrEqualTo(String value) {
            addCriterion("device_ver <=", value, "deviceVer");
            return (Criteria) this;
        }

        public Criteria andDeviceVerLike(String value) {
            addCriterion("device_ver like", value, "deviceVer");
            return (Criteria) this;
        }

        public Criteria andDeviceVerNotLike(String value) {
            addCriterion("device_ver not like", value, "deviceVer");
            return (Criteria) this;
        }

        public Criteria andDeviceVerIn(List<String> values) {
            addCriterion("device_ver in", values, "deviceVer");
            return (Criteria) this;
        }

        public Criteria andDeviceVerNotIn(List<String> values) {
            addCriterion("device_ver not in", values, "deviceVer");
            return (Criteria) this;
        }

        public Criteria andDeviceVerBetween(String value1, String value2) {
            addCriterion("device_ver between", value1, value2, "deviceVer");
            return (Criteria) this;
        }

        public Criteria andDeviceVerNotBetween(String value1, String value2) {
            addCriterion("device_ver not between", value1, value2, "deviceVer");
            return (Criteria) this;
        }

        public Criteria andDeviceKeyIsNull() {
            addCriterion("device_key is null");
            return (Criteria) this;
        }

        public Criteria andDeviceKeyIsNotNull() {
            addCriterion("device_key is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceKeyEqualTo(String value) {
            addCriterion("device_key =", value, "deviceKey");
            return (Criteria) this;
        }

        public Criteria andDeviceKeyNotEqualTo(String value) {
            addCriterion("device_key <>", value, "deviceKey");
            return (Criteria) this;
        }

        public Criteria andDeviceKeyGreaterThan(String value) {
            addCriterion("device_key >", value, "deviceKey");
            return (Criteria) this;
        }

        public Criteria andDeviceKeyGreaterThanOrEqualTo(String value) {
            addCriterion("device_key >=", value, "deviceKey");
            return (Criteria) this;
        }

        public Criteria andDeviceKeyLessThan(String value) {
            addCriterion("device_key <", value, "deviceKey");
            return (Criteria) this;
        }

        public Criteria andDeviceKeyLessThanOrEqualTo(String value) {
            addCriterion("device_key <=", value, "deviceKey");
            return (Criteria) this;
        }

        public Criteria andDeviceKeyLike(String value) {
            addCriterion("device_key like", value, "deviceKey");
            return (Criteria) this;
        }

        public Criteria andDeviceKeyNotLike(String value) {
            addCriterion("device_key not like", value, "deviceKey");
            return (Criteria) this;
        }

        public Criteria andDeviceKeyIn(List<String> values) {
            addCriterion("device_key in", values, "deviceKey");
            return (Criteria) this;
        }

        public Criteria andDeviceKeyNotIn(List<String> values) {
            addCriterion("device_key not in", values, "deviceKey");
            return (Criteria) this;
        }

        public Criteria andDeviceKeyBetween(String value1, String value2) {
            addCriterion("device_key between", value1, value2, "deviceKey");
            return (Criteria) this;
        }

        public Criteria andDeviceKeyNotBetween(String value1, String value2) {
            addCriterion("device_key not between", value1, value2, "deviceKey");
            return (Criteria) this;
        }

        public Criteria andDevicePortTypeIsNull() {
            addCriterion("device_port_type is null");
            return (Criteria) this;
        }

        public Criteria andDevicePortTypeIsNotNull() {
            addCriterion("device_port_type is not null");
            return (Criteria) this;
        }

        public Criteria andDevicePortTypeEqualTo(Integer value) {
            addCriterion("device_port_type =", value, "devicePortType");
            return (Criteria) this;
        }

        public Criteria andDevicePortTypeNotEqualTo(Integer value) {
            addCriterion("device_port_type <>", value, "devicePortType");
            return (Criteria) this;
        }

        public Criteria andDevicePortTypeGreaterThan(Integer value) {
            addCriterion("device_port_type >", value, "devicePortType");
            return (Criteria) this;
        }

        public Criteria andDevicePortTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_port_type >=", value, "devicePortType");
            return (Criteria) this;
        }

        public Criteria andDevicePortTypeLessThan(Integer value) {
            addCriterion("device_port_type <", value, "devicePortType");
            return (Criteria) this;
        }

        public Criteria andDevicePortTypeLessThanOrEqualTo(Integer value) {
            addCriterion("device_port_type <=", value, "devicePortType");
            return (Criteria) this;
        }

        public Criteria andDevicePortTypeIn(List<Integer> values) {
            addCriterion("device_port_type in", values, "devicePortType");
            return (Criteria) this;
        }

        public Criteria andDevicePortTypeNotIn(List<Integer> values) {
            addCriterion("device_port_type not in", values, "devicePortType");
            return (Criteria) this;
        }

        public Criteria andDevicePortTypeBetween(Integer value1, Integer value2) {
            addCriterion("device_port_type between", value1, value2, "devicePortType");
            return (Criteria) this;
        }

        public Criteria andDevicePortTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("device_port_type not between", value1, value2, "devicePortType");
            return (Criteria) this;
        }

        public Criteria andDeviceBrandIsNull() {
            addCriterion("device_brand is null");
            return (Criteria) this;
        }

        public Criteria andDeviceBrandIsNotNull() {
            addCriterion("device_brand is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceBrandEqualTo(String value) {
            addCriterion("device_brand =", value, "deviceBrand");
            return (Criteria) this;
        }

        public Criteria andDeviceBrandNotEqualTo(String value) {
            addCriterion("device_brand <>", value, "deviceBrand");
            return (Criteria) this;
        }

        public Criteria andDeviceBrandGreaterThan(String value) {
            addCriterion("device_brand >", value, "deviceBrand");
            return (Criteria) this;
        }

        public Criteria andDeviceBrandGreaterThanOrEqualTo(String value) {
            addCriterion("device_brand >=", value, "deviceBrand");
            return (Criteria) this;
        }

        public Criteria andDeviceBrandLessThan(String value) {
            addCriterion("device_brand <", value, "deviceBrand");
            return (Criteria) this;
        }

        public Criteria andDeviceBrandLessThanOrEqualTo(String value) {
            addCriterion("device_brand <=", value, "deviceBrand");
            return (Criteria) this;
        }

        public Criteria andDeviceBrandLike(String value) {
            addCriterion("device_brand like", value, "deviceBrand");
            return (Criteria) this;
        }

        public Criteria andDeviceBrandNotLike(String value) {
            addCriterion("device_brand not like", value, "deviceBrand");
            return (Criteria) this;
        }

        public Criteria andDeviceBrandIn(List<String> values) {
            addCriterion("device_brand in", values, "deviceBrand");
            return (Criteria) this;
        }

        public Criteria andDeviceBrandNotIn(List<String> values) {
            addCriterion("device_brand not in", values, "deviceBrand");
            return (Criteria) this;
        }

        public Criteria andDeviceBrandBetween(String value1, String value2) {
            addCriterion("device_brand between", value1, value2, "deviceBrand");
            return (Criteria) this;
        }

        public Criteria andDeviceBrandNotBetween(String value1, String value2) {
            addCriterion("device_brand not between", value1, value2, "deviceBrand");
            return (Criteria) this;
        }

        public Criteria andDeviceModelIsNull() {
            addCriterion("device_model is null");
            return (Criteria) this;
        }

        public Criteria andDeviceModelIsNotNull() {
            addCriterion("device_model is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceModelEqualTo(String value) {
            addCriterion("device_model =", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNotEqualTo(String value) {
            addCriterion("device_model <>", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelGreaterThan(String value) {
            addCriterion("device_model >", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelGreaterThanOrEqualTo(String value) {
            addCriterion("device_model >=", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelLessThan(String value) {
            addCriterion("device_model <", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelLessThanOrEqualTo(String value) {
            addCriterion("device_model <=", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelLike(String value) {
            addCriterion("device_model like", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNotLike(String value) {
            addCriterion("device_model not like", value, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelIn(List<String> values) {
            addCriterion("device_model in", values, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNotIn(List<String> values) {
            addCriterion("device_model not in", values, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelBetween(String value1, String value2) {
            addCriterion("device_model between", value1, value2, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andDeviceModelNotBetween(String value1, String value2) {
            addCriterion("device_model not between", value1, value2, "deviceModel");
            return (Criteria) this;
        }

        public Criteria andNetworkPortIsNull() {
            addCriterion("network_port is null");
            return (Criteria) this;
        }

        public Criteria andNetworkPortIsNotNull() {
            addCriterion("network_port is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkPortEqualTo(String value) {
            addCriterion("network_port =", value, "networkPort");
            return (Criteria) this;
        }

        public Criteria andNetworkPortNotEqualTo(String value) {
            addCriterion("network_port <>", value, "networkPort");
            return (Criteria) this;
        }

        public Criteria andNetworkPortGreaterThan(String value) {
            addCriterion("network_port >", value, "networkPort");
            return (Criteria) this;
        }

        public Criteria andNetworkPortGreaterThanOrEqualTo(String value) {
            addCriterion("network_port >=", value, "networkPort");
            return (Criteria) this;
        }

        public Criteria andNetworkPortLessThan(String value) {
            addCriterion("network_port <", value, "networkPort");
            return (Criteria) this;
        }

        public Criteria andNetworkPortLessThanOrEqualTo(String value) {
            addCriterion("network_port <=", value, "networkPort");
            return (Criteria) this;
        }

        public Criteria andNetworkPortLike(String value) {
            addCriterion("network_port like", value, "networkPort");
            return (Criteria) this;
        }

        public Criteria andNetworkPortNotLike(String value) {
            addCriterion("network_port not like", value, "networkPort");
            return (Criteria) this;
        }

        public Criteria andNetworkPortIn(List<String> values) {
            addCriterion("network_port in", values, "networkPort");
            return (Criteria) this;
        }

        public Criteria andNetworkPortNotIn(List<String> values) {
            addCriterion("network_port not in", values, "networkPort");
            return (Criteria) this;
        }

        public Criteria andNetworkPortBetween(String value1, String value2) {
            addCriterion("network_port between", value1, value2, "networkPort");
            return (Criteria) this;
        }

        public Criteria andNetworkPortNotBetween(String value1, String value2) {
            addCriterion("network_port not between", value1, value2, "networkPort");
            return (Criteria) this;
        }

        public Criteria andDomainNameIsNull() {
            addCriterion("domain_name is null");
            return (Criteria) this;
        }

        public Criteria andDomainNameIsNotNull() {
            addCriterion("domain_name is not null");
            return (Criteria) this;
        }

        public Criteria andDomainNameEqualTo(String value) {
            addCriterion("domain_name =", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameNotEqualTo(String value) {
            addCriterion("domain_name <>", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameGreaterThan(String value) {
            addCriterion("domain_name >", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameGreaterThanOrEqualTo(String value) {
            addCriterion("domain_name >=", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameLessThan(String value) {
            addCriterion("domain_name <", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameLessThanOrEqualTo(String value) {
            addCriterion("domain_name <=", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameLike(String value) {
            addCriterion("domain_name like", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameNotLike(String value) {
            addCriterion("domain_name not like", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameIn(List<String> values) {
            addCriterion("domain_name in", values, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameNotIn(List<String> values) {
            addCriterion("domain_name not in", values, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameBetween(String value1, String value2) {
            addCriterion("domain_name between", value1, value2, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameNotBetween(String value1, String value2) {
            addCriterion("domain_name not between", value1, value2, "domainName");
            return (Criteria) this;
        }

        public Criteria andMinPowIsNull() {
            addCriterion("min_pow is null");
            return (Criteria) this;
        }

        public Criteria andMinPowIsNotNull() {
            addCriterion("min_pow is not null");
            return (Criteria) this;
        }

        public Criteria andMinPowEqualTo(String value) {
            addCriterion("min_pow =", value, "minPow");
            return (Criteria) this;
        }

        public Criteria andMinPowNotEqualTo(String value) {
            addCriterion("min_pow <>", value, "minPow");
            return (Criteria) this;
        }

        public Criteria andMinPowGreaterThan(String value) {
            addCriterion("min_pow >", value, "minPow");
            return (Criteria) this;
        }

        public Criteria andMinPowGreaterThanOrEqualTo(String value) {
            addCriterion("min_pow >=", value, "minPow");
            return (Criteria) this;
        }

        public Criteria andMinPowLessThan(String value) {
            addCriterion("min_pow <", value, "minPow");
            return (Criteria) this;
        }

        public Criteria andMinPowLessThanOrEqualTo(String value) {
            addCriterion("min_pow <=", value, "minPow");
            return (Criteria) this;
        }

        public Criteria andMinPowLike(String value) {
            addCriterion("min_pow like", value, "minPow");
            return (Criteria) this;
        }

        public Criteria andMinPowNotLike(String value) {
            addCriterion("min_pow not like", value, "minPow");
            return (Criteria) this;
        }

        public Criteria andMinPowIn(List<String> values) {
            addCriterion("min_pow in", values, "minPow");
            return (Criteria) this;
        }

        public Criteria andMinPowNotIn(List<String> values) {
            addCriterion("min_pow not in", values, "minPow");
            return (Criteria) this;
        }

        public Criteria andMinPowBetween(String value1, String value2) {
            addCriterion("min_pow between", value1, value2, "minPow");
            return (Criteria) this;
        }

        public Criteria andMinPowNotBetween(String value1, String value2) {
            addCriterion("min_pow not between", value1, value2, "minPow");
            return (Criteria) this;
        }

        public Criteria andMaxPowIsNull() {
            addCriterion("max_pow is null");
            return (Criteria) this;
        }

        public Criteria andMaxPowIsNotNull() {
            addCriterion("max_pow is not null");
            return (Criteria) this;
        }

        public Criteria andMaxPowEqualTo(String value) {
            addCriterion("max_pow =", value, "maxPow");
            return (Criteria) this;
        }

        public Criteria andMaxPowNotEqualTo(String value) {
            addCriterion("max_pow <>", value, "maxPow");
            return (Criteria) this;
        }

        public Criteria andMaxPowGreaterThan(String value) {
            addCriterion("max_pow >", value, "maxPow");
            return (Criteria) this;
        }

        public Criteria andMaxPowGreaterThanOrEqualTo(String value) {
            addCriterion("max_pow >=", value, "maxPow");
            return (Criteria) this;
        }

        public Criteria andMaxPowLessThan(String value) {
            addCriterion("max_pow <", value, "maxPow");
            return (Criteria) this;
        }

        public Criteria andMaxPowLessThanOrEqualTo(String value) {
            addCriterion("max_pow <=", value, "maxPow");
            return (Criteria) this;
        }

        public Criteria andMaxPowLike(String value) {
            addCriterion("max_pow like", value, "maxPow");
            return (Criteria) this;
        }

        public Criteria andMaxPowNotLike(String value) {
            addCriterion("max_pow not like", value, "maxPow");
            return (Criteria) this;
        }

        public Criteria andMaxPowIn(List<String> values) {
            addCriterion("max_pow in", values, "maxPow");
            return (Criteria) this;
        }

        public Criteria andMaxPowNotIn(List<String> values) {
            addCriterion("max_pow not in", values, "maxPow");
            return (Criteria) this;
        }

        public Criteria andMaxPowBetween(String value1, String value2) {
            addCriterion("max_pow between", value1, value2, "maxPow");
            return (Criteria) this;
        }

        public Criteria andMaxPowNotBetween(String value1, String value2) {
            addCriterion("max_pow not between", value1, value2, "maxPow");
            return (Criteria) this;
        }

        public Criteria andMaxTimeIsNull() {
            addCriterion("max_time is null");
            return (Criteria) this;
        }

        public Criteria andMaxTimeIsNotNull() {
            addCriterion("max_time is not null");
            return (Criteria) this;
        }

        public Criteria andMaxTimeEqualTo(String value) {
            addCriterion("max_time =", value, "maxTime");
            return (Criteria) this;
        }

        public Criteria andMaxTimeNotEqualTo(String value) {
            addCriterion("max_time <>", value, "maxTime");
            return (Criteria) this;
        }

        public Criteria andMaxTimeGreaterThan(String value) {
            addCriterion("max_time >", value, "maxTime");
            return (Criteria) this;
        }

        public Criteria andMaxTimeGreaterThanOrEqualTo(String value) {
            addCriterion("max_time >=", value, "maxTime");
            return (Criteria) this;
        }

        public Criteria andMaxTimeLessThan(String value) {
            addCriterion("max_time <", value, "maxTime");
            return (Criteria) this;
        }

        public Criteria andMaxTimeLessThanOrEqualTo(String value) {
            addCriterion("max_time <=", value, "maxTime");
            return (Criteria) this;
        }

        public Criteria andMaxTimeLike(String value) {
            addCriterion("max_time like", value, "maxTime");
            return (Criteria) this;
        }

        public Criteria andMaxTimeNotLike(String value) {
            addCriterion("max_time not like", value, "maxTime");
            return (Criteria) this;
        }

        public Criteria andMaxTimeIn(List<String> values) {
            addCriterion("max_time in", values, "maxTime");
            return (Criteria) this;
        }

        public Criteria andMaxTimeNotIn(List<String> values) {
            addCriterion("max_time not in", values, "maxTime");
            return (Criteria) this;
        }

        public Criteria andMaxTimeBetween(String value1, String value2) {
            addCriterion("max_time between", value1, value2, "maxTime");
            return (Criteria) this;
        }

        public Criteria andMaxTimeNotBetween(String value1, String value2) {
            addCriterion("max_time not between", value1, value2, "maxTime");
            return (Criteria) this;
        }

        public Criteria andHeartbeatIsNull() {
            addCriterion("heartbeat is null");
            return (Criteria) this;
        }

        public Criteria andHeartbeatIsNotNull() {
            addCriterion("heartbeat is not null");
            return (Criteria) this;
        }

        public Criteria andHeartbeatEqualTo(String value) {
            addCriterion("heartbeat =", value, "heartbeat");
            return (Criteria) this;
        }

        public Criteria andHeartbeatNotEqualTo(String value) {
            addCriterion("heartbeat <>", value, "heartbeat");
            return (Criteria) this;
        }

        public Criteria andHeartbeatGreaterThan(String value) {
            addCriterion("heartbeat >", value, "heartbeat");
            return (Criteria) this;
        }

        public Criteria andHeartbeatGreaterThanOrEqualTo(String value) {
            addCriterion("heartbeat >=", value, "heartbeat");
            return (Criteria) this;
        }

        public Criteria andHeartbeatLessThan(String value) {
            addCriterion("heartbeat <", value, "heartbeat");
            return (Criteria) this;
        }

        public Criteria andHeartbeatLessThanOrEqualTo(String value) {
            addCriterion("heartbeat <=", value, "heartbeat");
            return (Criteria) this;
        }

        public Criteria andHeartbeatLike(String value) {
            addCriterion("heartbeat like", value, "heartbeat");
            return (Criteria) this;
        }

        public Criteria andHeartbeatNotLike(String value) {
            addCriterion("heartbeat not like", value, "heartbeat");
            return (Criteria) this;
        }

        public Criteria andHeartbeatIn(List<String> values) {
            addCriterion("heartbeat in", values, "heartbeat");
            return (Criteria) this;
        }

        public Criteria andHeartbeatNotIn(List<String> values) {
            addCriterion("heartbeat not in", values, "heartbeat");
            return (Criteria) this;
        }

        public Criteria andHeartbeatBetween(String value1, String value2) {
            addCriterion("heartbeat between", value1, value2, "heartbeat");
            return (Criteria) this;
        }

        public Criteria andHeartbeatNotBetween(String value1, String value2) {
            addCriterion("heartbeat not between", value1, value2, "heartbeat");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andStreetIsNull() {
            addCriterion("street is null");
            return (Criteria) this;
        }

        public Criteria andStreetIsNotNull() {
            addCriterion("street is not null");
            return (Criteria) this;
        }

        public Criteria andStreetEqualTo(String value) {
            addCriterion("street =", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotEqualTo(String value) {
            addCriterion("street <>", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThan(String value) {
            addCriterion("street >", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThanOrEqualTo(String value) {
            addCriterion("street >=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThan(String value) {
            addCriterion("street <", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThanOrEqualTo(String value) {
            addCriterion("street <=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLike(String value) {
            addCriterion("street like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotLike(String value) {
            addCriterion("street not like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetIn(List<String> values) {
            addCriterion("street in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotIn(List<String> values) {
            addCriterion("street not in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetBetween(String value1, String value2) {
            addCriterion("street between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotBetween(String value1, String value2) {
            addCriterion("street not between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(BigDecimal value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(BigDecimal value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(BigDecimal value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(BigDecimal value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<BigDecimal> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<BigDecimal> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(BigDecimal value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(BigDecimal value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(BigDecimal value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(BigDecimal value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<BigDecimal> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<BigDecimal> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andOnlineIsNull() {
            addCriterion("`online` is null");
            return (Criteria) this;
        }

        public Criteria andOnlineIsNotNull() {
            addCriterion("`online` is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineEqualTo(String value) {
            addCriterion("`online` =", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotEqualTo(String value) {
            addCriterion("`online` <>", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineGreaterThan(String value) {
            addCriterion("`online` >", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineGreaterThanOrEqualTo(String value) {
            addCriterion("`online` >=", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLessThan(String value) {
            addCriterion("`online` <", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLessThanOrEqualTo(String value) {
            addCriterion("`online` <=", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLike(String value) {
            addCriterion("`online` like", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotLike(String value) {
            addCriterion("`online` not like", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineIn(List<String> values) {
            addCriterion("`online` in", values, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotIn(List<String> values) {
            addCriterion("`online` not in", values, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineBetween(String value1, String value2) {
            addCriterion("`online` between", value1, value2, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotBetween(String value1, String value2) {
            addCriterion("`online` not between", value1, value2, "online");
            return (Criteria) this;
        }

        public Criteria andReserveOneIsNull() {
            addCriterion("reserve_one is null");
            return (Criteria) this;
        }

        public Criteria andReserveOneIsNotNull() {
            addCriterion("reserve_one is not null");
            return (Criteria) this;
        }

        public Criteria andReserveOneEqualTo(String value) {
            addCriterion("reserve_one =", value, "reserveOne");
            return (Criteria) this;
        }

        public Criteria andReserveOneNotEqualTo(String value) {
            addCriterion("reserve_one <>", value, "reserveOne");
            return (Criteria) this;
        }

        public Criteria andReserveOneGreaterThan(String value) {
            addCriterion("reserve_one >", value, "reserveOne");
            return (Criteria) this;
        }

        public Criteria andReserveOneGreaterThanOrEqualTo(String value) {
            addCriterion("reserve_one >=", value, "reserveOne");
            return (Criteria) this;
        }

        public Criteria andReserveOneLessThan(String value) {
            addCriterion("reserve_one <", value, "reserveOne");
            return (Criteria) this;
        }

        public Criteria andReserveOneLessThanOrEqualTo(String value) {
            addCriterion("reserve_one <=", value, "reserveOne");
            return (Criteria) this;
        }

        public Criteria andReserveOneLike(String value) {
            addCriterion("reserve_one like", value, "reserveOne");
            return (Criteria) this;
        }

        public Criteria andReserveOneNotLike(String value) {
            addCriterion("reserve_one not like", value, "reserveOne");
            return (Criteria) this;
        }

        public Criteria andReserveOneIn(List<String> values) {
            addCriterion("reserve_one in", values, "reserveOne");
            return (Criteria) this;
        }

        public Criteria andReserveOneNotIn(List<String> values) {
            addCriterion("reserve_one not in", values, "reserveOne");
            return (Criteria) this;
        }

        public Criteria andReserveOneBetween(String value1, String value2) {
            addCriterion("reserve_one between", value1, value2, "reserveOne");
            return (Criteria) this;
        }

        public Criteria andReserveOneNotBetween(String value1, String value2) {
            addCriterion("reserve_one not between", value1, value2, "reserveOne");
            return (Criteria) this;
        }

        public Criteria andReserveTwoIsNull() {
            addCriterion("reserve_two is null");
            return (Criteria) this;
        }

        public Criteria andReserveTwoIsNotNull() {
            addCriterion("reserve_two is not null");
            return (Criteria) this;
        }

        public Criteria andReserveTwoEqualTo(String value) {
            addCriterion("reserve_two =", value, "reserveTwo");
            return (Criteria) this;
        }

        public Criteria andReserveTwoNotEqualTo(String value) {
            addCriterion("reserve_two <>", value, "reserveTwo");
            return (Criteria) this;
        }

        public Criteria andReserveTwoGreaterThan(String value) {
            addCriterion("reserve_two >", value, "reserveTwo");
            return (Criteria) this;
        }

        public Criteria andReserveTwoGreaterThanOrEqualTo(String value) {
            addCriterion("reserve_two >=", value, "reserveTwo");
            return (Criteria) this;
        }

        public Criteria andReserveTwoLessThan(String value) {
            addCriterion("reserve_two <", value, "reserveTwo");
            return (Criteria) this;
        }

        public Criteria andReserveTwoLessThanOrEqualTo(String value) {
            addCriterion("reserve_two <=", value, "reserveTwo");
            return (Criteria) this;
        }

        public Criteria andReserveTwoLike(String value) {
            addCriterion("reserve_two like", value, "reserveTwo");
            return (Criteria) this;
        }

        public Criteria andReserveTwoNotLike(String value) {
            addCriterion("reserve_two not like", value, "reserveTwo");
            return (Criteria) this;
        }

        public Criteria andReserveTwoIn(List<String> values) {
            addCriterion("reserve_two in", values, "reserveTwo");
            return (Criteria) this;
        }

        public Criteria andReserveTwoNotIn(List<String> values) {
            addCriterion("reserve_two not in", values, "reserveTwo");
            return (Criteria) this;
        }

        public Criteria andReserveTwoBetween(String value1, String value2) {
            addCriterion("reserve_two between", value1, value2, "reserveTwo");
            return (Criteria) this;
        }

        public Criteria andReserveTwoNotBetween(String value1, String value2) {
            addCriterion("reserve_two not between", value1, value2, "reserveTwo");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("`status` like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("`status` not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNull() {
            addCriterion("del_flag is null");
            return (Criteria) this;
        }

        public Criteria andDelFlagIsNotNull() {
            addCriterion("del_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDelFlagEqualTo(String value) {
            addCriterion("del_flag =", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotEqualTo(String value) {
            addCriterion("del_flag <>", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThan(String value) {
            addCriterion("del_flag >", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("del_flag >=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThan(String value) {
            addCriterion("del_flag <", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLessThanOrEqualTo(String value) {
            addCriterion("del_flag <=", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagLike(String value) {
            addCriterion("del_flag like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotLike(String value) {
            addCriterion("del_flag not like", value, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagIn(List<String> values) {
            addCriterion("del_flag in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotIn(List<String> values) {
            addCriterion("del_flag not in", values, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagBetween(String value1, String value2) {
            addCriterion("del_flag between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andDelFlagNotBetween(String value1, String value2) {
            addCriterion("del_flag not between", value1, value2, "delFlag");
            return (Criteria) this;
        }

        public Criteria andBuildUseridIsNull() {
            addCriterion("build_userid is null");
            return (Criteria) this;
        }

        public Criteria andBuildUseridIsNotNull() {
            addCriterion("build_userid is not null");
            return (Criteria) this;
        }

        public Criteria andBuildUseridEqualTo(Integer value) {
            addCriterion("build_userid =", value, "buildUserid");
            return (Criteria) this;
        }

        public Criteria andBuildUseridNotEqualTo(Integer value) {
            addCriterion("build_userid <>", value, "buildUserid");
            return (Criteria) this;
        }

        public Criteria andBuildUseridGreaterThan(Integer value) {
            addCriterion("build_userid >", value, "buildUserid");
            return (Criteria) this;
        }

        public Criteria andBuildUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("build_userid >=", value, "buildUserid");
            return (Criteria) this;
        }

        public Criteria andBuildUseridLessThan(Integer value) {
            addCriterion("build_userid <", value, "buildUserid");
            return (Criteria) this;
        }

        public Criteria andBuildUseridLessThanOrEqualTo(Integer value) {
            addCriterion("build_userid <=", value, "buildUserid");
            return (Criteria) this;
        }

        public Criteria andBuildUseridIn(List<Integer> values) {
            addCriterion("build_userid in", values, "buildUserid");
            return (Criteria) this;
        }

        public Criteria andBuildUseridNotIn(List<Integer> values) {
            addCriterion("build_userid not in", values, "buildUserid");
            return (Criteria) this;
        }

        public Criteria andBuildUseridBetween(Integer value1, Integer value2) {
            addCriterion("build_userid between", value1, value2, "buildUserid");
            return (Criteria) this;
        }

        public Criteria andBuildUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("build_userid not between", value1, value2, "buildUserid");
            return (Criteria) this;
        }

        public Criteria andBuildTimeIsNull() {
            addCriterion("build_time is null");
            return (Criteria) this;
        }

        public Criteria andBuildTimeIsNotNull() {
            addCriterion("build_time is not null");
            return (Criteria) this;
        }

        public Criteria andBuildTimeEqualTo(Date value) {
            addCriterion("build_time =", value, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeNotEqualTo(Date value) {
            addCriterion("build_time <>", value, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeGreaterThan(Date value) {
            addCriterion("build_time >", value, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("build_time >=", value, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeLessThan(Date value) {
            addCriterion("build_time <", value, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeLessThanOrEqualTo(Date value) {
            addCriterion("build_time <=", value, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeIn(List<Date> values) {
            addCriterion("build_time in", values, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeNotIn(List<Date> values) {
            addCriterion("build_time not in", values, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeBetween(Date value1, Date value2) {
            addCriterion("build_time between", value1, value2, "buildTime");
            return (Criteria) this;
        }

        public Criteria andBuildTimeNotBetween(Date value1, Date value2) {
            addCriterion("build_time not between", value1, value2, "buildTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridIsNull() {
            addCriterion("update_userid is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridIsNotNull() {
            addCriterion("update_userid is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridEqualTo(Integer value) {
            addCriterion("update_userid =", value, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridNotEqualTo(Integer value) {
            addCriterion("update_userid <>", value, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridGreaterThan(Integer value) {
            addCriterion("update_userid >", value, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_userid >=", value, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridLessThan(Integer value) {
            addCriterion("update_userid <", value, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridLessThanOrEqualTo(Integer value) {
            addCriterion("update_userid <=", value, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridIn(List<Integer> values) {
            addCriterion("update_userid in", values, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridNotIn(List<Integer> values) {
            addCriterion("update_userid not in", values, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridBetween(Integer value1, Integer value2) {
            addCriterion("update_userid between", value1, value2, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("update_userid not between", value1, value2, "updateUserid");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}