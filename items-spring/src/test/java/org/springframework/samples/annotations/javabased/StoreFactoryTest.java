package org.springframework.samples.annotations.javabased;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;

public class StoreFactoryTest extends TestBase {
    public StoreFactoryTest() {
        super("spring-annotationJavaBase.xml");
    }

    @Test
    public void testBeanAnnotation() throws Exception {
        StringStore stringStore = (StringStore) getBean("stringStores");
        stringStore.showInstanceType();
    }
}