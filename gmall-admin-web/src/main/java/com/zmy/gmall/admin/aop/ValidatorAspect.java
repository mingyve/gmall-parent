package com.zmy.gmall.admin.aop;

import com.zmy.gmall.to.CommonResult;
import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

@Log4j2
@Aspect
@Component
public class ValidatorAspect {

    @Around("execution(* com.zmy.gmall.admin..*Controller.*(..))")
    public Object validAround(ProceedingJoinPoint point) throws Throwable {
        log.info("进入通知");
        Object[] args = point.getArgs();
        for (Object bindingResult : args) {
            if (bindingResult instanceof BindingResult){
                BindingResult result = (BindingResult) bindingResult;
                if(result.getErrorCount()>0){
                    return  new CommonResult().validateFailed(result);
                }

            }
        }
        Object proceed = point.proceed(point.getArgs());
       return new CommonResult().success(proceed);
    }
}
