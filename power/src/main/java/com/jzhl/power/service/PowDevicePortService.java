package com.jzhl.power.service;

import com.jzhl.power.mapper.PowDevicePortDAO;
import com.jzhl.power.model.PowDevicePort;
import com.jzhl.power.model.PowDevicePortExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PowDevicePortService {

    @Resource
    PowDevicePortDAO powDevicePortDAO;

    public List<PowDevicePort> selectByExample(PowDevicePortExample powDevicePortExample){
        return powDevicePortDAO.selectByExample(powDevicePortExample);
    }

    public int insertSelective(PowDevicePort powDevicePort){
        return powDevicePortDAO.insertSelective(powDevicePort);
    }

    public int updateByExampleSelective(PowDevicePort powDevicePort,PowDevicePortExample powDevicePortExample){
        return powDevicePortDAO.updateByExampleSelective(powDevicePort,powDevicePortExample);
    }

    public int updateByPrimaryKey(PowDevicePort powDevicePort){
        return powDevicePortDAO.updateByPrimaryKey(powDevicePort);
    }
}
