package com.jzhl.power.netty;

import com.jzhl.power.util.*;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContext;
import javax.xml.bind.DatatypeConverter;
import java.net.InetSocketAddress;

public class NettyServerHandler extends SimpleChannelInboundHandler<String> {

    /**
     * 日志
     */
    private Logger log = LoggerFactory.getLogger(getClass());

    ServletContext context;

    public NettyServerHandler(ServletContext context){
        this.context = context;
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
//        System.out.println("------------------开始读取数据------------------");
//        System.out.println("-------------------开始数据-------------------" + msg);

        String fristByte = msg.substring(0,1);
        String lastByte = msg.substring(msg.length()-1, msg.length());
        if(fristByte.equals("%") && lastByte.equals("#")){
            String startMsg = msg.substring(msg.indexOf("%")+1, msg.indexOf("#"));
//            System.out.println("数据：" + startMsg);

            //获取的base64二进制
            byte[] saltByte = DatatypeConverter.parseBase64Binary(startMsg);

            //二进制转16进制
            String str2 = StringUtils.parseByte2HexStr(saltByte);

//            System.out.println("数据源：" + str2);
            //根据 16进制 截取前8位获取设备号
            int deviceId = Integer.parseInt(str2.substring(0,8),16);
            String prot = str2.substring(8,10);

            switch(str2.substring(22,26)){
                case "6666":
                    // 在心跳中 将 ChannelHandlerContext 保存在上下文中
                    MofangUtils.saveChannelHandlerContext(deviceId,ctx,context);
                    break;
                case "5101":
                    //服务器到控制器命令 发送开启充电之后设备的回应 返回确认

                    break;
                case "5402":
                    //获取时间
                    MofangUtils.getSystemTime(ctx,deviceId,prot);
                    break;
                case "5102":
                    //开始充电状态上报
                    MofangUtils.startChargeReport(ctx,deviceId,prot,str2);

                    break;
                case "5202":
                    //结束充电状态上报
                    MofangUtils.chargeFinish(ctx,deviceId,prot,str2);

                    break;
                case "5502":
                    //卡上报数据
                    String cardId = str2.substring(28,36);
                    MofangUtils.chargeFinish5502(ctx,deviceId,prot,cardId);
                    break;
                default:
                    break;
//                    System.out.println("这类信息暂不处理");
            }
        }
    }


    /**
     * 公用回写数据到客户端的方法
     * @param  //需要回写的字符串
     * @param channel
     * @param mark 用于打印/log的输出
     * <br>//channel.writeAndFlush(msg);//不行
     * <br>//channel.writeAndFlush(receiveStr.getBytes());//不行
     * <br>在netty里，进出的都是ByteBuf，楼主应确定服务端是否有对应的编码器，将字符串转化为ByteBuf
     *
     *     https://blog.csdn.net/yqwang75457/article/details/73913572
     */
    private void writeToClient(final String receiveStr, ChannelHandlerContext channel, final String mark) {
        try {
            ByteBuf bufff = Unpooled.buffer();//netty需要用ByteBuf传输
            bufff.writeBytes(ConvertCode.hexString2Bytes(receiveStr));//对接需要16进制
            channel.writeAndFlush(bufff).addListener(new ChannelFutureListener() {
                @Override
                public void operationComplete(ChannelFuture future) throws Exception {
                    StringBuilder sb = new StringBuilder("");
                    if(mark != null){
                        sb.append("【").append(mark).append("】");
                    }
                    if (future.isSuccess()) {
//                        System.out.println(sb.toString()+"回写成功"+receiveStr);
//                        log.info(sb.toString()+"回写成功"+receiveStr);
                    } else {
//                        System.out.println(sb.toString()+"回写失败"+receiveStr);
//                        log.error(sb.toString()+"回写失败"+receiveStr);
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
//            System.out.println("调用通用writeToClient()异常"+e.getMessage());
//            log.error("调用通用writeToClient()异常：",e);
        }
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {

//        System.out.println("channel 通道 Read 读取 Complete 完成");
        ctx.flush();
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        InetSocketAddress insocket = (InetSocketAddress) ctx.channel().remoteAddress();
        String clientIp = insocket.getAddress().getHostAddress();
//        log.info("收到客户端[ip:" + clientIp + "]连接");
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        // 当出现异常就关闭连接
        ctx.close();
    }
}
