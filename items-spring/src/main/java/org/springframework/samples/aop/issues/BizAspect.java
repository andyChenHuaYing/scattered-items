package org.springframework.samples.aop.issues;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-21 19:29
 */
@Component
@Aspect
public class BizAspect {
    public BizAspect() {
    }

    @AfterReturning(value = "execution(* org.springframework.samples.aop.issues.*.*(..))", returning = "methodName")
    public void before(String methodName) {
        System.out.println("After : " + methodName);
    }
}
