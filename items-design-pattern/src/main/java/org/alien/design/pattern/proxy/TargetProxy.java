package org.alien.design.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Description
 *
 * @author huaying
 * @version 0.0.1
 * @since 2020/10/9
 */
public class TargetProxy implements InvocationHandler {

    private Target target;

    public TargetProxy(Target target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before invoke...");
        Object invoke = method.invoke(target, args);
        System.out.println("after invoke...");
        return invoke;
    }
}
