package org.springframework.samples.ioc.annotation.classpath.scanning;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class ConfigurationComponentScanAnnotationTest extends TestBase {
    public ConfigurationComponentScanAnnotationTest() {
        super("spring_configuration/ioc/annotation/spring-ioc-annotation-component-scan-configuration.xml");
    }

    @Test
    public void testToString() throws Exception {
        ConfigurationComponentScanAnnotation configurationComponentScanAnnotation = getBean(ConfigurationComponentScanAnnotation.class);
        System.out.println(PrintUtil.formatTestResult(configurationComponentScanAnnotation));
    }
}