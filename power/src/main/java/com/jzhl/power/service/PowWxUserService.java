package com.jzhl.power.service;

import com.jzhl.power.mapper.PowWxUserDAO;
import com.jzhl.power.model.PowWxUser;
import com.jzhl.power.model.PowWxUserExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PowWxUserService {

    @Resource
    PowWxUserDAO powWxUserDAO;

    public List<PowWxUser> selectByExample(PowWxUserExample powWxUserExample){
        return powWxUserDAO.selectByExample(powWxUserExample);
    }

    public int insertSelective(PowWxUser powWxUser){
        return powWxUserDAO.insertSelective(powWxUser);
    }

    public int updateByExampleSelective(PowWxUser powWxUser, PowWxUserExample powWxUserExample){
        return powWxUserDAO.updateByExampleSelective(powWxUser,powWxUserExample);
    }
}
