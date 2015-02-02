package org.springframework.samples.ioc.annotation.annotation.based.fine.turning;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class CustomQualifierWithoutValueBeanTest extends TestBase {

    public CustomQualifierWithoutValueBeanTest() {
        super("spring-annotation-qualifier.xml");
    }

    @Test
    public void testToString() throws Exception {
        CustomQualifierWithoutValueBean bean = getBean(CustomQualifierWithoutValueBean.class);
        System.out.println(PrintUtil.formatTestResult(bean));
    }
}