package org.springframework.samples.ioc.annotation.annotation.based.fine.turning;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class CustomQualifierBeanTest extends TestBase {
    public CustomQualifierBeanTest() {
        super("spring_configuration/ioc/annotation/spring-ioc-annotation-qualifier.xml");
    }

    @Test
    public void testToString() throws Exception {
        CustomQualifierBean customQualifierBean = getBean(CustomQualifierBean.class);
        System.out.println(PrintUtil.formatTestResult(customQualifierBean));
    }
}