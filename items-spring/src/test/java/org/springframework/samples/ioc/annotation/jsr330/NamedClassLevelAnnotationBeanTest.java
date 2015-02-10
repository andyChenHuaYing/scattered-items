package org.springframework.samples.ioc.annotation.jsr330;

import org.junit.Test;
import org.springframework.samples.testbase.AnnotationTestBase;
import org.springframework.samples.utils.PrintUtil;

public class NamedClassLevelAnnotationBeanTest extends AnnotationTestBase {

    @Test
    public void testToString() throws Exception {
        NamedClassLevelAnnotationBean namedClassLevelAnnotationBean =
                (NamedClassLevelAnnotationBean) getBean("namedClassLevelAnnotationBean");
        System.out.println(PrintUtil.formatTestResult(namedClassLevelAnnotationBean));
    }
}