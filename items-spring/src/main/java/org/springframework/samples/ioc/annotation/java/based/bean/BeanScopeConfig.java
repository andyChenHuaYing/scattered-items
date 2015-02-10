package org.springframework.samples.ioc.annotation.java.based.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.samples.model.PlainModelOne;
import org.springframework.samples.model.PlainModelThree;
import org.springframework.samples.model.PlainModelTwo;

/**
 * Happy daily, happy life.
 * =========================
 * Description:
 * Created by andychen on 2015/2/5.
 * Version 1.0-SNAPSHOT
 */
@Configuration
public class BeanScopeConfig {

    @Bean
    @Scope("prototype")
    public PlainModelOne plainModelOne() {
        return new PlainModelOne();
    }

    @Bean
    @Scope("singleton")
    public PlainModelTwo plainModelTwo() {
        return new PlainModelTwo();
    }

    @Bean
    @Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public PlainModelThree plainModelThree() {
        return new PlainModelThree();
    }
}
