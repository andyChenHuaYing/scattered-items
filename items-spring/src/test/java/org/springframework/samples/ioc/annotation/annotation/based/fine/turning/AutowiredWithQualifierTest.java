package org.springframework.samples.ioc.annotation.annotation.based.fine.turning;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class AutowiredWithQualifierTest extends TestBase {

    public AutowiredWithQualifierTest() {
        super("spring_configuration/ioc/annotation/spring-ioc-annotation-qualifier.xml");
    }

    @Test
    public void testToString() throws Exception {
        AutowiredWithQualifier autowiredWithQualifier = getBean(AutowiredWithQualifier.class);
        System.out.println(PrintUtil.formatTestResult(autowiredWithQualifier));
    }
}