package org.nanshan.sb.mybatis.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * Mybatis 配置
 *
 * @author cuijin
 * @version 1.0.0
 * @since 2019-09-30
 */
@Configuration
public class MapperConfig {


    @Bean
    public SqlSessionFactory sqlSessionFactory(@Qualifier(value = "dataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setConfigLocation(new PathMatchingResourcePatternResolver().getResource("classpath:META-INF/mybatis-config.xml"));
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:META-INF/mappers/**/*.xml"));

        return bean.getObject();
    }
}
