package com.jzhl.power.controller.api.device;

import com.jzhl.power.bean.BaseResult;
import com.jzhl.power.model.*;
import com.jzhl.power.service.PowDevicePortService;
import com.jzhl.power.service.PowDeviceService;
import com.jzhl.power.service.PowDistrictConfigService;
import com.jzhl.power.service.PowWxUserService;
import com.jzhl.power.util.GetLocationBaiduMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/device")
public class DeviceController {

    @Resource
    PowDeviceService powDeviceService;

    @Resource
    PowDevicePortService powDevicePortService;

    @Resource
    PowDistrictConfigService powDistrictConfigService;

    @Resource
    PowWxUserService powWxUserService;

    @ResponseBody
    @RequestMapping("/list")
    public BaseResult list(String longitude, String latitude){

        String city = GetLocationBaiduMap.getCityByLocation(longitude,latitude);

        PowDeviceExample powDeviceExample = new PowDeviceExample();
        PowDeviceExample.Criteria criteria = powDeviceExample.createCriteria();
        criteria.andDelFlagEqualTo("0");
        criteria.andStatusEqualTo("0");
        criteria.andCityLike(city);

        List<PowDevice> list = powDeviceService.selectByExample(powDeviceExample);

        return new BaseResult(1,"ok",list);
    }


    @ResponseBody
    @RequestMapping("/deviceInfo")
    public BaseResult deviceInfo(String id){

        Map<String, Object> map = new HashMap<>();

        PowDeviceExample powDeviceExample = new PowDeviceExample();
        PowDeviceExample.Criteria criteria = powDeviceExample.createCriteria();
        criteria.andDelFlagEqualTo("0");
        criteria.andStatusEqualTo("0");
        criteria.andIdEqualTo(Integer.valueOf(id));

        List<PowDevice> list = powDeviceService.selectByExample(powDeviceExample);
        if(list.size() > 0){
            map.put("PowDevice", list.get(0));
        }

        PowDevicePortExample powDevicePortExample = new PowDevicePortExample();
        PowDevicePortExample.Criteria criteriaPort = powDevicePortExample.createCriteria();
        criteriaPort.andDeviceIdEqualTo(Integer.valueOf(id));
        criteriaPort.andDelFlagEqualTo("0");
        criteriaPort.andStatusEqualTo("0");

        List<PowDevicePort> listPort = powDevicePortService.selectByExample(powDevicePortExample);
        if(listPort.size()>0){
            map.put("PowDevicePort", listPort);
        }
        return new BaseResult(1,"ok",map);
    }


    @ResponseBody
    @RequestMapping("/deviceAndUser")
    public BaseResult deviceAndUserInfo(String openid, String devDistrictId){

        Map<String,Object> map = new HashMap<>();

        PowDistrictConfigExample powDistrictConfigExample = new PowDistrictConfigExample();
        PowDistrictConfigExample.Criteria criteria = powDistrictConfigExample.createCriteria();
        criteria.andDelFlagEqualTo("0");
        criteria.andStatusEqualTo("0");
        criteria.andDevDistrictIdEqualTo(Integer.valueOf(devDistrictId));
        criteria.andOrderWayEqualTo("0");

        List<PowDistrictConfig> powDistrictConfigList = powDistrictConfigService.selectByExample(powDistrictConfigExample);
        if(powDistrictConfigList.size() > 0){
            map.put("config", powDistrictConfigList.get(0));
        }

        PowWxUserExample powWxUserExample = new PowWxUserExample();
        PowWxUserExample.Criteria criteria1 = powWxUserExample.createCriteria();
        criteria1.andDelFlagEqualTo("0");
        criteria1.andStatusEqualTo("0");
        criteria1.andWxOpenidEqualTo(openid);

        List<PowWxUser> powWxUserList = powWxUserService.selectByExample(powWxUserExample);
        if(powWxUserList.size()>0){
            map.put("user", powWxUserList.get(0));
        }

        return new BaseResult(1,"ok", map);
    }

}
