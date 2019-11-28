package com.jzhl.power.service;

import com.jzhl.power.mapper.PowWxUserCardDAO;
import com.jzhl.power.model.PowWxUserCard;
import com.jzhl.power.model.PowWxUserCardExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PowWxUserCardService {

    @Resource
    PowWxUserCardDAO powWxUserCardDAO;

    public List<PowWxUserCard> selectByExample(PowWxUserCardExample powWxUserCardExample){
        return powWxUserCardDAO.selectByExample(powWxUserCardExample);
    }

    public int insertSelective(PowWxUserCard powWxUserCard){
        return powWxUserCardDAO.insertSelective(powWxUserCard);
    }

    public int updateByExampleSelective(PowWxUserCard powWxUserCard, PowWxUserCardExample powWxUserCardExample){
        return powWxUserCardDAO.updateByExampleSelective(powWxUserCard, powWxUserCardExample);
    }
}
