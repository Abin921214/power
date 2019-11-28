package com.jzhl.power.bean;

/**
 * 基础selectl类
 * @author 陈龙
 *
 */
public class Select {

    /**
     * name值
     */
    private String nameStr;
    /**
     * value值
     */
    private String valueStr;
    /**
     * 是否选中
     */
    private boolean checked;

    public String getNameStr() {
        return nameStr;
    }
    public void setNameStr(String nameStr) {
        this.nameStr = nameStr;
    }
    public String getValueStr() {
        return valueStr;
    }
    public void setValueStr(String valueStr) {
        this.valueStr = valueStr;
    }
    public boolean isChecked() {
        return checked;
    }
    public void setChecked(boolean checked) {
        this.checked = checked;
    }



}
