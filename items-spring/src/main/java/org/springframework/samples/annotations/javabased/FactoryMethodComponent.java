package org.springframework.samples.annotations.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-21 19:11
 */
//@Component
@Configuration
public class FactoryMethodComponent {

    @Bean
    public TestBeanAnnotation getTestBeanAnnotation() {
        return new TestBeanAnnotation("pubilc instance");
    }
}
