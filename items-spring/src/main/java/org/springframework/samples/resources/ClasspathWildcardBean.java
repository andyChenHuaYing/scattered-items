package org.springframework.samples.resources;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Happy daily, happy life.<br>
 * =========================<br>
 * Description:<br>
 * The key is test class.
 * Demonstrate Classpath wildcard load xml config file.
 * Created by andychen on 2015/2/10.<br>
 * Version 1.0-SNAPSHOT<br>
 */
public class ClasspathWildcardBean {
    private ClassPathXmlApplicationContext context;

    public ClassPathXmlApplicationContext getContext() {
        return context;
    }

    public ClasspathWildcardBean(String classpath) {
        context = new ClassPathXmlApplicationContext(classpath);
    }

    @Override
    public String toString() {
        return "ClasspathWildcardBean{}";
    }
}
