package org.alien.design.pattern.proxy.issue;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Happy day, happy life.
 *
 * Calculate the target object's method execution time.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-21 18:05
 */
public class TimeProxy implements BizInterface{
    /**
     * Proxied class.
     */
    ProxiedClass proxiedClass;

    public TimeProxy(ProxiedClass proxiedClass) {
        this.proxiedClass = proxiedClass;
    }

    @Override
    public void proxiedMethod() throws Exception{
        calculateExecutionTime("proxiedMethod");
    }

    @Override
    public void thisMethod() throws Exception{
        calculateExecutionTime("thisMethod");
    }

    @Override
    public void withoutThisMethod() throws Exception{
        calculateExecutionTime("withoutThisMethod");
    }

    /**
     * Calculate method execution time.
     * @param methodName
     *        Target method name.
     */
    private void calculateExecutionTime(String methodName) throws NoSuchMethodException {
        Method method = constructMethodByName(methodName);

        long startTime = System.currentTimeMillis();
        try {
            method.invoke(proxiedClass, null);
        } catch (IllegalAccessException e) {
            //e.printStackTrace();
            System.out.println("Illegal....");
        } catch (InvocationTargetException e) {
            System.out.println("Invocation....");
            //e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Method : " + method.getName() + ", execution time : " + (endTime - startTime) + " ms");
    }

    /**
     * Construct this object's Method Object.
     * @param methodName
     *        The name of target Method.
     * @return
     *        Method Object.
     */
    private Method constructMethodByName(String methodName) throws NoSuchMethodException {
        return proxiedClass.getClass().getDeclaredMethod(methodName, null);
    }
}