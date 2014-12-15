package org.springframework.samples.aop.schemaBase.advisor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.springframework.samples.aop.dto.User;
import org.springframework.samples.exceptions.ProceedFailException;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-08 22:05
 */
public class TransactionAdvisor {

    public void before() {
        System.out.println("Before : transaction start...");
    }

    public void after(JoinPoint joinPoint) {
        System.out.println("After : transaction commit...");
        showJoinPointInfo(joinPoint);
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

    private void showJoinPointInfo(JoinPoint joinPoint) {
        System.out.println("===================================================================");
        Object[] objects = joinPoint.getArgs();
        String joinPointKind = joinPoint.getKind();
        Signature signature = joinPoint.getSignature();
        Object object = joinPoint.getTarget();
        Object object2 = joinPoint.getThis();
        String longString = joinPoint.toLongString();
        String shortString = joinPoint.toShortString();

        System.out.println("Args : " + Arrays.toString(objects));
        System.out.println("JoinPoint kind : " + joinPointKind);
        System.out.println("Signature name : " + signature.getName());
        System.out.println("Signature declaring type : " + signature.getDeclaringType());
        System.out.println("Signature declaring type name : " + signature.getDeclaringTypeName());
        System.out.println("Target object : " + object.getClass().getName());
        System.out.println("Proxy object : " + object2.getClass().getName());
        System.out.println("Long string : " + longString);
        System.out.println("Short string : " + shortString);
        System.out.println("===================================================================");

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
