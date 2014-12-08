package org.springframework.samples.utils;

import org.junit.Test;

public class ClasspathUtilsTest {
    @Test
    public void testClasspath() throws Exception {
        ClasspathUtils classpathUtils = new ClasspathUtils();
        System.out.println(classpathUtils.getClasspath());
        System.out.println(classpathUtils.getClasspathByResourceName("daos.xml"));
    }
}