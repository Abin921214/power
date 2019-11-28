package com.jzhl.power.mapper;

import com.jzhl.power.model.PowWxUserCard;
import com.jzhl.power.model.PowWxUserCardExample;
import org.apache.ibatis.annotations.Mapper;

/**
 * PowWxUserCardDAO继承基类
 */
@Mapper
public interface PowWxUserCardDAO extends MyBatisBaseDao<PowWxUserCard, Integer, PowWxUserCardExample> {
}