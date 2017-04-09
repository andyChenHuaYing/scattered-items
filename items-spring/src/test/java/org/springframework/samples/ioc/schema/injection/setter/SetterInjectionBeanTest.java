package org.springframework.samples.ioc.schema.injection.setter;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class SetterInjectionBeanTest extends TestBase {

    public SetterInjectionBeanTest() {
        super("spring_configuration/ioc/schema/spring-ioc-schema-setter-injection-bean.xml");
    }

    @Test
    public void testToString() throws Exception {
        SetterInjectionBean setterInjectionBean = getBean("setterInjectionBean", SetterInjectionBean.class);
        System.out.println(PrintUtil.formatTestResult(setterInjectionBean));
    }
}