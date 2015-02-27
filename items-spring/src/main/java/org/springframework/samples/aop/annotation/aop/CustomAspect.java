package org.springframework.samples.aop.annotation.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-08 22:05
 */

@Component
@Aspect
@Order(value = 1)
public class CustomAspect {

    @Before("execution(* org.springframework.samples.aop.annotation.action.*.*(..))")
    public void before() {
        System.out.println("before...");
    }


    @AfterReturning(pointcut = "bean(*Action)", returning = "user")
    public void afterReturningWithReturnValue(org.springframework.samples.aop.dto.User user) {
        System.out.println("after returning and the return value : " + user + ", order : 1");
    }
}
