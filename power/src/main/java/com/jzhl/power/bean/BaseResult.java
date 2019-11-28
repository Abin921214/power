package com.jzhl.power.bean;

public class BaseResult {
    public BaseResult(int code, String msg, Object data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 0 错误
     * 1 成功
     * -1 token失效
     * -2
     */
    private int code;

    private String msg;

    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BaseResult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
