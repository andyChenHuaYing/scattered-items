package org.springframework.samples.ioc.annotation.autowired;

import org.junit.Test;
import org.springframework.samples.ioc.annotation.annotation.based.autowired.AutowiredCollectionMapArrayWithOrdersBean;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class AutowiredCollectionMapArrayWithOrdersBeanTest extends TestBase {
    public AutowiredCollectionMapArrayWithOrdersBeanTest() {
        super("spring_configuration/ioc/annotation/spring-ioc-annotation-autowired.xml");
    }

    @Test
    public void testToString() throws Exception {
        AutowiredCollectionMapArrayWithOrdersBean bean = getBean(AutowiredCollectionMapArrayWithOrdersBean.class);
        System.out.println(PrintUtil.formatTestResult(bean));

    }
}