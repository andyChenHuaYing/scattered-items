package org.springframework.samples.ioc;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;

public class AutoWiredBeanTest extends TestBase{
    public AutoWiredBeanTest() {
        super("spring-autowired.xml");
    }

    @Test
    public void testAP() throws Exception {
        AutoWiredBean autoWiredBean = getBean(AutoWiredBean.class);
        autoWiredBean.showAutowiredBeanParameter();
    }
}