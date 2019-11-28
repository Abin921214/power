package com.jzhl.power.service;

import com.jzhl.power.mapper.PowOrderDAO;
import com.jzhl.power.model.PowOrder;
import com.jzhl.power.model.PowOrderExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class PowOrderService {

    @Resource
    PowOrderDAO powOrderDAO;

    public List<PowOrder> selectByExample(PowOrderExample powOrderExample){
        return powOrderDAO.selectByExample(powOrderExample);
    }

    public int insertSelective(PowOrder powOrder){
        return powOrderDAO.insertSelective(powOrder);
    }

    public int updateByExampleSelective(PowOrder powOrder, PowOrderExample powOrderExample){
        return powOrderDAO.updateByExampleSelective(powOrder,powOrderExample);
    }

}
