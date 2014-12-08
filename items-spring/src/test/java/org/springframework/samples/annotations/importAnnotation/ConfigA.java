package org.springframework.samples.annotations.importAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-24 20:43
 */
@Configuration
public class ConfigA {

    @Bean
    public A a() {
        return new A();
    }
}
