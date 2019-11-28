package com.jzhl.power.util;

import com.jzhl.power.common.SpringFactory;
import com.jzhl.power.model.*;
import com.jzhl.power.service.*;
import io.netty.channel.ChannelHandlerContext;

import javax.servlet.ServletContext;
import javax.xml.bind.DatatypeConverter;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MofangUtils {

    /**
     * 将tcp 通讯通道 ChannelHandlerContext 保存到上下文中去
     * @param deviceId
     * @param ctx
     * @param context
     */
    public static void saveChannelHandlerContext(int deviceId, ChannelHandlerContext ctx, ServletContext context){
        RedisUtil redisUtil = ((RedisUtil) SpringFactory.getBean("redisUtil"));
        Map<String, ChannelHandlerContext> map = (Map<String, ChannelHandlerContext>)context.getAttribute("ctx");
        Map<String, Date> date = (Map<String, Date>)redisUtil.get("heartDate");

        // 保存长链接通道 channel 在上下文中
        if(map == null){
            map = new HashMap<>();
        }
        map.put(String.valueOf(deviceId), ctx);

        context.setAttribute("ctx", map);

        // 添加设备的上线时间
        if(date == null){
            date = new HashMap<>();
        }
        date.put(String.valueOf(deviceId),new Date());
        redisUtil.set("heartDate", date);
    }

    /**
     * 刷卡充电   5502
     * @param ctx
     * @param deviceId
     * @param port
     */
    public static void chargeFinish5502(ChannelHandlerContext ctx, int deviceId, String port, String cardNo){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss");
        String date = simpleDateFormat.format(new Date());
        String device16  = String.format("%08x",deviceId);
        String str = device16 + port + date + "5502" + "01";
        String str16 = str + "0000000000000000000000000000000000000000000000000000";
        sendCtx(str, str16, ctx);

        // 根据卡号查询信息, 处理卡信息确定是否开始充电
        int cardId = Integer.parseInt(cardNo, 16);
//        System.out.println("卡ID：" + Integer.parseInt("00F8678E", 16));
        cardStartDevice(ctx,cardId,deviceId,port);
    }

    public static void cardStartDevice(ChannelHandlerContext ctx, int cardId, int deviceId, String port){
        PowDeviceService powDeviceService = ((PowDeviceService) SpringFactory.getBean("powDeviceService"));
        PowDevicePortService powDevicePortService = ((PowDevicePortService) SpringFactory.getBean("powDevicePortService"));
        PowOrderService powOrderService = ((PowOrderService) SpringFactory.getBean("powOrderService"));

        // 根据设备序列号(设备ID) 获取对应设备信息
        System.out.println("---------------------get device info-------------------------");
        PowDeviceExample powDeviceExample = new PowDeviceExample();
        PowDeviceExample.Criteria criteria1 = powDeviceExample.createCriteria();
        criteria1.andDelFlagEqualTo("0");
        criteria1.andStatusEqualTo("0");
        criteria1.andDeviceSerialEqualTo(String.valueOf(deviceId));
        List<PowDevice>  deviceList= powDeviceService.selectByExample(powDeviceExample);
        if(deviceList.size() > 0){
            //判断该设备是哪种类型的设备  2口充电桩  10口充电桩
            if(deviceList.get(0).getDevicePortType() == 2){
                // 获取这次下单的端口id
                System.out.println("---------------------get device port 2 info-------------------------");
                PowDevicePortExample powDevicePortExample = new PowDevicePortExample();
                PowDevicePortExample.Criteria criteria = powDevicePortExample.createCriteria();
                criteria.andDeviceIdEqualTo(deviceList.get(0).getId());
                criteria1.andDelFlagEqualTo("0");
                criteria1.andStatusEqualTo("0");
                List<PowDevicePort> powDevicePortList = powDevicePortService.selectByExample(powDevicePortExample);
                for (PowDevicePort powDevicePort : powDevicePortList) {
                    if(powDevicePort.getPortStatus().equals("0")){
                        PowOrderExample powOrderExample = new PowOrderExample();
                        PowOrderExample.Criteria criteriaOrder = powOrderExample.createCriteria();
                        criteriaOrder.andDeviceIdEqualTo(deviceList.get(0).getId());
                        criteriaOrder.andDevicePortIdEqualTo(powDevicePort.getId());
                        criteriaOrder.andPortEqualTo(powDevicePort.getPort());
                        criteriaOrder.andOrderStatusEqualTo("0");
                        criteriaOrder.andEndStatusEqualTo("0");
                        criteriaOrder.andDelFlagEqualTo("0");
                        criteriaOrder.andStatusEqualTo("0");
                        List<PowOrder> orderList = powOrderService.selectByExample(powOrderExample);
                        if(orderList.size() <= 0){
                            startOrder(ctx,deviceList.get(0),powDevicePort,cardId);
                            return;
                        }
                    }
                }
            }else if(deviceList.get(0).getDevicePortType() == 10){
                System.out.println("---------------------get device port 10 info-------------------------");
                PowDevicePortExample powDevicePortExample = new PowDevicePortExample();
                PowDevicePortExample.Criteria criteria = powDevicePortExample.createCriteria();
                criteria.andDeviceIdEqualTo(deviceList.get(0).getId());
                criteria.andPortEqualTo(Integer.valueOf(port));
                criteria1.andDelFlagEqualTo("0");
                criteria1.andStatusEqualTo("0");
                List<PowDevicePort> powDevicePortList = powDevicePortService.selectByExample(powDevicePortExample);
                if(powDevicePortList.size() > 0){
                    if(powDevicePortList.get(0).getPortStatus().equals("0")){
                        PowOrderExample powOrderExample = new PowOrderExample();
                        PowOrderExample.Criteria criteriaOrder = powOrderExample.createCriteria();
                        criteriaOrder.andDeviceIdEqualTo(deviceList.get(0).getId());
                        criteriaOrder.andDevicePortIdEqualTo(powDevicePortList.get(0).getId());
                        criteriaOrder.andPortEqualTo(powDevicePortList.get(0).getPort());
                        criteriaOrder.andOrderStatusEqualTo("0");
                        criteriaOrder.andEndStatusEqualTo("0");
                        criteriaOrder.andDelFlagEqualTo("0");
                        criteriaOrder.andStatusEqualTo("0");
                        List<PowOrder> orderList = powOrderService.selectByExample(powOrderExample);
                        if(orderList.size() <= 0){
                            startOrder(ctx,deviceList.get(0),powDevicePortList.get(0),cardId);
                        }
                    }
                }
            }else{

            }
        }
    }

    /**
     * 判断是否有创建订单的可能性
     */
    public static  void startOrder(ChannelHandlerContext ctx, PowDevice powDevice, PowDevicePort powDevicePort, int cardId){
        PowCardService powCardService = ((PowCardService) SpringFactory.getBean("powCardService"));
        PowDistrictConfigService powDistrictConfigService = ((PowDistrictConfigService) SpringFactory.getBean("powDistrictConfigService"));
        PowOrderService powOrderService = ((PowOrderService) SpringFactory.getBean("powOrderService"));
        PowWxUserCardService powWxUserCardService = ((PowWxUserCardService) SpringFactory.getBean("powWxUserCardService"));
        PowWxUserService powWxUserService = ((PowWxUserService) SpringFactory.getBean("powWxUserService"));

        Boolean isWx = false;
        //设备对应小区的配置信息
        System.out.println("---------------------get dev_district info-------------------------");
        PowDistrictConfigExample powDistrictConfigExample = new PowDistrictConfigExample();
        PowDistrictConfigExample.Criteria criteria2 = powDistrictConfigExample.createCriteria();
        criteria2.andDevDistrictIdEqualTo(powDevice.getDevDistrictId());
        criteria2.andOrderWayEqualTo("1");
        criteria2.andDelFlagEqualTo("0");
        criteria2.andStatusEqualTo("0");
        List<PowDistrictConfig> powDistrictConfigList = powDistrictConfigService.selectByExample(powDistrictConfigExample);
        if(powDistrictConfigList.size() >0){
            // 卡信息   判断card中金额是否足够支付对应的配置金额   先比较卡上金额， 在比较微信金额， 在比较高超便民金额
            System.out.println("---------------------get card info-------------------------");
            PowCardExample powCardExample = new PowCardExample();
            PowCardExample.Criteria criteria3 = powCardExample.createCriteria();
            criteria3.andDelFlagEqualTo("0");
            criteria3.andStatusEqualTo("0");
            criteria3.andCardNoEqualTo(String.valueOf(cardId));
            List<PowCard> powCardList = powCardService.selectByExample(powCardExample);
            if(powCardList.size() > 0){
                if(powCardList.get(0).getBalance().compareTo(powDistrictConfigList.get(0).getUnitFee()) != -1){
                    createOrder(ctx,powOrderService,powCardList.get(0).getId(),powCardList.get(0).getCardNo(),powDevice.getId(),powDevice.getDeviceSerial(),powDevicePort.getId(), powDevicePort.getPort(),powDevice.getCompanyId(), powDevice.getHeId(),powDevice.getDevDistrictId(), 0,"0", powDistrictConfigList.get(0).getUnitFee(),powDistrictConfigList.get(0).getUnitMin(),powDistrictConfigList.get(0).getReturnFeeStatus(),powDistrictConfigList.get(0).getSelfHelpCloseStatus());
                }else{
                    //获取card 关联的微信用户id
                    PowWxUserCardExample powWxUserExample = new PowWxUserCardExample();
                    PowWxUserCardExample.Criteria criteria4 = powWxUserExample.createCriteria();
                    criteria4.andCardIdEqualTo(cardId);
                    criteria4.andDelFlagEqualTo("0");
                    criteria4.andStatusEqualTo("0");
                    List<PowWxUserCard> powWxUserCardList = powWxUserCardService.selectByExample(powWxUserExample);
                    if(powWxUserCardList.size() > 0){
                        for (PowWxUserCard powWxUserCard : powWxUserCardList) {
                            PowWxUserExample powWxUserExample1 = new PowWxUserExample();
                            PowWxUserExample.Criteria criteria5 = powWxUserExample1.createCriteria();
                            criteria5.andIdEqualTo(powWxUserCard.getWxUserId());
                            criteria5.andDelFlagEqualTo("0");
                            criteria5.andStatusEqualTo("0");
                            List<PowWxUser> powWxUserList = powWxUserService.selectByExample(powWxUserExample1);
                            if(powWxUserList.size() >0){
                                if(powWxUserList.get(0).getBalance().compareTo(powDistrictConfigList.get(0).getUnitFee()) != -1){
                                    createOrder(ctx,powOrderService,powCardList.get(0).getId(),powCardList.get(0).getCardNo(),powDevice.getId(),powDevice.getDeviceSerial(),powDevicePort.getId(), powDevicePort.getPort(),powDevice.getCompanyId(), powDevice.getHeId(), powDevice.getDevDistrictId(), powWxUserList.get(0).getId(),"1", powDistrictConfigList.get(0).getUnitFee(),powDistrictConfigList.get(0).getUnitMin(),powDistrictConfigList.get(0).getReturnFeeStatus(),powDistrictConfigList.get(0).getSelfHelpCloseStatus());
                                    isWx = true;
                                    break;
                                }
                            }
                        }
                    }

                    //查询判断card 关联高超便民用户 id  当isWx  == false 的时候，开始进行 高超便民判断
                    if(!isWx){

                    }
                }
            }
        }
    }

    /**
     * 创建 订单
     * @param ctx                        通道
     * @param powOrderService          订单 service
     * @param cardId                     卡ID
     * @param cardNo                     卡号
     * @param deviceId                   设备ID
     * @param portId                     设备端口ID
     * @param port                       设备端口
     * @param companyId                  公司ID
     * @param heId                       小区ID
     * @param devDistrictId              设备小区ID
     * @param userId                     类型用户(最终支付) 用户ID
     * @param userType                   类型用户(最终支付) 用户类型
     * @param unitFee                    设备小区 对应的单位金额
     * @param unitMin                    设备小区 对应的单位时间
     * @param returnFeeStatus            设备小区 对应的返回金额状态
     * @param selfHelpCloseStatus        设备小区 是否允许手动结束订单
     */
    public static void createOrder(ChannelHandlerContext ctx, PowOrderService powOrderService, int cardId, String cardNo, int deviceId, String deviceSerial, int portId, int port, int companyId, int heId, int devDistrictId, int userId, String userType, BigDecimal unitFee, int unitMin, String returnFeeStatus, String selfHelpCloseStatus){
        try {
            System.out.println("-----------------  create order -----------------------");
            if(unitMin > 600){
                unitMin = 600;
            }
            String orderno = StringUtil.getRandom(8);
            PowOrder powOrder = new PowOrder();
            powOrder.setOrderNo(orderno);
            powOrder.setOrderWay("1");
            powOrder.setDeviceId(deviceId);
            powOrder.setDevicePortId(portId);
            powOrder.setPort(port);
            powOrder.setCompanyId(companyId);
            powOrder.setHeId(heId);
            powOrder.setDevDistrictId(devDistrictId);
            powOrder.setUserId(userId);
            powOrder.setUserType(userType);
            powOrder.setCardId(cardId);
            powOrder.setCardNo(cardNo);
            powOrder.setStartTime(new Date());
            powOrder.setPayFee(unitFee);
            powOrder.setUnitFee(unitFee);
            powOrder.setUnitMin(unitMin);
            powOrder.setReturnFeeStatus(returnFeeStatus);
            powOrder.setSelfHelpCloseStatus(selfHelpCloseStatus);
            powOrder.setOrderStatus("0");
            powOrder.setBuildTime(new Date());

            int id = powOrderService.insertSelective(powOrder);
            if(id > 0){
//                System.out.println("----------------start charge  deviceId:"+ deviceId +"--- port:" + port +"-----orderno:" + orderno +"---unitMin:"+ unitMin +"----------------");

                MofangUtils.startCharge(ctx, Integer.valueOf(deviceSerial), StringUtils.addZeroForNum(String.valueOf(port),2), StringUtils.addZeroForNum(orderno,8),unitMin);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    /**
     * 设备通知充电完成 结束充电状态上报   5202
     * @param ctx
     * @param deviceId
     * @param port
     */
    public static void chargeFinish(ChannelHandlerContext ctx, int deviceId, String port, String data){

        try {
            System.out.println("---------------------"+ deviceId +"--"+ port +" charge finish-----------------------------");

            PowOrderService powOrderService = ((PowOrderService) SpringFactory.getBean("powOrderService"));
            PowDevicePortService powDevicePortService = ((PowDevicePortService) SpringFactory.getBean("powDevicePortService"));
            RedisUtil redisUtil = ((RedisUtil) SpringFactory.getBean("redisUtil"));
            PowCardService powCardService = ((PowCardService) SpringFactory.getBean("powCardService"));
            PowWxUserService powWxUserService = ((PowWxUserService) SpringFactory.getBean("powWxUserService"));

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss");
            String date = simpleDateFormat.format(new Date());
            String device16  = String.format("%08x",deviceId);
            String str = device16 + port + date + "5202" + "01";
            String str16 = str + "0000000000000000000000000000000000000000000000000000";
            sendCtx(str, str16, ctx);

            // 设备开始充电如果充电状态正常  开始充电  0x01
            // 操作对应的数据库修改充电状态
            String orderid = data.substring(40,48);
            String status = data.substring(56,58);
            String msg = "结束充电失败";

            //电量
            String electricity = data.substring(48,52);
            //时间
            String time = data.substring(52,56);

            PowOrderExample powOrderExample = new PowOrderExample();
            PowOrderExample.Criteria criteria = powOrderExample.createCriteria();
            criteria.andOrderNoEqualTo(orderid);
            criteria.andDelFlagEqualTo("0");
            criteria.andStatusEqualTo("0");

            List<PowOrder> powOrderList = powOrderService.selectByExample(powOrderExample);
            if(powOrderList.size() > 0){
                PowOrder powOrder = new PowOrder();
                switch (status){
                    case "01":  //正常充饱结束
                        powOrder.setOrderStatus("2");
                        powOrder.setEndStatus("1");
                        msg = "正常充饱结束";
                        break;
                    case "02":  //指令结束
                        powOrder.setOrderStatus("2");
                        powOrder.setEndStatus("2");
                        msg = "手动停止订单";
                        break;
                    case "03":  // 负载丢失结束
                        powOrder.setOrderStatus("2");
                        powOrder.setEndStatus("3");
                        msg = "负载丢失结束";
                        break;
                    case "04":  // 时间到结束
                        powOrder.setOrderStatus("2");
                        powOrder.setEndStatus("4");
                        msg = "时间到结束";
                        break;
                    case "05":  // 过载结束
                        powOrder.setOrderStatus("2");
                        powOrder.setEndStatus("5");
                        break;
                    case "06":  //涓流充电时掉电
                        powOrder.setOrderStatus("2");
                        powOrder.setEndStatus("6");
                        msg = "涓流充电时掉电";
                        break;
                    case "09":  // 复位重启结束充电
                        powOrder.setOrderStatus("2");
                        powOrder.setEndStatus("9");
                        msg = "复位重启结束充电";
                        break;
                    default:
                        break;
                }

                powOrder.setEndTime(new Date());
                powOrder.setUpdateTime(new Date());
                powOrder.setSumPower(String.valueOf(Integer.parseInt(electricity, 16)));

                int id = powOrderService.updateByExampleSelective(powOrder,powOrderExample);

//                System.out.println("开始添加缓存-----" + orderid);
                redisUtil.set(orderid, msg,60 * 8);
//                System.out.println("开始添加缓存结束-----" + orderid);

                // 修改对应的端口占用情况
//                System.out.println("结束开始修改端口状态:" + powOrderList.get(0).getDevicePortId());

                PowDevicePortExample powDevicePortExample = new PowDevicePortExample();
                PowDevicePortExample.Criteria criteria2 = powDevicePortExample.createCriteria();
                criteria2.andIdEqualTo(powOrderList.get(0).getDevicePortId());
                criteria2.andDelFlagEqualTo("0");
                criteria2.andStatusEqualTo("0");

                PowDevicePort powDevicePort = new PowDevicePort();
                powDevicePort.setPortStatus("0");
                powDevicePort.setUpdateTime(new Date());

                int pid = powDevicePortService.updateByExampleSelective(powDevicePort,powDevicePortExample);

                /**
                 * 开始退钱操作
                 */
                if(id > 0 && pid > 0){
                    String returnFeeStatus = powOrderList.get(0).getReturnFeeStatus();
                    String selfHelpCloseStatus = powOrderList.get(0).getSelfHelpCloseStatus();
                    if(returnFeeStatus.equals("1")){
//                        System.out.println("开始计算金额");
                        // 订单金额
                        double payFee = powOrderList.get(0).getPayFee().doubleValue();
                        // 单位金额
//                        System.out.println("步骤1-----" + payFee);
                        double unitFee = powOrderList.get(0).getUnitFee().doubleValue();
                        // 单位时间
//                        System.out.println("步骤2-----" + unitFee);
                        int unitMin = powOrderList.get(0).getUnitMin();
//                        System.out.println("步骤3-----" + unitMin);
                        long second  = DateUtil.calLastedTime(powOrderList.get(0).getStartTime());
//                        System.out.println("步骤4-----" + second);
                        //使用的分钟数
                        double min = second/60;
//                        System.out.println("步骤5-----" + min);
                        //总的分钟数
                        double allMin = (payFee/unitFee) * unitMin;
//                        System.out.println("步骤6-----" + allMin);

                        if(min < allMin){

                            double xcMin = allMin - min;
//                            System.out.println("步骤7-----" + xcMin);
                            double syMoney = (xcMin/allMin) * payFee;
//                            System.out.println("步骤8-----" + syMoney);
                           syMoney = Math.floor(syMoney * 10)/10;
//                            System.out.println("步骤9-----" + syMoney);

//                            System.out.println("开始结算：" + powOrderList.get(0).getUserType() + ":" +syMoney);
                            //卡类用户
                            if(powOrderList.get(0).getUserType().equals("0")){
//                                System.out.println("卡内用户结算");
                                PowCardExample powCardExample = new PowCardExample();
                                PowCardExample.Criteria criteria1 = powCardExample.createCriteria();
                                criteria1.andIdEqualTo(powOrderList.get(0).getCardId());
                                criteria1.andDelFlagEqualTo("0");
                                criteria1.andStatusEqualTo("0");
                                List<PowCard> powCardList =  powCardService.selectByExample(powCardExample);
//                                System.out.println("卡用户信息：" + powCardList);
                                if(powCardList.size() > 0){
                                    PowCard powCard = new PowCard();
                                    powCard.setBalance(powCardList.get(0).getBalance().add(new BigDecimal(syMoney)));

                                    int cid = powCardService.updateByExampleSelective(powCard, powCardExample);
                                    if(cid > 0){
                                        PowOrder powOrder1 = new PowOrder();
                                        powOrder1.setReturnFee(new BigDecimal(syMoney));
                                        powOrderService.updateByExampleSelective(powOrder1, powOrderExample);
                                    }
                                }
                                //微信用户
                            }else if(powOrderList.get(0).getUserType().equals("1")){
//                                System.out.println("微信类用户结算");
                                PowWxUserExample powWxUserExample = new PowWxUserExample();
                                PowWxUserExample.Criteria criteria1 = powWxUserExample.createCriteria();
                                criteria1.andIdEqualTo(powOrderList.get(0).getUserId());
                                criteria1.andDelFlagEqualTo("0");
                                criteria1.andStatusEqualTo("0");
                                List<PowWxUser> powWxUserList =  powWxUserService.selectByExample(powWxUserExample);
//                                System.out.println("微信用户信息：" + powWxUserList);
                                if(powWxUserList.size() > 0){
                                    PowWxUser powWxUser = new PowWxUser();
                                    powWxUser.setBalance(powWxUserList.get(0).getBalance().add(new BigDecimal(syMoney)));

                                    int cid = powWxUserService.updateByExampleSelective(powWxUser, powWxUserExample);
                                    if(cid > 0){
                                        PowOrder powOrder1 = new PowOrder();
                                        powOrder1.setReturnFee(new BigDecimal(syMoney));
                                        powOrderService.updateByExampleSelective(powOrder1, powOrderExample);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     *   获取时间   状态码：5402
     * @param ctx         通讯渠道
     * @param deviceId    设备ID
     * @param port        设备端口
     */
    public static void getSystemTime(ChannelHandlerContext ctx, int deviceId, String port){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss");
        String date = simpleDateFormat.format(new Date());
        String device16  = String.format("%08x",deviceId);
        String str = device16 + port + date + "5402" + "01";
        String str16 = str + "0000000000000000000000000000000000000000000000000000";
        sendCtx(str, str16, ctx);
    }

    /**
     *   开始充电状态上报   状态码：5102
     * @param ctx         通讯渠道
     * @param deviceId    设备ID
     * @param port        设备端口
     */
    public static void startChargeReport(ChannelHandlerContext ctx, int deviceId, String port, String data){

        System.out.println("--------------------------  start power report -----------------------------------");

        PowOrderService powOrderService = ((PowOrderService) SpringFactory.getBean("powOrderService"));
        PowWxUserService powWxUserService = ((PowWxUserService) SpringFactory.getBean("powWxUserService"));
        RedisUtil redisUtil = ((RedisUtil) SpringFactory.getBean("redisUtil"));
        PowDevicePortService powDevicePortService = ((PowDevicePortService) SpringFactory.getBean("powDevicePortService"));
        PowCardService powCardService = ((PowCardService) SpringFactory.getBean("powCardService"));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss");
        String date = simpleDateFormat.format(new Date());
        String device16  = String.format("%08x",deviceId);
        String str = device16 + port + date + "5102" + "01";
        String str16 = str + "0000000000000000000000000000000000000000000000000000";
        sendCtx(str, str16, ctx);

        // 设备开始充电如果充电状态正常  开始充电  0x01
        // 操作对应的数据库修改充电状态
        String orderid = data.substring(40,48);
        String status = data.substring(48,50);
        String msg = "充电失败";

//        System.out.println("--------------------------  start power report ------------- orderid: "+ orderid +"----------------------status: " + status);

        //更新订单状态
        PowOrderExample powOrderExample = new PowOrderExample();
        PowOrderExample.Criteria criteria = powOrderExample.createCriteria();
        criteria.andOrderNoEqualTo(orderid.trim());
        criteria.andDelFlagEqualTo("0");
        criteria.andStatusEqualTo("0");
        criteria.andOrderStatusEqualTo("0");

        List<PowOrder> powOrderList = powOrderService.selectByExample(powOrderExample);

//        System.out.println("===powOrderList===" + powOrderList);

        if(powOrderList.size() > 0){
            PowOrder powOrder = new PowOrder();
            switch (status){
                case "00"://未检测到负载充电不成功
                    powOrder.setOrderStatus("3");
                    powOrder.setEndStatus("3");
                    msg = "未检测到负载充电不成功";
                    break;
                case "01"://开始充电
                    powOrder.setOrderStatus("1");
                    powOrder.setEndStatus("1");
                    msg = "开始充电";
                    break;
                case "02"://设备忙 未开始充电
                    powOrder.setOrderStatus("3");
                    powOrder.setEndStatus("1");
                    msg = "设备忙 未开始充电";
                    break;
            }
            if(powOrder.getOrderStatus().equals("3")){
                powOrder.setEndTime(new Date());
                powOrder.setUpdateTime(new Date());
            }

            powOrderService.updateByExampleSelective(powOrder,powOrderExample);

            System.out.println("-----start redis -----" + orderid);
            redisUtil.set(orderid, msg,60 * 8);
            System.out.println("----- end redis-----" + orderid);

            // 如果是正在充电 则减少用户账户余额
            if(status.equals("01")){
                if(powOrderList.get(0).getUserType().equals("0")){
                    //卡用户
                    PowCardExample powCardExample = new PowCardExample();
                    PowCardExample.Criteria criteria1 = powCardExample.createCriteria();
                    criteria1.andCardNoEqualTo(powOrderList.get(0).getCardNo());
                    criteria1.andIdEqualTo(powOrderList.get(0).getCardId());
                    criteria1.andDelFlagEqualTo("0");
                    criteria1.andStatusEqualTo("0");
                    List<PowCard> powCardList = powCardService.selectByExample(powCardExample);
                    if(powCardList.size() > 0){
                        PowCard powCard = new PowCard();
                        powCard.setBalance(powCardList.get(0).getBalance().subtract(powOrderList.get(0).getPayFee()));
                        powCard.setUpdateTime(new Date());

                        powCardService.updateByExampleSelective(powCard,powCardExample);
                    }

                }else if(powOrderList.get(0).getUserType().equals("1")){
                    //微信用户
                    PowWxUserExample powWxUserExample = new PowWxUserExample();
                    PowWxUserExample.Criteria criteria1 =  powWxUserExample.createCriteria();
                    criteria1.andIdEqualTo(powOrderList.get(0).getUserId());
                    criteria1.andDelFlagEqualTo("0");
                    criteria1.andStatusEqualTo("0");
                    List<PowWxUser> powWxUserList = powWxUserService.selectByExample(powWxUserExample);
                    if(powWxUserList.size() > 0){
                        PowWxUser powWxUser = new PowWxUser();
                        powWxUser.setBalance(powWxUserList.get(0).getBalance().subtract(powOrderList.get(0).getPayFee()));
                        powWxUser.setUpdateTime(new Date());

                        powWxUserService.updateByExampleSelective(powWxUser, powWxUserExample);
                    }

                }else if(powOrderList.get(0).getUserType().equals("2")){
                    // 高超便民用户
                }

                // 修改对应的端口占用情况
//                System.out.println("开始修改端口状态:" + powOrderList.get(0).getDevicePortId());

                PowDevicePortExample powDevicePortExample = new PowDevicePortExample();
                PowDevicePortExample.Criteria criteria2 = powDevicePortExample.createCriteria();
                criteria2.andIdEqualTo(powOrderList.get(0).getDevicePortId());
                criteria2.andDelFlagEqualTo("0");
                criteria2.andStatusEqualTo("0");

                PowDevicePort powDevicePort = new PowDevicePort();
                powDevicePort.setPortStatus("1");
                powDevicePort.setUpdateTime(new Date());

                powDevicePortService.updateByExampleSelective(powDevicePort,powDevicePortExample);
            }
        }


    }


    /**
     * 心跳响应   状态码：6666
     * @param ctx   通讯渠道
     * @param date  16进制
     */
    public static void heartBeat(ChannelHandlerContext ctx, String date){

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss");
        String str16XT = date.replace(date.substring(10,22),simpleDateFormat.format(new Date()));

//        System.out.println(date);
//        System.out.println(str16XT);
//        System.out.println(str16XT.length());

        String str16 = str16XT + "000000000000000000000000000000000000000000000000";

        sendCtx(str16XT, str16, ctx);
    }


    /**
     * 开始充电方法    状态码：5101
     * @param ctx   请求通道        ctx
     * @param deviceId  设备ID      290008
     * @param port      插口号      "01"
     * @param orderId   订单Id      "00000001"
     * @param time      充电时长    "0030"
     */
    public static void  startCharge(ChannelHandlerContext ctx, int deviceId, String port, String orderId, int time){
//        System.out.println("---------------start ok charge-------------------deviceId: " + deviceId  + "--- port : " + port + "--- orderId: " + orderId + "----time: " + time );
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss");
        String date = simpleDateFormat.format(new Date());
        String device16  = String.format("%08x",deviceId);
        String time16 = String.format("%04x",time);
        String str = device16 + port + date + "5101" + "06" + orderId + time16;
        String str16 = str + "0000000000000000000000000000000000000000";

        sendCtx(str, str16, ctx);
    }

    /**
     * 结束命令    状态码：5201
     * @param ctx   请求通道        ctx
     * @param deviceId  设备ID      290008
     * @param port      插口号      "01"
     * @param orderId   订单Id      "00000001"
     */
    public static void  endCharge(ChannelHandlerContext ctx, int deviceId, String port, String orderId){

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss");
        String date = simpleDateFormat.format(new Date());
        String device16  = String.format("%08x",deviceId);
        port = StringUtils.addZeroForNum(port,2);
        orderId = StringUtils.addZeroForNum(orderId,8);
        String str = device16 + port + date + "5201" + "04" + orderId;
        String str16 = str + "00000000000000000000000000000000000000000000";

        sendCtx(str, str16, ctx);
    }

    public static void sendCtx(String No0, String Have0, ChannelHandlerContext ctx){

//        System.out.println("原数据：" + No0);
//        System.out.println("用于加密数据: " + Have0);
//        System.out.println("用于加密数据长度: " + Have0.length());


        byte[] temp = ConvertCode.hexStringToBytes(Have0 + "31313131313131313131313131313131");
        String md5 = MD5Utils.MD5WithoutSalt32Byte(temp).substring(0,16);

        String strok = No0 + md5;
        byte[] strByte = StringUtils.parseHexStr2Byte(strok);
        String strend = DatatypeConverter.printBase64Binary(strByte);
        String end = "@" + strend + "#";

//        System.out.println("发送数据:" + end);

        ctx.writeAndFlush(end);
    }

}
