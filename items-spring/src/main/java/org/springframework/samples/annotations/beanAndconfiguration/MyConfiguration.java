package org.springframework.samples.annotations.beanAndconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-24 19:09
 */
@Configuration
public class MyConfiguration {


    @Bean(name = {"myFoo", "myFirstFoo", "foo2"},initMethod = "init", destroyMethod = "destroy")
    @Scope("prototype")
    public Foo foo() {
        return new Foo();
    }

    @Bean(name = {"myBar", "myFirstBar", "bar2"},initMethod = "barInit", destroyMethod = "barDestroy")
    public Bar bar() {
        return new Bar();
    }

    @Bean
    public FooWithInnerBar fooWithInnerBar() {
        return new FooWithInnerBar(new Bar());
    }
}
