package org.springframework.samples.aop.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;

import java.util.Arrays;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-16 19:52
 */
public class PrintJoinPointUtil {

    /**
     * Print target object's information.
     *
     * @param joinPoint: Target object's execution method.
     */
    public static void showJoinPointInfo(JoinPoint joinPoint) {
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
}
