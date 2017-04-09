package org.springframework.samples.annotations;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;

public class MultipleAutoawareTest extends TestBase {
    public MultipleAutoawareTest() {
        super("spring-annotation.xml");
    }

    @Test
    public void testShowReferences() throws Exception {
        MultipleAutoaware multipleAutoaware = getBean(MultipleAutoaware.class);
        multipleAutoaware.showArray();
        System.out.println("=====================================");
        multipleAutoaware.showMap();
        System.out.println("=====================================");
        multipleAutoaware.showSet();
        System.out.println("=====================================");

    }
}