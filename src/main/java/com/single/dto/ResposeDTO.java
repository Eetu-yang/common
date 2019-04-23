package com.single.dto;

import com.single.constant.ResponseCode;

/**
 * all repose data transport object
 */
public class ResposeDTO {

    private String code;
    private String msg;
    private Object data;

    public ResposeDTO(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResposeDTO(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResposeDTO() {
        this.code = ResponseCode.RES_SUCCESS_CODE;
        this.msg = ResponseCode.RES_SUCCESS_MESSAGE;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
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
        return "ResposeDTO{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
