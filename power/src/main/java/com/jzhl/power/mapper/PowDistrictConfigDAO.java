package com.jzhl.power.mapper;

import com.jzhl.power.model.PowDistrictConfig;
import com.jzhl.power.model.PowDistrictConfigExample;
import org.apache.ibatis.annotations.Mapper;

/**
 * PowDistrictConfigDAO继承基类
 */
@Mapper
public interface PowDistrictConfigDAO extends MyBatisBaseDao<PowDistrictConfig, Integer, PowDistrictConfigExample> {
}