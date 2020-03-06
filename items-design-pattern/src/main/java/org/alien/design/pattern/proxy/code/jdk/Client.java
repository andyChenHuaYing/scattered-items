package org.alien.design.pattern.proxy.code.jdk;

import java.lang.reflect.Proxy;

/**
 * Description
 *
 * @author huaying
 * @version 0.0.1
 * @since 2020/3/6
 */
public class Client {

    public static void main(String[] args) {
        Foo target = new Target();
        ProxyHandler proxyHandler = new ProxyHandler(target);
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Foo foo = (Foo) Proxy.newProxyInstance(Target.class.getClassLoader(), new Class[]{Foo.class}, proxyHandler);
        foo.helloWorld();
    }
}
