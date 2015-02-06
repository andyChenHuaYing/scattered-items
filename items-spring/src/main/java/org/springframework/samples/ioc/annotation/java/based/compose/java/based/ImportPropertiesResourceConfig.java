package org.springframework.samples.ioc.annotation.java.based.compose.java.based;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.samples.model.annotation.CustomDataSourceModel;

/**
 * Happy daily, happy life.
 * =========================
 * Description:
 * ImportResource access xxx.xml file, not xxx.properties!
 * <p/>
 * Created by andychen on 2015/2/6.
 * Version 1.0-SNAPSHOT
 */
@Configuration
//@ImportResource("classpath:spring_configuration/ioc/schema/spring-ioc-schema-property-placeholder-configure.xml")
@ImportResource("classpath:spring_configuration/ioc/annotation/spring-ioc-annotation-property-placeholder-resource.xml")
public class ImportPropertiesResourceConfig {

    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean
    public CustomDataSourceModel customDataSourceModel() {
        return new CustomDataSourceModel(url, username, password);
    }

}
