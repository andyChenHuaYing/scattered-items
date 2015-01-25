package org.springframework.samples.ioc.schema.injection.setter;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;

public class CollectionInjectionBeanTest extends TestBase{
    public CollectionInjectionBeanTest() {
        super("spring-ioc-schema-setter-injection-bean.xml");
    }

    @Test
    public void testToString() throws Exception {
        CollectionInjectionBean collectionInjectionBean = getBean(CollectionInjectionBean.class);
        System.out.println(collectionInjectionBean);
    }
}