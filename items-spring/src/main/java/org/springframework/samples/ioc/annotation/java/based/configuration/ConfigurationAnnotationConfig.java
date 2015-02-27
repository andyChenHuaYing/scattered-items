package org.springframework.samples.ioc.annotation.java.based.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Happy daily, happy life.
 * =========================
 * Description:
 * Created by andychen on 2015/2/6.
 * Version 1.0-SNAPSHOT
 */
@Configuration
public class ConfigurationAnnotationConfig {

    @Bean
    @Scope("prototype")
    public PrototypeBeanAbstract prototypeBean() {
        return new PrototypeBeanEntity();
    }

    @Bean
    public SingletonBeanAbstract singletonBean() {
        return new SingletonBeanAbstract() {
            @Override
            public PrototypeBeanAbstract createPrototypeBeanAbstract() {
                return prototypeBean();
            }
        };
    }
}
