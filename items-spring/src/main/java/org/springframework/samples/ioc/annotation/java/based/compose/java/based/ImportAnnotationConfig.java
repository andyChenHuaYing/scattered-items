package org.springframework.samples.ioc.annotation.java.based.compose.java.based;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.samples.ioc.annotation.java.based.configuration.InjectInterBeanDependency;
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
@Import({InjectInterBeanDependency.class})
public class ImportAnnotationConfig {
    @Bean
    public PlainModelSix plainModelSix() {
        return new PlainModelSix(new PlainModelFive());
    }
}
