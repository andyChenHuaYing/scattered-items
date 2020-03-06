package org.alien.design.pattern.proxy.code.bytebuddy;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.matcher.ElementMatchers;

/**
 * Description
 *
 * @author huaying
 * @version 0.0.1
 * @since 2020/3/6
 */
public class Client {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        DynamicType.Unloaded unloaded = new ByteBuddy()
                .subclass(Object.class)
                .method(ElementMatchers.isToString())
                .intercept(FixedValue.value("Invoke toString method"))
                .make();

        Class<?> loaded = unloaded.load(Client.class.getClassLoader()).getLoaded();
        System.out.println(loaded.newInstance().toString());

    }
}
