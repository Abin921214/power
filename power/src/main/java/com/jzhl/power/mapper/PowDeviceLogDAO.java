package com.jzhl.power.mapper;

import com.jzhl.power.model.PowDeviceLog;
import com.jzhl.power.model.PowDeviceLogExample;
import org.apache.ibatis.annotations.Mapper;

/**
 * PowDeviceLogDAO继承基类
 */
@Mapper
public interface PowDeviceLogDAO extends MyBatisBaseDao<PowDeviceLog, Integer, PowDeviceLogExample> {
}