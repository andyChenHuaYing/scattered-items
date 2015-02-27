package org.springframework.samples.ioc.annotation.annotation.based.fine.turning;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class CustomQualifierWithMultipleQualifyBeanTest extends TestBase {

    public CustomQualifierWithMultipleQualifyBeanTest() {
        super("spring_configuration/ioc/annotation/spring-ioc-annotation-qualifier.xml");
    }

    @Test
    public void testToString() throws Exception {

        CustomQualifierWithMultipleQualifyBean multipleQualifyBean = getBean(CustomQualifierWithMultipleQualifyBean.class);
        System.out.println(PrintUtil.formatTestResult(multipleQualifyBean));

    }
}