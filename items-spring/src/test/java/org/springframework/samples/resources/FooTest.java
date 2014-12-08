package org.springframework.samples.resources;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FooTest {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-resourceLoad.xml", Foo.class);

    @Test
    public void testResourcesDependencies() throws Exception {
        Foo foo = context.getBean(Foo.class);
        foo.showResourceName();
        Resource resource = foo.getTemplate();
        InputStream inputStream = resource.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        System.out.println(br.readLine());
    }

    @Test
    public void testResourceMethods() throws Exception {
        Resource resource = context.getBean(Foo.class).getTemplate();
        if (resource.exists()) {
            System.out.println("Resource file path : " + resource.getDescription());
            System.out.println("Resource file name : " +  resource.getFilename());
            System.out.println("Resource status : " + resource.isOpen());
        }
        ClassPathResource classPathResource = (ClassPathResource)resource;
        classPathResource.getDescription();
    }


}