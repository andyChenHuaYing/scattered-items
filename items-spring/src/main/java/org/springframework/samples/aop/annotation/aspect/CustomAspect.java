package org.springframework.samples.aop.annotation.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
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
public class CustomAspect {

    @Before("execution(* org.springframework.samples.aop.annotation.action.*.*(..))")
    public void before() {
        System.out.println("before...");
    }
}
