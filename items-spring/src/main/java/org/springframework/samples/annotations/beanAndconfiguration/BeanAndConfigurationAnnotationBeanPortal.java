package org.springframework.samples.annotations.beanAndconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-23 14:35
 */
@Configuration
public class BeanAndConfigurationAnnotationBeanPortal {

    @Bean
    public SimpleBeanOne simpleBeanOne() {
        return new SimpleBeanOne();
    }
}
