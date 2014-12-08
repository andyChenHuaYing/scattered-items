package org.springframework.samples.annotations.ImportAndImportResouce;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppConfigTest {
    @Test
    public void testImportResourceAnnotation() throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AppConfig config = context.getBean(AppConfig.class);
        config.showConnectionInfo();
    }
}