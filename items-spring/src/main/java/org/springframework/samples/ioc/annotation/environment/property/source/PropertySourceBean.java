package org.springframework.samples.ioc.annotation.environment.property.source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.samples.model.annotation.CustomDataSourceModel;

/**
 * Happy daily, happy life.<br>
 * =========================<br>
 * Description:<br>
 * Created by andychen on 2015/2/6.<br>
 * Version 1.0-SNAPSHOT<br>
 */
@Configuration
//@PropertySource("classpath:/com/${my.placeholder:default/path}/app.properties")
@PropertySource("classpath:properties/mysql-jdbc.properties")
public class PropertySourceBean {

    @Autowired
    private Environment environment;

    @Bean
    public CustomDataSourceModel customDataSourceModel() {
        return new CustomDataSourceModel(environment.getProperty("jdbc.url"),
                environment.getProperty("jdbc.username"), environment.getProperty("jdbc.password"));
    }
}
