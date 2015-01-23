package org.springframework.samples.ioc;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;

public class BeanWithInnerBeanTest extends TestBase {
    public BeanWithInnerBeanTest() {
        super("spring-ioc.xml");
    }

    @Test
    public void testShowInnerBean() throws Exception {
        BeanWithInnerBean beanWithInnerBean = getBean(BeanWithInnerBean.class);
        System.out.println(beanWithInnerBean.showInnerBean());
    }
}