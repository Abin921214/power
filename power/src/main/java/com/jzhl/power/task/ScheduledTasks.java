package com.jzhl.power.task;


import com.jzhl.power.model.PowDevice;
import com.jzhl.power.model.PowDeviceExample;
import com.jzhl.power.model.PowDeviceLog;
import com.jzhl.power.service.PowDeviceLogService;
import com.jzhl.power.service.PowDeviceService;
import com.jzhl.power.util.DateUtil;
import com.jzhl.power.util.RedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *  创建定时任务
 *  每过5s在控制台打印当前时间。
 *
 * @Scheduled(fixedRate = 5000) ：上一次开始执行时间点之后5秒再执行
 * @Scheduled(fixedDelay = 5000) ：上一次执行完毕时间点之后5秒再执行
 * @Scheduled(initialDelay=1000, fixedRate=5000) ：第一次延迟1秒后执行，之后按fixedRate的规则每5秒执行一次
 * @Scheduled(cron=” /5 “) ：通过cron表达式定义规则，什么是cro表达式，自行搜索引擎。
 */

@Component     // 暂时关闭  需要是开启
public class ScheduledTasks {

    @Resource
    RedisUtil redisUtil;

    @Resource
    PowDeviceLogService powDeviceLogService;

    @Resource
    PowDeviceService powDeviceService;

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    /**
     * 检测充电桩设备是否掉线
     */
    @Scheduled(fixedRate = 1000 * 60 * 5)
    public void reportCurrentTime() {
        System.out.println("----------------start device task-----------------------------");
        Map<String, Date> date = (Map<String, Date>)redisUtil.get("heartDate");
        if(date != null){
            for (Map.Entry<String, Date> entry : date.entrySet()) {
//                System.out.println("device serial：" + entry.getKey() + "   time：" + DateUtil.getTime(entry.getValue()));
                Boolean isOut = false;
                PowDeviceExample powDeviceExample = new PowDeviceExample();
                PowDeviceExample.Criteria criteria = powDeviceExample.createCriteria();
                criteria.andDeviceSerialEqualTo(entry.getKey());
                criteria.andDelFlagEqualTo("0");
                criteria.andStatusEqualTo("0");
                List<PowDevice>  powDeviceList = powDeviceService.selectByExample(powDeviceExample);

                if(DateUtil.calLastedTime(entry.getValue()) > 60 * 10){
                    isOut = true;
                }else{
                    isOut = false;
                }

                if(powDeviceList.size() > 0){
                    //在线
                    if(powDeviceList.get(0).getOnline().equals("1")){
                        if(isOut){
                            PowDevice powDevice = new PowDevice();
                            powDevice.setOnline("0");

                            int id = powDeviceService.updateByExampleSelective(powDevice,powDeviceExample);
                            if(id > 0){
                                PowDeviceLog powDeviceLog = new PowDeviceLog();
                                powDeviceLog.setDeviceId(powDeviceList.get(0).getId());
                                powDeviceLog.setLogType("offLine");
                                powDeviceLog.setLogDesc("设备于：" + DateUtil.getTime(entry.getValue()) + " 下线");
                                powDeviceLog.setBuildTime(new Date());

                                powDeviceLogService.insertSelective(powDeviceLog);
                            }
                        }

                        // 下线
                    }else if(powDeviceList.get(0).getOnline().equals("0")){
                        if(!isOut){
                            PowDevice powDevice = new PowDevice();
                            powDevice.setOnline("1");

                            int id = powDeviceService.updateByExampleSelective(powDevice,powDeviceExample);
                            if(id > 0){
                                PowDeviceLog powDeviceLog = new PowDeviceLog();
                                powDeviceLog.setDeviceId(powDeviceList.get(0).getId());
                                powDeviceLog.setLogType("onLine");
                                powDeviceLog.setLogDesc("设备于：" + DateUtil.getTime(entry.getValue()) + " 上线");
                                powDeviceLog.setBuildTime(new Date());

                                powDeviceLogService.insertSelective(powDeviceLog);
                            }
                        }
                    }
                }
            }
        }else{
            System.out.println("----------------- data is null --------------------");
        }
    }

}

