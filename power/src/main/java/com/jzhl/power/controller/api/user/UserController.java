package com.jzhl.power.controller.api.user;

import com.jzhl.power.bean.BaseResult;
import com.jzhl.power.model.*;
import com.jzhl.power.service.*;
import com.jzhl.power.util.MyUtils;
import com.jzhl.power.util.WXUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    PowWxUserService powWxUserService;

    @Resource
    PowOrderService powWxOrderService;

    @Resource
    PowDeviceService powDeviceService;

    @Resource
    PowWxRechargeService powWxRechargeService;

    @Resource
    PowWxUserCardService powWxUserCardService;

    @Resource
    PowCardService powCardService;

    final String appID = "wx041b7d5ff09f3a1e";

    final String secret = "9ee28817d4f36efdd20475f984167305";

    /**
     * wx用户登录
     * @return json数据
     */
    @ResponseBody
    @RequestMapping("/login")
    public BaseResult login(String code) {

        Map<String, Object> userMap = new HashMap<>();

        try {

            String URL = "https://api.weixin.qq.com/sns/jscode2session?appid="+appID+"&secret="+secret+"&js_code="+code+"&grant_type=authorization_code";
            String temp = WXUtils.getRemotePortData(URL, null, null);


            if(MyUtils.checkStrNotEmpty(temp)) {
                Map<String,Object> map = WXUtils.processJSONStrToMap(temp);

                if(map != null && map.get("openid") != null && MyUtils.checkStrNotEmpty(map.get("openid").toString())){

                    String openId = map.get("openid").toString();

                    PowWxUserExample powWxUserExample = new PowWxUserExample();
                    PowWxUserExample.Criteria criteria = powWxUserExample.createCriteria();
                    criteria.andWxOpenidEqualTo(openId);
                    criteria.andDelFlagEqualTo("0");
                    criteria.andStatusEqualTo("0");
                    List<PowWxUser> powWxUserList = powWxUserService.selectByExample(powWxUserExample);
                    if(powWxUserList.size() > 0){

                        userMap.put("userInfo", powWxUserList.get(0));

                        PowOrderExample powOrderExample = new PowOrderExample();
                        powOrderExample.setOrderByClause("id desc");
                        PowOrderExample.Criteria orderCriteria = powOrderExample.createCriteria();
                        orderCriteria.andUserIdEqualTo(powWxUserList.get(0).getId());
                        orderCriteria.andUserTypeEqualTo("1");
                        orderCriteria.andDelFlagEqualTo("0");
                        orderCriteria.andStatusEqualTo("0");

                        List<PowOrder> powOrderList = powWxOrderService.selectByExample(powOrderExample);
                        if(powOrderList.size() > 0){
                            userMap.put("order", powOrderList.get(0));
                        }

                        return new BaseResult(1,"登录成功",userMap);
                    }else{
                        PowWxUser powWxUser = new PowWxUser();
                        powWxUser.setWxOpenid(openId);
                        powWxUser.setBuildTime(new Date());
                        int id = powWxUserService.insertSelective(powWxUser);
                        if(id > 0){
                            powWxUserList = powWxUserService.selectByExample(powWxUserExample);

                            userMap.put("userInfo", powWxUserList.get(0));


                            PowOrderExample powOrderExample = new PowOrderExample();
                            powOrderExample.setOrderByClause("id desc");
                            PowOrderExample.Criteria orderCriteria = powOrderExample.createCriteria();
                            orderCriteria.andUserIdEqualTo(powWxUserList.get(0).getId());
                            orderCriteria.andUserTypeEqualTo("1");
                            orderCriteria.andDelFlagEqualTo("0");
                            orderCriteria.andStatusEqualTo("0");

                            List<PowOrder> powOrderList = powWxOrderService.selectByExample(powOrderExample);
                            if(powOrderList.size() > 0){
                                userMap.put("order", powOrderList.get(0));
                            }

                            return new BaseResult(1,"登录成功",userMap);
                        }
                    }
                }else {
                    throw new Exception();
                }
            }else {
                throw new Exception();
            }

        } catch (Exception e) {
            e.printStackTrace();
            return new BaseResult(0,"错误1",null);
        }
        return new BaseResult(0,"错误2",null);

    }


    /**
     * 获取用户信息
     * @return
     */
    @ResponseBody
    @RequestMapping("/userInfo")
    public BaseResult getUserInfo(String openId){

        Map<String, Object> userMap = new HashMap<>();
        if(openId == null){
            return new BaseResult(0,"获取用户信息失败", null);
        }

        if(openId.equals("")){
            return new BaseResult(0,"获取用户信息失败", null);
        }

        PowWxUserExample powWxUserExample = new PowWxUserExample();
        PowWxUserExample.Criteria criteria = powWxUserExample.createCriteria();
        criteria.andWxOpenidEqualTo(openId);
        criteria.andDelFlagEqualTo("0");
        criteria.andStatusEqualTo("0");
        List<PowWxUser> powWxUserList = powWxUserService.selectByExample(powWxUserExample);
        if(powWxUserList.size() > 0){

            userMap.put("userInfo", powWxUserList.get(0));

            PowOrderExample powOrderExample = new PowOrderExample();
            powOrderExample.setOrderByClause("id desc");
            PowOrderExample.Criteria orderCriteria = powOrderExample.createCriteria();
            orderCriteria.andUserIdEqualTo(powWxUserList.get(0).getId());
            orderCriteria.andUserTypeEqualTo("1");
            orderCriteria.andDelFlagEqualTo("0");
            orderCriteria.andStatusEqualTo("0");

            List<PowOrder> powOrderList = powWxOrderService.selectByExample(powOrderExample);
            if(powOrderList.size() > 0){
                userMap.put("order", powOrderList.get(0));
            }
        }else{
            return new BaseResult(0,"用户信息不存在",null);
        }
        return new BaseResult(1,"ok",userMap);
    }


    @ResponseBody
    @RequestMapping("/orderList")
    public BaseResult getUserOrderList(String openid,String nowPage){

        if(openid == null){
            return new BaseResult(0,"用户信息不能为空", null);
        }

        PowWxUserExample powWxUserExample = new PowWxUserExample();
        PowWxUserExample.Criteria criteria = powWxUserExample.createCriteria();
        criteria.andWxOpenidEqualTo(openid);
        criteria.andDelFlagEqualTo("0");
        criteria.andStatusEqualTo("0");

        List<PowWxUser> powWxUserList = powWxUserService.selectByExample(powWxUserExample);
        if(powWxUserList.size() > 0){
            PowOrderExample powOrderExample = new PowOrderExample();
            powOrderExample.setOrderByClause("id desc");
            powOrderExample.setLimit(10);
            powOrderExample.setOffset(new Long(Integer.valueOf(nowPage) * 10));

            PowOrderExample.Criteria criteria1 = powOrderExample.createCriteria();
            criteria1.andDelFlagEqualTo("0");
            criteria1.andStatusEqualTo("0");
            criteria1.andUserIdEqualTo(powWxUserList.get(0).getId());

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
        }
        return new BaseResult(0,"订单不存在", null);
    }

    @ResponseBody
    @RequestMapping("/rechargeList")
    public BaseResult getRecharge(String openid){

        if(openid == null){
            return new BaseResult(0,"用户id不能为空",null);
        }

        PowRechargeExample powRechargeExample = new PowRechargeExample();
        PowRechargeExample.Criteria criteria = powRechargeExample.createCriteria();
        criteria.andDelFlagEqualTo("0");
        criteria.andStatusEqualTo("0");
        criteria.andLinkInfoEqualTo(openid);
        criteria.andLinkTypeEqualTo("1");

        List<PowRecharge> rechargeList = powWxRechargeService.selectByExample(powRechargeExample);

        return new BaseResult(1,"ok",rechargeList);

    }

    @ResponseBody
    @RequestMapping("/myCard")
    public BaseResult myCardList(String openid){
        PowWxUserExample powWxUserExample = new PowWxUserExample();
        PowWxUserExample.Criteria criteria = powWxUserExample.createCriteria();
        criteria.andWxOpenidEqualTo(openid);
        criteria.andDelFlagEqualTo("0");
        criteria.andStatusEqualTo("0");
        List<PowWxUser> powWxUserList = powWxUserService.selectByExample(powWxUserExample);
        if(powWxUserList.size() >0){
            PowWxUserCardExample powWxUserCardExample = new PowWxUserCardExample();
            PowWxUserCardExample.Criteria criteria1 = powWxUserCardExample.createCriteria();
            criteria1.andWxUserIdEqualTo(powWxUserList.get(0).getId());
            criteria1.andDelFlagEqualTo("0");
            criteria1.andStatusEqualTo("0");

            List<PowWxUserCard> powWxUserCardList =  powWxUserCardService.selectByExample(powWxUserCardExample);
            if(powWxUserCardList.size() > 0){
                PowCardExample powCardExample = new PowCardExample();
                PowCardExample.Criteria criteria2 = powCardExample.createCriteria();
                List<Integer> list = new ArrayList<>();
                for (PowWxUserCard powWxUserCard : powWxUserCardList) {
                    list.add(powWxUserCard.getCardId());
                }
                criteria2.andIdIn(list);
                criteria2.andDelFlagEqualTo("0");
                criteria2.andStatusEqualTo("0");
                List<PowCard> powCardList = powCardService.selectByExample(powCardExample);
                return new BaseResult(1,"ok",powCardList);
            }else{
                return new BaseResult(0,"该用户暂未邦定卡号",null);
            }
        }else{
            return new BaseResult(0,"用户信息不存在",null);
        }
    }


    @ResponseBody
    @RequestMapping("/record")
    public BaseResult record(String openid,String nowPage){

        if(openid == null){
            return new BaseResult(0,"用户id不能为空",null);
        }

        List<Integer> list = new ArrayList<>();

        PowWxUserExample powWxUserExample = new PowWxUserExample();
        PowWxUserExample.Criteria criteria = powWxUserExample.createCriteria();
        criteria.andWxOpenidEqualTo(openid);
        criteria.andDelFlagEqualTo("0");
        criteria.andStatusEqualTo("0");
        List<PowWxUser> powWxUserList = powWxUserService.selectByExample(powWxUserExample);
        if(powWxUserList.size() <= 0){
            return new BaseResult(0,"用户不存在",null);
        }else{
            list.add(powWxUserList.get(0).getId());
        }

        PowWxUserCardExample powWxUserCardExample = new PowWxUserCardExample();
        PowWxUserCardExample.Criteria criteria1 = powWxUserCardExample.createCriteria();
        criteria1.andWxUserIdEqualTo(powWxUserList.get(0).getId());
        criteria1.andDelFlagEqualTo("0");
        criteria1.andStatusEqualTo("0");
        List<PowWxUserCard> powWxUserCardList = powWxUserCardService.selectByExample(powWxUserCardExample);
        if(powWxUserCardList.size() > 0){
            for (PowWxUserCard powWxUserCard : powWxUserCardList) {
                list.add(powWxUserCard.getCardId());
            }
        }

        PowRechargeExample powRechargeExample = new PowRechargeExample();
        powRechargeExample.setOrderByClause("id desc");
        powRechargeExample.setLimit(10);
        powRechargeExample.setOffset(new Long(Integer.valueOf(nowPage) * 10));
        PowRechargeExample.Criteria criteria2 = powRechargeExample.createCriteria();
        criteria2.andLinkIdIn(list);
        criteria2.andDelFlagEqualTo("0");
        criteria2.andStatusEqualTo("0");
        List<PowRecharge> powRechargeList = powWxRechargeService.selectByExample(powRechargeExample);
        return new BaseResult(1,"ok",powRechargeList);
    }

}
