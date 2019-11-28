package com.jzhl.power.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static String getTime(Date date){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        return df.format(date);
    }

    // 计算距离当前时间差的秒数
    public static long calLastedTime(Date startDate) {
        long a = new Date().getTime();
        long b = startDate.getTime();
        long c = (a - b) / 1000;
        return c;
    }

    public static long getDateMin(Date endDate, Date nowDate) {

        long nd = 1000 * 24 * 60 * 60;

        long nh = 1000 * 60 * 60;

        long nm = 1000 * 60;

        // long ns = 1000;

        // 获得两个时间的毫秒时间差异

        long diff = endDate.getTime() - nowDate.getTime();

        // 计算差多少天

        long day = diff / nd;

        // 计算差多少小时

        long hour = diff % nd / nh;

        // 计算差多少分钟

        long min = diff % nd % nh / nm;

        return min;

    }
}
