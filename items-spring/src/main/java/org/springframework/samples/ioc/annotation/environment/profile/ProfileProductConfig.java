package org.springframework.samples.ioc.annotation.environment.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.samples.model.PlainModelFive;
import org.springframework.samples.model.PlainModelOne;
import org.springframework.samples.model.PlainModelSix;

/**
 * Happy daily, happy life.
 * =========================
 * Description:
 * Created by andychen on 2015/2/6.
 * Version 1.0-SNAPSHOT
 */
@Configuration
@Profile("profileProductConfig")
public class ProfileProductConfig {

    @Bean
    public PlainModelSix plainModelSix() {
        return new PlainModelSix(new PlainModelOne());
    }

    @Bean
    public PlainModelFive plainModelFive() {
        return new PlainModelFive();
    }
}
