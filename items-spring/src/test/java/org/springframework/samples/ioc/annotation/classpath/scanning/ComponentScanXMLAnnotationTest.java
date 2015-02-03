package org.springframework.samples.ioc.annotation.classpath.scanning;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class ComponentScanXMLAnnotationTest extends TestBase {
    public ComponentScanXMLAnnotationTest() {
        super("spring_configuration/ioc/annotation/spring-ioc-annotation-component-scan.xml");
    }

    @Test
    public void testToString() throws Exception {
        ComponentScanXMLAnnotation componentScanXMLAnnotation = getBean(ComponentScanXMLAnnotation.class);
        System.out.println(PrintUtil.formatTestResult(componentScanXMLAnnotation));
    }
}