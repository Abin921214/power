package com.jzhl.power.controller.api.user;

import com.jzhl.power.bean.BaseResult;
import com.jzhl.power.model.*;
import com.jzhl.power.service.*;
import com.jzhl.power.util.StringUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.*;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Resource
    PowDeviceService powDeviceService;

    @Resource
    PowDevicePortService powDevicePortService;

    @Resource
    PowOrderService powWxOrderService;

    @Resource
    PowWxUserService powWxUserService;

    @Resource
    PowDistrictConfigService powDistrictConfigService;

    @Resource
    PowCardService powCardService;


    @ResponseBody
    @RequestMapping("/createOrder")
    public BaseResult createOrder(String deviceSerial, String portNum,String openid,String cardId,String money, String type){

        List<PowCard> powCardList = new ArrayList<>();

//        System.out.println(deviceSerial + ":" + portNum + ":" + openid + ":" + money);

        if(deviceSerial == null && portNum == null || openid == null || money == null || type == null){
            return new BaseResult(0,"订单创建失败,必传不能为空", null);
        }

        // 判断金额大小，金额不能为空
        if(new BigDecimal(money).compareTo(BigDecimal.ZERO) == 0 || new BigDecimal(money).compareTo(BigDecimal.ZERO) == -1){
            return new BaseResult(0,"金额不能为空", null);
        }

        // 查询用户信息
        PowWxUserExample powWxUserExample1 = new PowWxUserExample();
        PowWxUserExample.Criteria criteriaUser = powWxUserExample1.createCriteria();
        criteriaUser.andWxOpenidEqualTo(openid);
        criteriaUser.andStatusEqualTo("0");
        criteriaUser.andDelFlagEqualTo("0");
        List<PowWxUser> powWxUserList = powWxUserService.selectByExample(powWxUserExample1);
        if(powWxUserList.size() > 0){
            if(!type.equals("wx")){
                if(powWxUserList.get(0).getBalance().compareTo(new BigDecimal(money)) == -1){
                    return new BaseResult(0,"用户余额不够", null);
                }
            }
        }else{
            return new BaseResult(0,"用户不存在", null);
        }

        // 根据设备序列号，查询设备信息
        PowDeviceExample powDeviceExample = new PowDeviceExample();
        PowDeviceExample.Criteria criteria = powDeviceExample.createCriteria();
        criteria.andStatusEqualTo("0");
        criteria.andDelFlagEqualTo("0");
        criteria.andDeviceSerialEqualTo(deviceSerial);

        List<PowDevice> deviceList = powDeviceService.selectByExample(powDeviceExample);
        if(deviceList.size() < 1){
            return new BaseResult(0,"设备不存在", null);
        }

        // 更加设备ID 和传递的端口号，查询端口是否存在
        PowDevicePortExample powDevicePortExample = new PowDevicePortExample();
        PowDevicePortExample.Criteria criteria1 = powDevicePortExample.createCriteria();
        criteria1.andStatusEqualTo("0");
        criteria1.andDelFlagEqualTo("0");
        criteria1.andDeviceIdEqualTo(deviceList.get(0).getId());
        criteria1.andPortEqualTo(Integer.valueOf(portNum));

        List<PowDevicePort> powDevicePortList = powDevicePortService.selectByExample(powDevicePortExample);
        if(powDevicePortList.size() < 1){
            return new BaseResult(0,"端口不存在", null);
        }else{
            if(!powDevicePortList.get(0).getPortStatus().equals("0")){
                return new BaseResult(0,"端口使用中或异常, 订单创建失败", null);
            }
        }

        // 根据对应的 小区ID 获取对应的配置信息
        PowDistrictConfigExample powDistrictConfigExample = new PowDistrictConfigExample();
        PowDistrictConfigExample.Criteria criteria3 = powDistrictConfigExample.createCriteria();
        criteria3.andDevDistrictIdEqualTo(deviceList.get(0).getDevDistrictId());
        criteria3.andOrderWayEqualTo("0");
        criteria3.andStatusEqualTo("0");
        criteria3.andDelFlagEqualTo("0");

        List<PowDistrictConfig> powDistrictConfigList = powDistrictConfigService.selectByExample(powDistrictConfigExample);
        if(powDistrictConfigList.size() < 1){
            return new BaseResult(0,"配置信息不存在", null);
        }

        // 添加对应的订单信息
        String orderno = StringUtil.getRandom(8);

        PowOrder powOrder = new PowOrder();
        powOrder.setOrderNo(orderno);
        powOrder.setOrderWay("0");
        powOrder.setDeviceId(deviceList.get(0).getId());
        powOrder.setDevicePortId(powDevicePortList.get(0).getId());
        powOrder.setPort(Integer.valueOf(portNum));
        powOrder.setCompanyId(deviceList.get(0).getCompanyId());
        powOrder.setHeId(deviceList.get(0).getHeId());
        powOrder.setDevDistrictId(deviceList.get(0).getDevDistrictId());
        powOrder.setUserId(powWxUserList.get(0).getId());
        powOrder.setUserType("1");
        powOrder.setStartTime(new Date());
        powOrder.setPayFee(new BigDecimal(money));
        powOrder.setUnitFee(powDistrictConfigList.get(0).getUnitFee());
        powOrder.setUnitMin(powDistrictConfigList.get(0).getUnitMin());
        powOrder.setReturnFeeStatus(powDistrictConfigList.get(0).getReturnFeeStatus());
        powOrder.setSelfHelpCloseStatus(powDistrictConfigList.get(0).getSelfHelpCloseStatus());
        powOrder.setOrderStatus("0");
        powOrder.setBuildUserid(powWxUserList.get(0).getId());
        powOrder.setBuildTime(new Date());

        if(cardId != null){
            //卡内的信息
            PowCardExample powCardExample = new PowCardExample();
            PowCardExample.Criteria criteria4 = powCardExample.createCriteria();
            criteria4.andCardNoEqualTo(cardId);
            criteria4.andStatusEqualTo("0");
            criteria4.andDelFlagEqualTo("0");

            powCardList = powCardService.selectByExample(powCardExample);
        }

        if(powCardList.size() > 0){
            powOrder.setCardId(powCardList.get(0).getId());
            powOrder.setCardNo(cardId);
        }

        // 创建订单
        int id = powWxOrderService.insertSelective(powOrder);
        if(id > 0){
            return new BaseResult(1,"订单创建成功", powOrder);
        }
        return new BaseResult(0,"订单创建失败", null);
    }


    @ResponseBody
    @RequestMapping("/orderDetail")
    public BaseResult getOrderDetailById(Integer id){

        Map<String,Object> map = new HashMap<>();

        if(id == null){
            return new BaseResult(0,"ID不能为空", null);
        }

        PowOrderExample powOrderExample = new PowOrderExample();
        PowOrderExample.Criteria criteria = powOrderExample.createCriteria();
        criteria.andIdEqualTo(id);
        criteria.andStatusEqualTo("0");
        criteria.andDelFlagEqualTo("0");

        List<PowOrder> powOrderList = powWxOrderService.selectByExample(powOrderExample);
        if(powOrderList.size() > 0){

            PowDeviceExample powDeviceExample = new PowDeviceExample();
            PowDeviceExample.Criteria criteria2 = powDeviceExample.createCriteria();
            criteria2.andIdEqualTo(powOrderList.get(0).getDeviceId());
            List<PowDevice> deviceList = powDeviceService.selectByExample(powDeviceExample);
            if(deviceList.size() > 0){
                map.put("device", deviceList.get(0));
            }else{
                return new BaseResult(0,"设备不存在", null);
            }

            map.put("order", powOrderList.get(0));

            return new BaseResult(1,"ok", map);
        }else{
            return new BaseResult(0,"订单不存在", null);
        }
    }
}
