package org.alien.design.pattern.proxy.code.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Description
 *
 * @author huaying
 * @version 0.0.1
 * @since 2020/3/6
 */
public class ProxyHandler implements InvocationHandler {
    private Foo target;

    public ProxyHandler(Foo target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Proxy handler invoked...");
        System.out.println("Method name:" + method.getName());

        return method.invoke(target, args);
    }
}
