package com.jzhl.power.mapper;

import com.jzhl.power.model.PowCard;
import com.jzhl.power.model.PowCardExample;
import org.apache.ibatis.annotations.Mapper;

/**
 * PowCardDAO继承基类
 */
@Mapper
public interface PowCardDAO extends MyBatisBaseDao<PowCard, Integer, PowCardExample> {
}