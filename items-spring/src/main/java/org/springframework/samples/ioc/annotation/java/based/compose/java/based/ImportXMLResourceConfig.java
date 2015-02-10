package org.springframework.samples.ioc.annotation.java.based.compose.java.based;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.samples.model.PlainModelSix;

/**
 * Happy daily, happy life.
 * =========================
 * Description:
 * Created by andychen on 2015/2/6.
 * Version 1.0-SNAPSHOT
 */
@Configuration
@ImportResource("classpath:spring_configuration/public/spring-public-model-singleton-instantiation.xml")
public class ImportXMLResourceConfig {

    @Bean
    public PlainModelSix plainModelSixFour() {
        return new PlainModelSix();
    }
}
