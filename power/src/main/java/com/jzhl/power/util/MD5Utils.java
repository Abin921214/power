package com.jzhl.power.util;

import java.security.MessageDigest;

public class MD5Utils {

    private static char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /**
     *@Author: DavidHuang
     *@Time: 2018/5/11 14:55
     *@return:
     *@params: [inputStr] 输入明文
     *@Descrption: 不加盐MD5
     */
    public static String MD5WithoutSalt32Byte(byte[] inputByte) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");//申明使用MD5算法,更改参数为"SHA"就是SHA算法了
            return byte2HexStr(md.digest(inputByte));//哈希计算,转换输出
        } catch (Exception e) {
            e.printStackTrace();
            return e.toString();
        }
    }

    /**
     * @Author: DavidHuang
     * @Time: 2018/5/11 14:08
     * @return: 十六进制字符串
     * @params: [bytes]
     * @Descrption: 将字节数组转换成十六进制字符串
     */
    private static String byte2HexStr(byte[] bytes) {
        /**
         *@Author: DavidHuang
         *@Time: 19:41 2018/5/10
         *@return: java.lang.String
         *@params:  * @param bytes
         *@Descrption:
         */
        int len = bytes.length;
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < len; i++) {
            byte byte0 = bytes[i];
            result.append(hex[byte0 >>> 4 & 0xf]);
            result.append(hex[byte0 & 0xf]);
        }
        return result.toString();
    }

}
