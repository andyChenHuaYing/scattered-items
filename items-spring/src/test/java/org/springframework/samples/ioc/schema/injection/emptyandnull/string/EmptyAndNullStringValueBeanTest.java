package org.springframework.samples.ioc.schema.injection.emptyandnull.string;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class EmptyAndNullStringValueBeanTest extends TestBase {

    public EmptyAndNullStringValueBeanTest() {
        super("spring-ioc-schema-empty-null-string-value-injection.xml");
    }

    @Test

    public void testToString() throws Exception {
        EmptyAndNullStringValueBean emptyAndNullStringValueBean = getBean(EmptyAndNullStringValueBean.class);
        System.out.println(PrintUtil.formatTestResult(emptyAndNullStringValueBean));
    }
}