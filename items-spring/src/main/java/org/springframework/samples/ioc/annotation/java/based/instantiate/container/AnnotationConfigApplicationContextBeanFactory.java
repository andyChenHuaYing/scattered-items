package org.springframework.samples.ioc.annotation.java.based.instantiate.container;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Happy daily, happy life.
 * =========================
 * Description:
 * Created by andychen on 2015/2/5.
 * Version 1.0-SNAPSHOT
 */
public class AnnotationConfigApplicationContextBeanFactory {

    public AnnotationConfigApplicationContext simpleConstructContainer() {
        return new AnnotationConfigApplicationContext();
    }

    public AnnotationConfigApplicationContext constructContainerWithConfigBean(Class<?>... classes) {
        // AnnotationConfigApplicationContext has been refreshed.
        return new AnnotationConfigApplicationContext(classes);
    }

    public AnnotationConfigApplicationContext constructContainerWithBasePackage(String basePackage) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext();
        configApplicationContext.scan(basePackage);
        return configApplicationContext;
    }
}
