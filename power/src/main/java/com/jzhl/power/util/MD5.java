package com.jzhl.power.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {

    private String md5_32;
    private String md5_16;
    public MD5(String sourceStr){
        String result = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(sourceStr.getBytes());
            byte b[] = md.digest();
            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            result = buf.toString();
            md5_32=result;
            md5_16= buf.toString().substring(8, 24);
        } catch (NoSuchAlgorithmException e) {
            System.out.println(e);
        }
    }

    public String get16(){
        return md5_16;
    }
    public String get32(){
        return md5_32;
    }

//    public static void main(String[] args) {
//        MD5 md5 = new MD5();
//        String ss = md5.encryption("10012843443");
//        System.err.print(ss);
//    }
//
    public static String getMd5(String key){

        String ss = encryption(key);
        return ss;
    }
//
    public static String encryption(String OrderNo) {
        String result = OrderNo+"354039456123789"+"andriod";
        String re_md5 = new String();
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(result.getBytes());
            byte b[] = md.digest();

            int i;

            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }

            re_md5 = buf.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return re_md5.toUpperCase();
    }
}