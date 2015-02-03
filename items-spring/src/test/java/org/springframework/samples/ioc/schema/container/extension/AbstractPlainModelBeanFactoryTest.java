package org.springframework.samples.ioc.schema.container.extension;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class AbstractPlainModelBeanFactoryTest extends TestBase {
    public AbstractPlainModelBeanFactoryTest() {
        super("spring_configuration/ioc/schema/spring-ioc-schema-custom-container-extension.xml");
    }

    @Test
    public void testToString() throws Exception {
        System.out.println(PrintUtil.formatTestResult(getBean("abstractPlainModel")));
        System.out.println(PrintUtil.formatTestResult(getBean("&abstractPlainModel")));
    }
}