package org.springframework.samples.ioc.schema.aware;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class BeanNameAwareBeanTest extends TestBase {
    public BeanNameAwareBeanTest() {
        super("spring-ioc-schema-aware.xml");
    }

    @Test
    public void testToString() throws Exception {
        BeanNameAwareBean beanNameAwareBean = getBean(BeanNameAwareBean.class);
        System.out.println(PrintUtil.formatTestResult(beanNameAwareBean));
    }
}