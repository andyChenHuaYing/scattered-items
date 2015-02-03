package org.springframework.samples.ioc.schema.parent;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class WithParentAttributeBeanTest extends TestBase {

    public WithParentAttributeBeanTest() {
        super("spring_configuration/ioc/schema/spring-ioc-schema-parent.xml");
    }

    @Test
    public void testToString() throws Exception {
        WithParentAttributeBean withParentAttributeBean = getBean(WithParentAttributeBean.class);
        System.out.println(PrintUtil.formatTestResult(withParentAttributeBean));
    }
}