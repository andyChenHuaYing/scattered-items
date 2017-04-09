package org.springframework.samples.annotations.javabased;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-21 19:28
 */
@Configuration
public class StoreFactory {

    @Bean(autowire = Autowire.BY_TYPE)
    public Store stringStore() {
        return new StringStore("public");
    }

    @Bean(name = "stringStores")
    Store protectedStringStore() {
        return new StringStore("protected");
    }


    @Bean
    public Store integerStore() {
        return new IntegerStore();
    }
}
