package com.jzhl.power.controller.api.user;

import com.jzhl.power.bean.BaseResult;
import com.jzhl.power.model.*;
import com.jzhl.power.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/card")
public class CardController {

    @Resource
    PowCardService powCardService;

    @Resource
    PowWxUserService powWxUserService;

    @Resource
    PowWxUserCardService powWxUserCardService;

    @Resource
    PowOrderService powWxOrderService;

    @Resource
    PowDeviceService powDeviceService;

    @ResponseBody
    @RequestMapping("/addCard")
    public BaseResult addCard(String cardNo, String openid){
        if(cardNo == null || cardNo.equals("")){
            return new BaseResult(0,"卡号不能为空",null);
        }
        PowCardExample powCardExample = new PowCardExample();
        PowCardExample.Criteria criteria = powCardExample.createCriteria();
        criteria.andCardNoEqualTo(cardNo);
        criteria.andDelFlagEqualTo("0");
        criteria.andStatusEqualTo("0");
        List<PowCard> powCardList =  powCardService.selectByExample(powCardExample);
        if(powCardList.size() > 0){
            PowWxUserExample powWxUserExample = new PowWxUserExample();
            PowWxUserExample.Criteria criteria1 = powWxUserExample.createCriteria();
            criteria1.andWxOpenidEqualTo(openid);
            criteria.andDelFlagEqualTo("0");
            criteria.andStatusEqualTo("0");
            List<PowWxUser> powWxUserList = powWxUserService.selectByExample(powWxUserExample);
            if(powWxUserList.size() > 0){
                PowWxUserCardExample powWxUserCardExample = new PowWxUserCardExample();
                PowWxUserCardExample.Criteria criteria2 = powWxUserCardExample.createCriteria();
                criteria2.andWxUserIdEqualTo(powWxUserList.get(0).getId());
                criteria2.andCardIdEqualTo(powCardList.get(0).getId());
                criteria2.andDelFlagEqualTo("0");
                criteria2.andStatusEqualTo("0");
                List<PowWxUserCard> powWxUserCardList = powWxUserCardService.selectByExample(powWxUserCardExample);
                if(powWxUserCardList.size() > 0){
                    return new BaseResult(0,"已绑定该卡",null);
                }else{
                    PowWxUserCard powWxUserCard = new PowWxUserCard();
                    powWxUserCard.setWxUserId(powWxUserList.get(0).getId());
                    powWxUserCard.setCardId(powCardList.get(0).getId());
                    powWxUserCard.setBuildTime(new Date());
                    powWxUserCard.setCompanyId(powCardList.get(0).getCompanyId());
                    int id = powWxUserCardService.insertSelective(powWxUserCard);
                    if(id > 0){
                        return new BaseResult(1,"绑卡成功",null);
                    }else{
                        return new BaseResult(0,"绑卡失败",null);
                    }
                }
            }else{
                return new BaseResult(0,"用户不存在",null);
            }
        }else{
            return new BaseResult(0,"卡号不存在",null);
        }
    }


    @ResponseBody
    @RequestMapping("/delCard")
    public BaseResult delCard(String cardNo, String openid){
        if(cardNo == null || openid == null){
            return new BaseResult(0,"关联信息不能为空",null);
        }

        PowCardExample powCardExample = new PowCardExample();
        PowCardExample.Criteria criteria = powCardExample.createCriteria();
        criteria.andCardNoEqualTo(cardNo);
        criteria.andDelFlagEqualTo("0");
        criteria.andStatusEqualTo("0");
        List<PowCard> powCardList = powCardService.selectByExample(powCardExample);
        if(powCardList.size() <= 0){
            return new BaseResult(0,"卡号不存在",null);
        }

        PowWxUserExample powWxUserExample = new PowWxUserExample();
        PowWxUserExample.Criteria criteria1 = powWxUserExample.createCriteria();
        criteria1.andWxOpenidEqualTo(openid);
        criteria1.andDelFlagEqualTo("0");
        criteria1.andStatusEqualTo("0");
        List<PowWxUser> powWxUserList = powWxUserService.selectByExample(powWxUserExample);
        if(powWxUserList.size() <= 0){
            return new BaseResult(0,"用户不存在",null);
        }

        PowWxUserCardExample powWxUserCardExample = new PowWxUserCardExample();
        PowWxUserCardExample.Criteria criteria3 = powWxUserCardExample.createCriteria();
        criteria3.andWxUserIdEqualTo(powWxUserList.get(0).getId());
        criteria3.andCardIdEqualTo(powCardList.get(0).getId());
        criteria3.andDelFlagEqualTo("0");
        criteria3.andStatusEqualTo("0");
        List<PowWxUserCard> powWxUserCardList = powWxUserCardService.selectByExample(powWxUserCardExample);

        if(powWxUserCardList.size() > 0){
            PowWxUserCard powWxUserCard = new PowWxUserCard();
            powWxUserCard.setDelFlag("1");

            int xid = powWxUserCardService.updateByExampleSelective(powWxUserCard,powWxUserCardExample);
            if(xid > 0){
                return new BaseResult(1,"关系解除成功",null);
            }else{
                return new BaseResult(0,"关系解除失败",null);
            }
        }else{
            return new BaseResult(0,"关联信息不存在",null);
        }
    }


    @ResponseBody
    @RequestMapping("/orderList")
    public BaseResult orderList(String cardNo,String nowPage){
        if(cardNo == null || cardNo.equals("")){
            return new BaseResult(0,"卡号不存在",null);
        }

        PowCardExample powCardExample = new PowCardExample();
        PowCardExample.Criteria criteria = powCardExample.createCriteria();
        criteria.andCardNoEqualTo(cardNo);
        criteria.andStatusEqualTo("0");
        criteria.andDelFlagEqualTo("0");
        List<PowCard> powCardList = powCardService.selectByExample(powCardExample);
        System.out.println(powCardList);
        if(powCardList.size() > 0){
            PowOrderExample powOrderExample = new PowOrderExample();
            powOrderExample.setOrderByClause("id desc");
            powOrderExample.setLimit(10);
            powOrderExample.setOffset(new Long(Integer.valueOf(nowPage) * 10));

            PowOrderExample.Criteria criteria1 = powOrderExample.createCriteria();
            criteria1.andCardNoEqualTo(cardNo);
            criteria1.andDelFlagEqualTo("0");
            criteria1.andStatusEqualTo("0");
            List<PowOrder> powOrderList = powWxOrderService.selectByExample(powOrderExample);
            for (PowOrder powOrder : powOrderList) {
                PowDeviceExample powDeviceExample = new PowDeviceExample();
                PowDeviceExample.Criteria criteria2 = powDeviceExample.createCriteria();
                criteria2.andIdEqualTo(powOrder.getDeviceId());
                List<PowDevice> deviceList = powDeviceService.selectByExample(powDeviceExample);
                if(deviceList.size() > 0){
                    powOrder.setRemark(deviceList.get(0).getDeviceName());
                }
            }
            return new BaseResult(1,"ok",powOrderList);

        }else{
            return new BaseResult(0,"卡号不存在",null);
        }
    }
}
