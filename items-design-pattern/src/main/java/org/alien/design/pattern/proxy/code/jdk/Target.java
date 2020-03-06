package org.alien.design.pattern.proxy.code.jdk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description
 *
 * @author huaying
 * @version 0.0.1
 * @since 2020/3/6
 */
public class Target implements Foo{
    private static final Logger log = LoggerFactory.getLogger(Target.class);

    @Override
    public void helloWorld() {
        System.out.println("Hello dynamic proxy...");
    }
}
