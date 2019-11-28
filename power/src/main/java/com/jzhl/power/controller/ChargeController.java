package com.jzhl.power.controller;

import com.jzhl.power.bean.BaseResult;
import com.jzhl.power.util.MofangUtils;
import com.jzhl.power.util.RedisUtil;
import com.jzhl.power.util.StringUtils;
import io.netty.channel.ChannelHandlerContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("/charge")
public class ChargeController {

    @Resource
    RedisUtil redisUtil;


    @ResponseBody
    @RequestMapping("/feedback")
    public BaseResult feedback(String orderId){
        try {
            String msg = "操作失败";
            Boolean flag = true;
            int count = 0;
            while (flag) {
                //等待设备发送响应命令，接受响应命令创建订单，在此处循环查询订单是否存在
                if(redisUtil.get(orderId) != null){

//                    System.out.println("-----redis data fackback-----------" + redisUtil.get(orderId));

                    msg = (String)redisUtil.get(orderId);
                    flag = false;
                    redisUtil.remove(orderId);
                }

                // 轮询查询次数和相应的时间，定为最多轮询 5 次，每次休眠时间为 2s
                if (count > 40) {
                    flag = false;
                }
                count++;

                Thread.sleep(2000);
            }
            return new BaseResult(1,msg,null);
        }catch (Exception e){
            return new BaseResult(0,"异数据",null);
        }
    }

    @RequestMapping("/start")
    public BaseResult start(HttpServletRequest request, String deviceId, String port, String orderId, String time){

//        System.out.println("传递的数据：" + deviceId + "-" + port  + "-" + orderId   + "-" + time);

        try {
            ServletContext context = request.getServletContext();
            Map<String, ChannelHandlerContext> map = (Map<String, ChannelHandlerContext>)context.getAttribute("ctx");
            if(map == null){
                return new BaseResult(0,"设备未上线",null);
            }
            ChannelHandlerContext channelHandlerContext = map.get(deviceId);
            if(channelHandlerContext == null){
                return new BaseResult(0,"设备未上线",null);
            }

            if(Integer.valueOf(time) > 600){
                time = String.valueOf(600);
            }

            MofangUtils.startCharge(channelHandlerContext, Integer.valueOf(deviceId), StringUtils.addZeroForNum(port,2), StringUtils.addZeroForNum(orderId,8),Integer.valueOf(time));

            return new BaseResult(1,"发送启动充电成功",orderId);
        }catch (Exception e){
            e.printStackTrace();
            return new BaseResult(0,"异常请求",null);
        }
    }

    /**
     *  停止充电
     * @return
     */
    @RequestMapping("/stop")
    public BaseResult stop(HttpServletRequest request, String deviceId, String port, String orderId){

//        System.out.println("传递的数据：" + deviceId + "-" + port  + "-" + orderId);

        try {
            ServletContext context = request.getServletContext();
            Map<String, ChannelHandlerContext> map = (Map<String, ChannelHandlerContext>)context.getAttribute("ctx");
            if(map == null){
                return new BaseResult(0,"设备未上线",null);
            }
            ChannelHandlerContext channelHandlerContext = map.get(deviceId);
            if(channelHandlerContext == null){
                return new BaseResult(0,"设备未上线",null);
            }

            MofangUtils.endCharge(channelHandlerContext, Integer.valueOf(deviceId), StringUtils.addZeroForNum(port,2), StringUtils.addZeroForNum(orderId,8));

            return new BaseResult(1,"结束充电成功",null);
        }catch (Exception e){
            e.printStackTrace();
            return new BaseResult(0,"结束充电失败",null);
        }
    }
}
