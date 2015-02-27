package org.springframework.samples.ioc.annotation.environment.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.samples.model.PlainModelOne;
import org.springframework.samples.model.PlainModelTwo;

/**
 * Happy daily, happy life.
 * =========================
 * Description:
 * Created by andychen on 2015/2/6.
 * Version 1.0-SNAPSHOT
 */
@Configuration
@Profile("default")
public class ProfileDefaultConfig {

    @Bean
    public PlainModelOne plainModelOne() {
        return new PlainModelOne();
    }

    @Bean
    public PlainModelTwo plainModelTwo() {
        return new PlainModelTwo();
    }
}
