package org.springframework.samples.ioc.schema.injection.method;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-26 21:26
 */
public class MethodReplacerImpl implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println("new parameter : " + args[0]);
        return "This is new return value!";
    }
}
