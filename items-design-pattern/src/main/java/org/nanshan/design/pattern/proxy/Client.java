package org.nanshan.design.pattern.proxy;

import java.lang.reflect.Proxy;
import java.util.Map;

/**
 * Description
 *
 * @author huaying
 * @version 0.0.1
 * @since 2020/10/9
 */
public class Client {
    public static void main(String[] args) {
        TargetProxy targetProxyTarget = new TargetProxy(new TargetImpl());

        Map target = (Map) Proxy.newProxyInstance(Target.class.getClassLoader(), new Class[]{Map.class}, targetProxyTarget);
        System.out.println(target.isEmpty());;
    }
}
