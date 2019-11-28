package com.jzhl.power.service;

import com.jzhl.power.mapper.PowDeviceDAO;
import com.jzhl.power.model.PowDevice;
import com.jzhl.power.model.PowDeviceExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PowDeviceService {

    @Resource
    PowDeviceDAO powDeviceDAO;

    public List<PowDevice> selectByExample(PowDeviceExample powDeviceExample){
        return powDeviceDAO.selectByExample(powDeviceExample);
    }

    public int insertSelective(PowDevice powDevice){
        return powDeviceDAO.insertSelective(powDevice);
    }

    public int updateByExampleSelective(PowDevice powDevice,PowDeviceExample powDeviceExample){
        return powDeviceDAO.updateByExampleSelective(powDevice,powDeviceExample);
    }
}
