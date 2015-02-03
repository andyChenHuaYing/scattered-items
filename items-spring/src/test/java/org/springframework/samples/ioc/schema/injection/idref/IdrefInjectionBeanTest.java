package org.springframework.samples.ioc.schema.injection.idref;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class IdrefInjectionBeanTest extends TestBase {

    public IdrefInjectionBeanTest() {
        super("spring_configuration/ioc/schema/spring-ioc-schema-idref-bean-injection.xml");
    }

    @Test
    public void testToString() throws Exception {
        IdrefInjectionBean idrefInjectionBean = getBean(IdrefInjectionBean.class);
        System.out.println(PrintUtil.formatTestResult(idrefInjectionBean));
    }
}