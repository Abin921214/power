package com.jzhl.power.service;

import com.jzhl.power.mapper.PowDeviceLogDAO;
import com.jzhl.power.model.PowDeviceLog;
import com.jzhl.power.model.PowDeviceLogExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PowDeviceLogService {

    @Resource
    PowDeviceLogDAO powDeviceLogDAO;

    public List<PowDeviceLog> selectByExample(PowDeviceLogExample powDeviceLogExample){
        return powDeviceLogDAO.selectByExample(powDeviceLogExample);
    }

    public int insertSelective(PowDeviceLog powDeviceLog){
        return powDeviceLogDAO.insertSelective(powDeviceLog);
    }
}
