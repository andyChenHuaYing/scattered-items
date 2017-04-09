package org.springframework.samples.ioc.schema.injection.setter;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;
import org.springframework.samples.utils.PrintUtil;

public class MapInjectionBeanTest extends TestBase {
    public MapInjectionBeanTest() {
        super("spring_configuration/ioc/schema/spring-ioc-schema-setter-injection-bean.xml");
    }

    @Test
    public void testToString() throws Exception {
        MapInjectionBean mapInjectionBean = getBean(MapInjectionBean.class);
        System.out.println(PrintUtil.formatTestResult(mapInjectionBean));
    }
}