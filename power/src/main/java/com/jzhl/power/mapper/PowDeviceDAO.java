package com.jzhl.power.mapper;

import com.jzhl.power.model.PowDevice;
import com.jzhl.power.model.PowDeviceExample;
import org.apache.ibatis.annotations.Mapper;

/**
 * PowDeviceDAO继承基类
 */
@Mapper
public interface PowDeviceDAO extends MyBatisBaseDao<PowDevice, Integer, PowDeviceExample> {
}