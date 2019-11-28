package com.jzhl.power.util;

import com.alibaba.fastjson.JSON;
import com.jzhl.power.bean.Select;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.File;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class MyUtils {

    /**
     * 控制层验证处理方法
     * @param result
     * @param redirectAttributes
     * @return
     */
    public static boolean controllerValid(BindingResult result, RedirectAttributes redirectAttributes){
        if (result.hasErrors()) {
            List<ObjectError> list = result.getAllErrors();
            for (ObjectError error : list) {
                redirectAttributes.addFlashAttribute("error", error.getDefaultMessage());
            }
            return false;
        }
        return true;
    }

    /**
     * 转换select Json数据
     * @param list 传入list类型的数据集合
     * @param valueStr  用于放入option中value值
     * @param nameStr	用于放入option中的 name 名字
     * @param defaultValue	用于 放入 默认 被选中的值 null 等于没有选中值
     * @return 返回select的JSon数据类型
     * @throws Exception
     */
    public static String pasSelectJson(Object list,String valueStr,String nameStr, String defaultValue){
        try {

            valueStr = valueStr.replaceFirst(valueStr.substring(0, 1), valueStr.substring(0, 1).toUpperCase());
            nameStr = nameStr.replaceFirst(nameStr.substring(0, 1), nameStr.substring(0, 1).toUpperCase());

            Method size= list.getClass().getMethod("size", null);
            Object listSize = size.invoke(list, null);

            List<Select> secList = new ArrayList<Select>();
            for(int i = 0 ; i < Integer.valueOf(listSize.toString()) ;i++){

                Method method =  list.getClass().getMethod("get",int.class);
                Object obj = method.invoke(list, i);

                Method method2 =  obj.getClass().getMethod("get"+valueStr,null);
                Object obj2 = method2.invoke(obj,null);

                Method method3 =  obj.getClass().getMethod("get"+nameStr,null);
                Object obj3 = method3.invoke(obj,null);

                Select select = new Select();
                select.setNameStr(obj3.toString());
                select.setValueStr(obj2.toString());
                if(StringUtil.isNotEmpty(defaultValue) && obj2.toString().equals(defaultValue)){
                    select.setChecked(true);
                }

                secList.add(select);
            }

            String str = JSON.toJSONString(secList);
            return str;
        } catch (Exception e) {
            System.err.println(e);
        }
        return "";
    }

    /**
     * 分割字符串 获取List集合
     * @param str
     * @param splitStr
     * @return
     */
    public static List<String> splitString(String str,String splitStr) {
        String s = str;
        String[] s1 = s.split(splitStr);
        List<String> s2 = new ArrayList<String>();
        for (String string : s1) {
            if(StringUtil.isNotEmpty(string)){
                s2.add(string);
            }
        }
        return s2;
    }

    /**
     * 分割字符串 获取List集合
     * @param str
     * @param splitStr
     * @return
     */
    public static List<Integer> splitInt(String str,String splitStr) {
        if(StringUtil.isEmpty(str)){
            return null;
        }
        String s = str;
        String[] s1 = s.split(splitStr);
        List<Integer> s2 = new ArrayList<Integer>();
        for (String string : s1) {
            if(StringUtil.isNotEmpty(string)){
                s2.add(Integer.parseInt(string));
            }
        }
        return s2;
    }

    /**
     * 检查String是否为null或者为空
     * @param str
     * @return false为该str内没有内容
     */
    public static boolean checkStrNotEmpty(String str){
        if(str != null && !"".equals(str.trim())){
            return true;
        }
        return false;
    }

    /**
     * 检查list是否为null或者为空
     * @param list
     * @return false为该list内没有内容
     */
    public static boolean checkListNotEmpty(List list){
        if(list != null && list.size() > 0){
            return true;
        }
        return false;
    }

    /**
     * 检查file大小   根据字节比较
     * @param fileSize 文件大小
     * @param checkSize 检查大小
     * @return
     */
    public static boolean checkFileSize(Long fileSize,Long checkSize){
        if(fileSize > checkSize || fileSize == 0)
            return false;
        return true;
    }

    /**
     * 检查file类型
     * @param fileSuffix 文件后缀 带 "."
     * @param checkSuffix 检查后缀 空格隔开
     * @return
     */
    public static boolean checkFileType(String fileSuffix,String checkSuffix){
        String[] checkList = checkSuffix.split(" ");
        fileSuffix = fileSuffix.toUpperCase();
        for (String string : checkList) {
            if(fileSuffix.equals(string)){
                return true;
            }
        }
        return false;
    }

    /**
     * 检查文件夹是否存在,不存在则创建
     * @param path
     */
    public static void checkExist(String path){
        File inbox = new File(path);
        if(inbox.exists() == false){
            inbox.mkdirs();
            System.out.println("创建"+inbox+"成功");
        }
    }

    /**
     * 首字母转小写
     * @param s
     * @return
     */
    public static String toLowerCaseFirstOne(String s)
    {
        if(Character.isLowerCase(s.charAt(0)))
            return s;
        else
            return (new StringBuilder()).append(Character.toLowerCase(s.charAt(0))).append(s.substring(1)).toString();
    }

    /**
     * 首字母转大写
     * @param s
     * @return
     */
    public static String toUpperCaseFirstOne(String s)
    {
        if(Character.isUpperCase(s.charAt(0)))
            return s;
        else
            return (new StringBuilder()).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
    }

    /**
     * 获取两个时间差  天 时 分  有天和时 不显示分
     * @param startTime 开始时间
     * @param endTime 结束时间
     * @return
     */
    public static String getDateDisparity(Date startTime,Date endTime){
        try {
            //毫秒ms
            long diff = startTime.getTime() - endTime.getTime();

            long diffSeconds = diff / 1000 % 60;
            long diffMinutes = diff / (60 * 1000) % 60;
            long diffHours = diff / (60 * 60 * 1000) % 24;
            long diffDays = diff / (24 * 60 * 60 * 1000);

            StringBuffer sb = new StringBuffer();
            if(diffDays != 0){
                sb.append(diffDays+"天");
            }
            if(diffHours != 0){
                sb.append(diffHours+"时");
            }
            if(diffMinutes != 0 && "".equals(sb.toString())){
                sb.append(diffMinutes+"分");
            }

            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /**
     * 获取增减后的时间
     * @param date 操作的时间
     * @param day 60或者-60 等于 一分钟 (60*60)或者-(60*60) 等于一小时
     * @return
     */
    public static Date addDate(Date date,Integer day){
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(getMillis(date) + ((day)*1000));
        return c.getTime();
    }

    /**
     * 获取时间转换的毫秒
     * @param date
     * @return
     */
    public static long getMillis(Date date){
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.getTimeInMillis();
    }

    /**
     * 获取当前时间String
     * 格式 yyyy-MM-dd
     * @return
     */
    public static String getNowDateYMD(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(new Date());
    }

    /**
     * 转换时间为String
     * 格式 yyyy-MM-dd
     * @return
     */
    public static String getChangeDateYMD(Date date){
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(date);
    }

    /**
     * 获取随机的文件名称
     * 格式 yyyyMMddHHmmss  加 4位数的随机数
     * @return
     */
    public static String getRandomFileName(){
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        String fileName = format.format(new Date())+(new BigDecimal(Math.random()*1000+1000).intValue());
        return fileName;
    }

    /**
     * 获取订单名称
     * 格式  GC yyyyMMddHHmmssSSS  加 4位数的随机数
     * @return
     */
    public static String getRandomOrderNo(){
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String orderNo = "GC"+format.format(new Date())+(new BigDecimal(Math.random()*1000+1000).intValue());
        return orderNo;
    }

    /**
     * 检查integer是否为null并且大于0
     * @param integer
     * @return
     */
    public static boolean checkIntegerNotEmpty(Integer integer){
        if(integer != null && integer > 0 ){
            return true;
        }
        return false;
    }

}
