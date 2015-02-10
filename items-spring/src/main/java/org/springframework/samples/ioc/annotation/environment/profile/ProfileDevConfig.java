package org.springframework.samples.ioc.annotation.environment.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.samples.model.PlainModelFour;
import org.springframework.samples.model.PlainModelThree;

/**
 * Happy daily, happy life.
 * =========================
 * Description:
 * Created by andychen on 2015/2/6.
 * Version 1.0-SNAPSHOT
 */
@Configuration
@Profile("profileDevConfig")
public class ProfileDevConfig {

    @Bean
    public PlainModelThree plainModelThree() {
        return new PlainModelThree();
    }

    @Bean
    public PlainModelFour plainModelFour() {
        return new PlainModelFour();
    }
}
