package com.jzhl.power.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PowOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public PowOrderExample() {
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

        public Criteria andOrderPayIsNull() {
            addCriterion("order_pay is null");
            return (Criteria) this;
        }

        public Criteria andOrderPayIsNotNull() {
            addCriterion("order_pay is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPayEqualTo(String value) {
            addCriterion("order_pay =", value, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayNotEqualTo(String value) {
            addCriterion("order_pay <>", value, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayGreaterThan(String value) {
            addCriterion("order_pay >", value, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayGreaterThanOrEqualTo(String value) {
            addCriterion("order_pay >=", value, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayLessThan(String value) {
            addCriterion("order_pay <", value, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayLessThanOrEqualTo(String value) {
            addCriterion("order_pay <=", value, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayLike(String value) {
            addCriterion("order_pay like", value, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayNotLike(String value) {
            addCriterion("order_pay not like", value, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayIn(List<String> values) {
            addCriterion("order_pay in", values, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayNotIn(List<String> values) {
            addCriterion("order_pay not in", values, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayBetween(String value1, String value2) {
            addCriterion("order_pay between", value1, value2, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayNotBetween(String value1, String value2) {
            addCriterion("order_pay not between", value1, value2, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderWayIsNull() {
            addCriterion("order_way is null");
            return (Criteria) this;
        }

        public Criteria andOrderWayIsNotNull() {
            addCriterion("order_way is not null");
            return (Criteria) this;
        }

        public Criteria andOrderWayEqualTo(String value) {
            addCriterion("order_way =", value, "orderWay");
            return (Criteria) this;
        }

        public Criteria andOrderWayNotEqualTo(String value) {
            addCriterion("order_way <>", value, "orderWay");
            return (Criteria) this;
        }

        public Criteria andOrderWayGreaterThan(String value) {
            addCriterion("order_way >", value, "orderWay");
            return (Criteria) this;
        }

        public Criteria andOrderWayGreaterThanOrEqualTo(String value) {
            addCriterion("order_way >=", value, "orderWay");
            return (Criteria) this;
        }

        public Criteria andOrderWayLessThan(String value) {
            addCriterion("order_way <", value, "orderWay");
            return (Criteria) this;
        }

        public Criteria andOrderWayLessThanOrEqualTo(String value) {
            addCriterion("order_way <=", value, "orderWay");
            return (Criteria) this;
        }

        public Criteria andOrderWayLike(String value) {
            addCriterion("order_way like", value, "orderWay");
            return (Criteria) this;
        }

        public Criteria andOrderWayNotLike(String value) {
            addCriterion("order_way not like", value, "orderWay");
            return (Criteria) this;
        }

        public Criteria andOrderWayIn(List<String> values) {
            addCriterion("order_way in", values, "orderWay");
            return (Criteria) this;
        }

        public Criteria andOrderWayNotIn(List<String> values) {
            addCriterion("order_way not in", values, "orderWay");
            return (Criteria) this;
        }

        public Criteria andOrderWayBetween(String value1, String value2) {
            addCriterion("order_way between", value1, value2, "orderWay");
            return (Criteria) this;
        }

        public Criteria andOrderWayNotBetween(String value1, String value2) {
            addCriterion("order_way not between", value1, value2, "orderWay");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNull() {
            addCriterion("device_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIsNotNull() {
            addCriterion("device_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceIdEqualTo(Integer value) {
            addCriterion("device_id =", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotEqualTo(Integer value) {
            addCriterion("device_id <>", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThan(Integer value) {
            addCriterion("device_id >", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_id >=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThan(Integer value) {
            addCriterion("device_id <", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdLessThanOrEqualTo(Integer value) {
            addCriterion("device_id <=", value, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdIn(List<Integer> values) {
            addCriterion("device_id in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotIn(List<Integer> values) {
            addCriterion("device_id not in", values, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdBetween(Integer value1, Integer value2) {
            addCriterion("device_id between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDeviceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("device_id not between", value1, value2, "deviceId");
            return (Criteria) this;
        }

        public Criteria andDevicePortIdIsNull() {
            addCriterion("device_port_id is null");
            return (Criteria) this;
        }

        public Criteria andDevicePortIdIsNotNull() {
            addCriterion("device_port_id is not null");
            return (Criteria) this;
        }

        public Criteria andDevicePortIdEqualTo(Integer value) {
            addCriterion("device_port_id =", value, "devicePortId");
            return (Criteria) this;
        }

        public Criteria andDevicePortIdNotEqualTo(Integer value) {
            addCriterion("device_port_id <>", value, "devicePortId");
            return (Criteria) this;
        }

        public Criteria andDevicePortIdGreaterThan(Integer value) {
            addCriterion("device_port_id >", value, "devicePortId");
            return (Criteria) this;
        }

        public Criteria andDevicePortIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_port_id >=", value, "devicePortId");
            return (Criteria) this;
        }

        public Criteria andDevicePortIdLessThan(Integer value) {
            addCriterion("device_port_id <", value, "devicePortId");
            return (Criteria) this;
        }

        public Criteria andDevicePortIdLessThanOrEqualTo(Integer value) {
            addCriterion("device_port_id <=", value, "devicePortId");
            return (Criteria) this;
        }

        public Criteria andDevicePortIdIn(List<Integer> values) {
            addCriterion("device_port_id in", values, "devicePortId");
            return (Criteria) this;
        }

        public Criteria andDevicePortIdNotIn(List<Integer> values) {
            addCriterion("device_port_id not in", values, "devicePortId");
            return (Criteria) this;
        }

        public Criteria andDevicePortIdBetween(Integer value1, Integer value2) {
            addCriterion("device_port_id between", value1, value2, "devicePortId");
            return (Criteria) this;
        }

        public Criteria andDevicePortIdNotBetween(Integer value1, Integer value2) {
            addCriterion("device_port_id not between", value1, value2, "devicePortId");
            return (Criteria) this;
        }

        public Criteria andPortIsNull() {
            addCriterion("port is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("port is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(Integer value) {
            addCriterion("port =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(Integer value) {
            addCriterion("port <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(Integer value) {
            addCriterion("port >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("port >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(Integer value) {
            addCriterion("port <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(Integer value) {
            addCriterion("port <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<Integer> values) {
            addCriterion("port in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<Integer> values) {
            addCriterion("port not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(Integer value1, Integer value2) {
            addCriterion("port between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(Integer value1, Integer value2) {
            addCriterion("port not between", value1, value2, "port");
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("user_type like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("user_type not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNull() {
            addCriterion("card_id is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("card_id is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(Integer value) {
            addCriterion("card_id =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(Integer value) {
            addCriterion("card_id <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(Integer value) {
            addCriterion("card_id >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("card_id >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(Integer value) {
            addCriterion("card_id <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(Integer value) {
            addCriterion("card_id <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<Integer> values) {
            addCriterion("card_id in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<Integer> values) {
            addCriterion("card_id not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(Integer value1, Integer value2) {
            addCriterion("card_id between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("card_id not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNull() {
            addCriterion("card_no is null");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNotNull() {
            addCriterion("card_no is not null");
            return (Criteria) this;
        }

        public Criteria andCardNoEqualTo(String value) {
            addCriterion("card_no =", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotEqualTo(String value) {
            addCriterion("card_no <>", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThan(String value) {
            addCriterion("card_no >", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("card_no >=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThan(String value) {
            addCriterion("card_no <", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThanOrEqualTo(String value) {
            addCriterion("card_no <=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLike(String value) {
            addCriterion("card_no like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotLike(String value) {
            addCriterion("card_no not like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoIn(List<String> values) {
            addCriterion("card_no in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotIn(List<String> values) {
            addCriterion("card_no not in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoBetween(String value1, String value2) {
            addCriterion("card_no between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotBetween(String value1, String value2) {
            addCriterion("card_no not between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andPayFeeIsNull() {
            addCriterion("pay_fee is null");
            return (Criteria) this;
        }

        public Criteria andPayFeeIsNotNull() {
            addCriterion("pay_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPayFeeEqualTo(BigDecimal value) {
            addCriterion("pay_fee =", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeNotEqualTo(BigDecimal value) {
            addCriterion("pay_fee <>", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeGreaterThan(BigDecimal value) {
            addCriterion("pay_fee >", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_fee >=", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeLessThan(BigDecimal value) {
            addCriterion("pay_fee <", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_fee <=", value, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeIn(List<BigDecimal> values) {
            addCriterion("pay_fee in", values, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeNotIn(List<BigDecimal> values) {
            addCriterion("pay_fee not in", values, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_fee between", value1, value2, "payFee");
            return (Criteria) this;
        }

        public Criteria andPayFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_fee not between", value1, value2, "payFee");
            return (Criteria) this;
        }

        public Criteria andReturnFeeIsNull() {
            addCriterion("return_fee is null");
            return (Criteria) this;
        }

        public Criteria andReturnFeeIsNotNull() {
            addCriterion("return_fee is not null");
            return (Criteria) this;
        }

        public Criteria andReturnFeeEqualTo(BigDecimal value) {
            addCriterion("return_fee =", value, "returnFee");
            return (Criteria) this;
        }

        public Criteria andReturnFeeNotEqualTo(BigDecimal value) {
            addCriterion("return_fee <>", value, "returnFee");
            return (Criteria) this;
        }

        public Criteria andReturnFeeGreaterThan(BigDecimal value) {
            addCriterion("return_fee >", value, "returnFee");
            return (Criteria) this;
        }

        public Criteria andReturnFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("return_fee >=", value, "returnFee");
            return (Criteria) this;
        }

        public Criteria andReturnFeeLessThan(BigDecimal value) {
            addCriterion("return_fee <", value, "returnFee");
            return (Criteria) this;
        }

        public Criteria andReturnFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("return_fee <=", value, "returnFee");
            return (Criteria) this;
        }

        public Criteria andReturnFeeIn(List<BigDecimal> values) {
            addCriterion("return_fee in", values, "returnFee");
            return (Criteria) this;
        }

        public Criteria andReturnFeeNotIn(List<BigDecimal> values) {
            addCriterion("return_fee not in", values, "returnFee");
            return (Criteria) this;
        }

        public Criteria andReturnFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("return_fee between", value1, value2, "returnFee");
            return (Criteria) this;
        }

        public Criteria andReturnFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("return_fee not between", value1, value2, "returnFee");
            return (Criteria) this;
        }

        public Criteria andUnitFeeIsNull() {
            addCriterion("unit_fee is null");
            return (Criteria) this;
        }

        public Criteria andUnitFeeIsNotNull() {
            addCriterion("unit_fee is not null");
            return (Criteria) this;
        }

        public Criteria andUnitFeeEqualTo(BigDecimal value) {
            addCriterion("unit_fee =", value, "unitFee");
            return (Criteria) this;
        }

        public Criteria andUnitFeeNotEqualTo(BigDecimal value) {
            addCriterion("unit_fee <>", value, "unitFee");
            return (Criteria) this;
        }

        public Criteria andUnitFeeGreaterThan(BigDecimal value) {
            addCriterion("unit_fee >", value, "unitFee");
            return (Criteria) this;
        }

        public Criteria andUnitFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_fee >=", value, "unitFee");
            return (Criteria) this;
        }

        public Criteria andUnitFeeLessThan(BigDecimal value) {
            addCriterion("unit_fee <", value, "unitFee");
            return (Criteria) this;
        }

        public Criteria andUnitFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_fee <=", value, "unitFee");
            return (Criteria) this;
        }

        public Criteria andUnitFeeIn(List<BigDecimal> values) {
            addCriterion("unit_fee in", values, "unitFee");
            return (Criteria) this;
        }

        public Criteria andUnitFeeNotIn(List<BigDecimal> values) {
            addCriterion("unit_fee not in", values, "unitFee");
            return (Criteria) this;
        }

        public Criteria andUnitFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_fee between", value1, value2, "unitFee");
            return (Criteria) this;
        }

        public Criteria andUnitFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_fee not between", value1, value2, "unitFee");
            return (Criteria) this;
        }

        public Criteria andUnitMinIsNull() {
            addCriterion("unit_min is null");
            return (Criteria) this;
        }

        public Criteria andUnitMinIsNotNull() {
            addCriterion("unit_min is not null");
            return (Criteria) this;
        }

        public Criteria andUnitMinEqualTo(Integer value) {
            addCriterion("unit_min =", value, "unitMin");
            return (Criteria) this;
        }

        public Criteria andUnitMinNotEqualTo(Integer value) {
            addCriterion("unit_min <>", value, "unitMin");
            return (Criteria) this;
        }

        public Criteria andUnitMinGreaterThan(Integer value) {
            addCriterion("unit_min >", value, "unitMin");
            return (Criteria) this;
        }

        public Criteria andUnitMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("unit_min >=", value, "unitMin");
            return (Criteria) this;
        }

        public Criteria andUnitMinLessThan(Integer value) {
            addCriterion("unit_min <", value, "unitMin");
            return (Criteria) this;
        }

        public Criteria andUnitMinLessThanOrEqualTo(Integer value) {
            addCriterion("unit_min <=", value, "unitMin");
            return (Criteria) this;
        }

        public Criteria andUnitMinIn(List<Integer> values) {
            addCriterion("unit_min in", values, "unitMin");
            return (Criteria) this;
        }

        public Criteria andUnitMinNotIn(List<Integer> values) {
            addCriterion("unit_min not in", values, "unitMin");
            return (Criteria) this;
        }

        public Criteria andUnitMinBetween(Integer value1, Integer value2) {
            addCriterion("unit_min between", value1, value2, "unitMin");
            return (Criteria) this;
        }

        public Criteria andUnitMinNotBetween(Integer value1, Integer value2) {
            addCriterion("unit_min not between", value1, value2, "unitMin");
            return (Criteria) this;
        }

        public Criteria andReturnFeeStatusIsNull() {
            addCriterion("return_fee_status is null");
            return (Criteria) this;
        }

        public Criteria andReturnFeeStatusIsNotNull() {
            addCriterion("return_fee_status is not null");
            return (Criteria) this;
        }

        public Criteria andReturnFeeStatusEqualTo(String value) {
            addCriterion("return_fee_status =", value, "returnFeeStatus");
            return (Criteria) this;
        }

        public Criteria andReturnFeeStatusNotEqualTo(String value) {
            addCriterion("return_fee_status <>", value, "returnFeeStatus");
            return (Criteria) this;
        }

        public Criteria andReturnFeeStatusGreaterThan(String value) {
            addCriterion("return_fee_status >", value, "returnFeeStatus");
            return (Criteria) this;
        }

        public Criteria andReturnFeeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("return_fee_status >=", value, "returnFeeStatus");
            return (Criteria) this;
        }

        public Criteria andReturnFeeStatusLessThan(String value) {
            addCriterion("return_fee_status <", value, "returnFeeStatus");
            return (Criteria) this;
        }

        public Criteria andReturnFeeStatusLessThanOrEqualTo(String value) {
            addCriterion("return_fee_status <=", value, "returnFeeStatus");
            return (Criteria) this;
        }

        public Criteria andReturnFeeStatusLike(String value) {
            addCriterion("return_fee_status like", value, "returnFeeStatus");
            return (Criteria) this;
        }

        public Criteria andReturnFeeStatusNotLike(String value) {
            addCriterion("return_fee_status not like", value, "returnFeeStatus");
            return (Criteria) this;
        }

        public Criteria andReturnFeeStatusIn(List<String> values) {
            addCriterion("return_fee_status in", values, "returnFeeStatus");
            return (Criteria) this;
        }

        public Criteria andReturnFeeStatusNotIn(List<String> values) {
            addCriterion("return_fee_status not in", values, "returnFeeStatus");
            return (Criteria) this;
        }

        public Criteria andReturnFeeStatusBetween(String value1, String value2) {
            addCriterion("return_fee_status between", value1, value2, "returnFeeStatus");
            return (Criteria) this;
        }

        public Criteria andReturnFeeStatusNotBetween(String value1, String value2) {
            addCriterion("return_fee_status not between", value1, value2, "returnFeeStatus");
            return (Criteria) this;
        }

        public Criteria andSelfHelpCloseStatusIsNull() {
            addCriterion("self_help_close_status is null");
            return (Criteria) this;
        }

        public Criteria andSelfHelpCloseStatusIsNotNull() {
            addCriterion("self_help_close_status is not null");
            return (Criteria) this;
        }

        public Criteria andSelfHelpCloseStatusEqualTo(String value) {
            addCriterion("self_help_close_status =", value, "selfHelpCloseStatus");
            return (Criteria) this;
        }

        public Criteria andSelfHelpCloseStatusNotEqualTo(String value) {
            addCriterion("self_help_close_status <>", value, "selfHelpCloseStatus");
            return (Criteria) this;
        }

        public Criteria andSelfHelpCloseStatusGreaterThan(String value) {
            addCriterion("self_help_close_status >", value, "selfHelpCloseStatus");
            return (Criteria) this;
        }

        public Criteria andSelfHelpCloseStatusGreaterThanOrEqualTo(String value) {
            addCriterion("self_help_close_status >=", value, "selfHelpCloseStatus");
            return (Criteria) this;
        }

        public Criteria andSelfHelpCloseStatusLessThan(String value) {
            addCriterion("self_help_close_status <", value, "selfHelpCloseStatus");
            return (Criteria) this;
        }

        public Criteria andSelfHelpCloseStatusLessThanOrEqualTo(String value) {
            addCriterion("self_help_close_status <=", value, "selfHelpCloseStatus");
            return (Criteria) this;
        }

        public Criteria andSelfHelpCloseStatusLike(String value) {
            addCriterion("self_help_close_status like", value, "selfHelpCloseStatus");
            return (Criteria) this;
        }

        public Criteria andSelfHelpCloseStatusNotLike(String value) {
            addCriterion("self_help_close_status not like", value, "selfHelpCloseStatus");
            return (Criteria) this;
        }

        public Criteria andSelfHelpCloseStatusIn(List<String> values) {
            addCriterion("self_help_close_status in", values, "selfHelpCloseStatus");
            return (Criteria) this;
        }

        public Criteria andSelfHelpCloseStatusNotIn(List<String> values) {
            addCriterion("self_help_close_status not in", values, "selfHelpCloseStatus");
            return (Criteria) this;
        }

        public Criteria andSelfHelpCloseStatusBetween(String value1, String value2) {
            addCriterion("self_help_close_status between", value1, value2, "selfHelpCloseStatus");
            return (Criteria) this;
        }

        public Criteria andSelfHelpCloseStatusNotBetween(String value1, String value2) {
            addCriterion("self_help_close_status not between", value1, value2, "selfHelpCloseStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("order_status like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("order_status not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andEndStatusIsNull() {
            addCriterion("end_status is null");
            return (Criteria) this;
        }

        public Criteria andEndStatusIsNotNull() {
            addCriterion("end_status is not null");
            return (Criteria) this;
        }

        public Criteria andEndStatusEqualTo(String value) {
            addCriterion("end_status =", value, "endStatus");
            return (Criteria) this;
        }

        public Criteria andEndStatusNotEqualTo(String value) {
            addCriterion("end_status <>", value, "endStatus");
            return (Criteria) this;
        }

        public Criteria andEndStatusGreaterThan(String value) {
            addCriterion("end_status >", value, "endStatus");
            return (Criteria) this;
        }

        public Criteria andEndStatusGreaterThanOrEqualTo(String value) {
            addCriterion("end_status >=", value, "endStatus");
            return (Criteria) this;
        }

        public Criteria andEndStatusLessThan(String value) {
            addCriterion("end_status <", value, "endStatus");
            return (Criteria) this;
        }

        public Criteria andEndStatusLessThanOrEqualTo(String value) {
            addCriterion("end_status <=", value, "endStatus");
            return (Criteria) this;
        }

        public Criteria andEndStatusLike(String value) {
            addCriterion("end_status like", value, "endStatus");
            return (Criteria) this;
        }

        public Criteria andEndStatusNotLike(String value) {
            addCriterion("end_status not like", value, "endStatus");
            return (Criteria) this;
        }

        public Criteria andEndStatusIn(List<String> values) {
            addCriterion("end_status in", values, "endStatus");
            return (Criteria) this;
        }

        public Criteria andEndStatusNotIn(List<String> values) {
            addCriterion("end_status not in", values, "endStatus");
            return (Criteria) this;
        }

        public Criteria andEndStatusBetween(String value1, String value2) {
            addCriterion("end_status between", value1, value2, "endStatus");
            return (Criteria) this;
        }

        public Criteria andEndStatusNotBetween(String value1, String value2) {
            addCriterion("end_status not between", value1, value2, "endStatus");
            return (Criteria) this;
        }

        public Criteria andSumPowerIsNull() {
            addCriterion("sum_power is null");
            return (Criteria) this;
        }

        public Criteria andSumPowerIsNotNull() {
            addCriterion("sum_power is not null");
            return (Criteria) this;
        }

        public Criteria andSumPowerEqualTo(String value) {
            addCriterion("sum_power =", value, "sumPower");
            return (Criteria) this;
        }

        public Criteria andSumPowerNotEqualTo(String value) {
            addCriterion("sum_power <>", value, "sumPower");
            return (Criteria) this;
        }

        public Criteria andSumPowerGreaterThan(String value) {
            addCriterion("sum_power >", value, "sumPower");
            return (Criteria) this;
        }

        public Criteria andSumPowerGreaterThanOrEqualTo(String value) {
            addCriterion("sum_power >=", value, "sumPower");
            return (Criteria) this;
        }

        public Criteria andSumPowerLessThan(String value) {
            addCriterion("sum_power <", value, "sumPower");
            return (Criteria) this;
        }

        public Criteria andSumPowerLessThanOrEqualTo(String value) {
            addCriterion("sum_power <=", value, "sumPower");
            return (Criteria) this;
        }

        public Criteria andSumPowerLike(String value) {
            addCriterion("sum_power like", value, "sumPower");
            return (Criteria) this;
        }

        public Criteria andSumPowerNotLike(String value) {
            addCriterion("sum_power not like", value, "sumPower");
            return (Criteria) this;
        }

        public Criteria andSumPowerIn(List<String> values) {
            addCriterion("sum_power in", values, "sumPower");
            return (Criteria) this;
        }

        public Criteria andSumPowerNotIn(List<String> values) {
            addCriterion("sum_power not in", values, "sumPower");
            return (Criteria) this;
        }

        public Criteria andSumPowerBetween(String value1, String value2) {
            addCriterion("sum_power between", value1, value2, "sumPower");
            return (Criteria) this;
        }

        public Criteria andSumPowerNotBetween(String value1, String value2) {
            addCriterion("sum_power not between", value1, value2, "sumPower");
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