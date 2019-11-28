package com.jzhl.power.service;

import com.jzhl.power.mapper.PowCardDAO;
import com.jzhl.power.model.PowCard;
import com.jzhl.power.model.PowCardExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PowCardService {

    @Resource
    PowCardDAO powCardDAO;

    public List<PowCard> selectByExample(PowCardExample powCardExample){
        return powCardDAO.selectByExample(powCardExample);
    }

    public int insertSelective(PowCard powCard){
        return powCardDAO.insertSelective(powCard);
    }

    public int updateByExampleSelective(PowCard powCard, PowCardExample powCardExample){
        return powCardDAO.updateByExampleSelective(powCard,powCardExample);
    }
}
