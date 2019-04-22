package com.single.exceptions;

/**
 * service excepiton
 */
public class ServiceException extends Exception {
    private String code;
    private String msg;

    public ServiceException() {

    }

    public ServiceException(String code, String msg) {
        this.code = code;
        this.msg = msg;
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
}
