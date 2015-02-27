package org.springframework.samples.aop.schema.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.samples.aop.dto.User;
import org.springframework.samples.aop.utils.PrintJoinPointUtil;
import org.springframework.samples.exceptions.ProceedFailException;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-08 22:05
 */
@SuppressWarnings("unused")
public class TransactionAspect {

    private void before() {
        System.out.println("Before : transaction start...");
    }

    public void after(JoinPoint joinPoint) {
        System.out.println("After : transaction commit...");
        PrintJoinPointUtil.showJoinPointInfo(joinPoint);
    }

    public void afterReturning() {
        System.out.println("After Returning : logging...");
    }

    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Long startTime = System.currentTimeMillis();
        System.out.println("start time : " + simpleDateFormat.format(new Date(startTime)));
        Object object = proceedingJoinPoint.proceed();
//        try {
//            Object object = proceedingJoinPoint.proceed();
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        }
        Long stopTime = System.currentTimeMillis();
        System.out.println("end time : " + simpleDateFormat.format(new Date(stopTime)));
        System.out.println("Total proceed time : " + (stopTime - startTime) + " ms");
        return object;
    }


    public void afterThrowing(ProceedFailException proceedFailException) throws Throwable {
        proceedFailException.printStackTrace();
        System.out.println("After Throwing : release resource...");
    }



    public Object aroundWithPrimaryParameter(ProceedingJoinPoint proceedingJoinPoint, int userId) throws Throwable {
        System.out.println(userId);
        return proceedingJoinPoint.proceed();
    }

    public Object aroundWithReferenceParameter(ProceedingJoinPoint proceedingJoinPoint, User user) throws Throwable {
        System.out.println(user);
        return proceedingJoinPoint.proceed();
    }
}
