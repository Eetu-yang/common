package com.single.config;

import com.single.exceptions.ServiceException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : yangtao
 * @Description: 全局异常拦截
 * @date Date : 2019-03-08-11:39
 */
@ControllerAdvice
public class GlobalException {


    @ResponseBody
    @ExceptionHandler
    public Map<String, Object> processException(Exception e) {
        Map<String, Object> error = new HashMap<>(2);
        if (e instanceof ServiceException) {
            ServiceException serviceException = (ServiceException) e;
            error.put("code", serviceException.getCode());
            error.put("msg", serviceException.getMsg());
            return error;
        }
        error.put("code", 9000);
        error.put("msg", "system error");
        return error;
    }
}
