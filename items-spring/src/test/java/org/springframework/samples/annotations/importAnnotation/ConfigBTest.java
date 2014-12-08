package org.springframework.samples.annotations.importAnnotation;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.samples.utils.ShowReferencesUtil;

public class ConfigBTest {
    @Test
    public void testImportAnnotation() throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigB.class);
        A a = context.getBean(A.class);
        B b = context.getBean(B.class);
        ShowReferencesUtil.showReferences(a, b);

    }
}