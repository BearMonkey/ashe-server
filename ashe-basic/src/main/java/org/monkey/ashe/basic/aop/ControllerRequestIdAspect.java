package org.monkey.ashe.basic.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.monkey.ashe.common.holder.RequestIdHolder;
import org.slf4j.MDC;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * ControllerRequestIdAspect
 *
 * @author cc
 * @since 2024/8/30 10:30
 */
@Aspect
//@Component
@Order(1)
@Slf4j
public class ControllerRequestIdAspect {
    @Pointcut("execution(public * org.monkey.ashe..*(..))")
    public void controllerPoint() {
    }

    @Around("controllerPoint()")
    public Object doControllerPointAround(ProceedingJoinPoint joinPoint) throws Throwable {
        String requestId = UUID.randomUUID().toString().replaceAll("-", "");
        MDC.put("requestId", requestId);
        RequestIdHolder.setRequestId(requestId);
        Object result = null;
        try {
            result = joinPoint.proceed();
        } finally {
            MDC.remove("requestId");
        }
        return result;
    }
}
