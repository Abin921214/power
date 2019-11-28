package com.jzhl.power.service;

import com.jzhl.power.mapper.PowDistrictConfigDAO;
import com.jzhl.power.model.PowDistrictConfig;
import com.jzhl.power.model.PowDistrictConfigExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PowDistrictConfigService {

    @Resource
    PowDistrictConfigDAO powDistrictConfigDAO;

    public List<PowDistrictConfig> selectByExample(PowDistrictConfigExample powDistrictConfigExample){
        return powDistrictConfigDAO.selectByExample(powDistrictConfigExample);
    }

    public int insertSelective(PowDistrictConfig powDistrictConfig){
        return powDistrictConfigDAO.insertSelective(powDistrictConfig);
    }
}
