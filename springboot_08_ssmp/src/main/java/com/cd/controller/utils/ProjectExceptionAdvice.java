package com.cd.controller.utils;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author cdviviany
 * @version 1.00
 */
//springmvc的异常处理器
//或者RestControllerAdvice
@ControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler
    public R doException(Exception e){
        e.printStackTrace();
        return new R("服务器故障，请稍后再试");
    }
}
