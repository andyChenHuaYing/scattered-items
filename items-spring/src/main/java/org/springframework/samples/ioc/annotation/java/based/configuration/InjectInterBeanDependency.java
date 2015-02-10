package org.springframework.samples.ioc.annotation.java.based.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.samples.model.PlainModelFive;
import org.springframework.samples.model.PlainModelSix;

/**
 * Happy daily, happy life.
 * =========================
 * Description:
 * Created by andychen on 2015/2/6.
 * Version 1.0-SNAPSHOT
 */
@Configuration
public class InjectInterBeanDependency {

    @Bean
    public PlainModelFive plainModelFive() {
        return new PlainModelFive();
    }

    @Bean
    public PlainModelSix plainModelSix() {
        return new PlainModelSix(new PlainModelFive());
    }
}
