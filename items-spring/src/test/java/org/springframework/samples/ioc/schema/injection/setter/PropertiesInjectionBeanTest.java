package org.springframework.samples.ioc.schema.injection.setter;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class PropertiesInjectionBeanTest extends TestBase {

    public PropertiesInjectionBeanTest() {
        super("spring-ioc-schema-setter-injection-bean.xml");
    }

    @Test
    public void testToString() throws Exception {
        PropertiesInjectionBean propertiesInjectionBean = getBean(PropertiesInjectionBean.class);
        System.out.println(PrintUtil.formatTestResult(propertiesInjectionBean));
    }
}