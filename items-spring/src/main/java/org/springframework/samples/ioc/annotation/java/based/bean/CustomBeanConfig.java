package org.springframework.samples.ioc.annotation.java.based.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.samples.model.PlainModelFour;

/**
 * Happy daily, happy life.
 * =========================
 * Description:
 * Created by andychen on 2015/2/5.
 * Version 1.0-SNAPSHOT
 */
@Configuration
public class CustomBeanConfig {

    @Bean(name = {"nameOne", "nameTwo", "nameThree"})
    @Description("Provide a basic bean instance.")
    public PlainModelFour plainModelFour() {
        return new PlainModelFour();
    }
}
