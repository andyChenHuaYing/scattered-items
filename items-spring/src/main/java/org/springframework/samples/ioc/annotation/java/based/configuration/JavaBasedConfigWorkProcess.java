package org.springframework.samples.ioc.annotation.java.based.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.samples.model.PlainModelOne;
import org.springframework.samples.model.PlainModelSix;

/**
 * Happy daily, happy life.
 * =========================
 * Expect each of PlainModelSix has its own plainModelOne,
 * but both of the plainModelSixOne and plainModelSixTwo have the same plainModelOne!
 * Reason:
 * All @Configuration classes are subclassed at startup-time with CGLIB. In the subclass, the child method checks
 * the container first for any cached (scoped) beans before it calls the parent method and creates a new instance.
 * <p/>
 * Created by andychen on 2015/2/6.
 * Version 1.0-SNAPSHOT
 */
@Configuration
public class JavaBasedConfigWorkProcess {

    @Bean
    public PlainModelOne plainModelOne() {
        return new PlainModelOne();
    }

    @Bean
    public PlainModelSix plainModelSixOne() {
        return new PlainModelSix(plainModelOne());
    }

    @Bean
    public PlainModelSix plainModelSixTwo() {
        return new PlainModelSix(plainModelOne());
    }
}
