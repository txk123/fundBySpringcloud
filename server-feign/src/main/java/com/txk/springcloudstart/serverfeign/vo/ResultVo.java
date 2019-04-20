package com.txk.springcloudstart.serverfeign.vo;

/**
 * Project <fundBySpringcloud>
 * Created by txk on 2019/4/21 0:32.
 */
public class ResultVo {

    /** 返回的结果码【0：成功；1：失败】 */
    private String resCode ="0";
    /** 返回的结果数据 */
    private Object resData;
    /*返回结果msg*/
    private String msg;

    public String getResCode() {
        return resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode;
    }

    public Object getResData() {
        return resData;
    }

    public void setResData(Object resData) {
        this.resData = resData;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
