package org.springframework.samples.ioc.annotation.java.based.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.samples.ioc.schema.lifecycle.callback.InitAndDestroyMethodViaXmlBean;

/**
 * Happy daily, happy life.
 * =========================
 * Description:
 * Created by andychen on 2015/2/5.
 * Version 1.0-SNAPSHOT
 */
@Configuration
public class ReceivingLifecycleCallbackBeanConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public InitAndDestroyMethodViaXmlBean initAndDestroyMethodViaXmlBean() {
        return new InitAndDestroyMethodViaXmlBean();
    }
}
