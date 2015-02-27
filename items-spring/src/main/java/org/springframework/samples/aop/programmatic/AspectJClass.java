package org.springframework.samples.aop.programmatic;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-21 19:56
 */
@Aspect
public class AspectJClass {

    @After(value = "execution(* *(..))")
    public void after() {
        System.out.println("after...");
    }
}
