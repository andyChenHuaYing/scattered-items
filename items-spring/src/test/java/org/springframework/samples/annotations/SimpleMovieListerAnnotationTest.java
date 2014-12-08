package org.springframework.samples.annotations;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;

public class SimpleMovieListerAnnotationTest extends TestBase{
    public SimpleMovieListerAnnotationTest() {
        super("spring-annotation.xml");
    }

    @Test
    public void testShowReferences() throws Exception {
        SimpleMovieListerAnnotation simpleMovieLister = getBean(SimpleMovieListerAnnotation.class);
        simpleMovieLister.showReferences();

    }
}