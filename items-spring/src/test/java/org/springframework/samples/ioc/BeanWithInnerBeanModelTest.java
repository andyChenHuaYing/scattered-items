package org.springframework.samples.ioc;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;

public class BeanWithInnerBeanModelTest extends TestBase {
    public BeanWithInnerBeanModelTest() {
        super("spring-ioc.xml");
    }

    @Test
    public void testShowInnerBean() throws Exception {
        BeanWithInnerBean beanWithInnerBean = getBean(BeanWithInnerBean.class);
        System.out.println(beanWithInnerBean.showInnerBean());
    }
}