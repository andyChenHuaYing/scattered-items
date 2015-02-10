package org.springframework.samples.ioc.annotation.java.based.configuration;

import org.junit.Test;
import org.springframework.samples.model.PlainModelSix;
import org.springframework.samples.testbase.AnnotationTestBase;
import org.springframework.samples.utils.PrintUtil;

public class JavaBasedConfigWorkProcessTest extends AnnotationTestBase {

    @Test
    public void testConfigWorkProcess() throws Exception {
        PlainModelSix sixOne = getBean("plainModelSixOne", PlainModelSix.class);
        PlainModelSix sixTwo = getBean("plainModelSixTwo", PlainModelSix.class);
        System.out.println(PrintUtil.formatTestResult(sixOne, sixTwo));

    }
}