package org.springframework.samples.ioc.annotation.java.based.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.samples.model.PlainModelOne;

/**
 * Happy daily, happy life.
 * =========================
 * Description:
 * Created by andychen on 2015/2/5.
 * Version 1.0-SNAPSHOT
 */
@Configuration
public class DeclaringBeanConfig {

    @Bean
    public PlainModelOne plainModelOne() {
        return new PlainModelOne();
    }
}
