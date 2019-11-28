package com.jzhl.power.bean;

import java.util.List;

/**
 * api 返回数据
 * @author 陈龙
 *
 */
public class ApiReturn {

    /**
     * 1：成功
     * 0：失败
     *
     * 登录
     * -1 登录失败
     * -2 被挤下线
     */
    private String status;

    private String msg;

    private List<ApiInfo> info;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<ApiInfo> getInfo() {
        return info;
    }

    public void setInfo(List<ApiInfo> info) {
        this.info = info;
    }

}
