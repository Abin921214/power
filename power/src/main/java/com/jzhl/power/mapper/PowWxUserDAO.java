package com.jzhl.power.mapper;

import com.jzhl.power.model.PowWxUser;
import com.jzhl.power.model.PowWxUserExample;
import org.apache.ibatis.annotations.Mapper;

/**
 * PowWxUserDAO继承基类
 */
@Mapper
public interface PowWxUserDAO extends MyBatisBaseDao<PowWxUser, Integer, PowWxUserExample> {
}