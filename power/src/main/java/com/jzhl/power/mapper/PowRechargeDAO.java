package com.jzhl.power.mapper;

import com.jzhl.power.model.PowRecharge;
import com.jzhl.power.model.PowRechargeExample;
import org.apache.ibatis.annotations.Mapper;

/**
 * PowRechargeDAO继承基类
 */
@Mapper
public interface PowRechargeDAO extends MyBatisBaseDao<PowRecharge, Integer, PowRechargeExample> {
}