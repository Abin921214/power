package com.jzhl.power.service;

import com.jzhl.power.mapper.PowRechargeDAO;
import com.jzhl.power.model.PowRecharge;
import com.jzhl.power.model.PowRechargeExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PowWxRechargeService {

    @Resource
    PowRechargeDAO powRechargeDAO;

    public List<PowRecharge> selectByExample(PowRechargeExample powRechargeExample){
        return powRechargeDAO.selectByExample(powRechargeExample);
    }

    public int insertSelective(PowRecharge powRecharge){
        return powRechargeDAO.insertSelective(powRecharge);
    }
}
