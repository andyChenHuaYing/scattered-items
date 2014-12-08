package org.springframework.samples.annotations.beanAndconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-01 20:02
 */
@Configuration
public class BeanWithConfiguration {

    public BeanWithConfiguration() {
        System.out.println("Bean with configuration inst....");
    }

    @Bean
    public A a() {
        System.out.println("new A...");
        return new A(b());
    }

    @Bean
    public B b() {
        System.out.println("new B...");
        return new B();
    }

}
