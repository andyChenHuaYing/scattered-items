package org.springframework.samples.ioc.annotation.annotation.based.fine.turning;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;

public class CustomQualifierWithMultipleQualifyBeanTest extends TestBase {

    public CustomQualifierWithMultipleQualifyBeanTest() {
        super("spring-annotation-qualifier.xml");
    }

    @Test
    public void testToString() throws Exception {
/*
        CustomQualifierWithMultipleQualify multipleQualify = getBean(CustomQualifierWithMultipleQualify.class);
        System.out.println(PrintUtil.formatTestResult(multipleQualify));
*/
    }
}