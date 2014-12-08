package org.springframework.samples.annotations;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;

public class QualifierAnnotationTest extends TestBase{
    public QualifierAnnotationTest() {
        super("spring-annotation.xml");
    }

    @Test
    public void testShowReferences() throws Exception {
        QualifierAnnotation qualifierAnnotation = getBean(QualifierAnnotation.class);
        qualifierAnnotation.showReferences();

    }
}