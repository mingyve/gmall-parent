package com.zmy.gmall.admin.aop;


import com.zmy.gmall.to.CommonResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GolbalExceptionHandler {

    @ExceptionHandler(value = {ArithmeticException.class})
    public Object ArithmeticHandlerException(Exception exception){
        return new CommonResult().validateFailed("被除数不能为0");

    }

    @ExceptionHandler(value = {NullPointerException.class})
    public Object NullPointerHandlerException(Exception exception){
        return new CommonResult().validateFailed("空指针异常了");

    }
}
