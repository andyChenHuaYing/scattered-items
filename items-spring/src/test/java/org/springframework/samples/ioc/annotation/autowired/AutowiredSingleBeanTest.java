package org.springframework.samples.ioc.annotation.autowired;

import org.junit.Test;
import org.springframework.samples.ioc.annotation.annotation.based.autowired.AutowiredSingleBean;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class AutowiredSingleBeanTest extends TestBase {

    public AutowiredSingleBeanTest() {
        super("spring-annotation-autowired.xml");
    }

    @Test
    public void testToString() throws Exception {
        AutowiredSingleBean autowiredSingleBean = getBean(AutowiredSingleBean.class);
        System.out.println(PrintUtil.formatTestResult(autowiredSingleBean));
    }
}