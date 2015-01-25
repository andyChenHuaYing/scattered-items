package org.springframework.samples.ioc.schema.injection.setter;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class ArrayInjectionBeanTest extends TestBase {

    public ArrayInjectionBeanTest() {
        super("spring-ioc-schema-setter-injection-bean.xml");
    }

    @Test
    public void testToString() throws Exception {
        ArrayInjectionBean arrayInjectionBean = getBean(ArrayInjectionBean.class);
        System.out.println(PrintUtil.formatTestResult(arrayInjectionBean));
    }
}