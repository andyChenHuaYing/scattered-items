package org.springframework.samples.annotations.ImportAndImportResouce;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-24 21:17
 */

@Configuration
@ImportResource("classpath:spring-importResource.xml")
public class AppConfig {
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    public AppConfig() { }

    @Bean
    public DataSource dataSource() {
        return new DriverManagerDataSource(url, username, password);
    }

    public void showConnectionInfo() {
        System.out.println("url : " + url + ", username : " + username + ", password : " + password);
    }
}
