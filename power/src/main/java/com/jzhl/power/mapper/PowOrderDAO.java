package com.jzhl.power.mapper;

import com.jzhl.power.model.PowOrder;
import com.jzhl.power.model.PowOrderExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * PowOrderDAO继承基类
 */
@Mapper
public interface PowOrderDAO extends MyBatisBaseDao<PowOrder, Integer, PowOrderExample> {
}