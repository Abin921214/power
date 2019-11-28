package com.jzhl.power.mapper;

import com.jzhl.power.model.PowDevicePort;
import com.jzhl.power.model.PowDevicePortExample;
import org.apache.ibatis.annotations.Mapper;

/**
 * PowDevicePortDAO继承基类
 */
@Mapper
public interface PowDevicePortDAO extends MyBatisBaseDao<PowDevicePort, Integer, PowDevicePortExample> {
}