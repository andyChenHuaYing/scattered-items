package org.springframework.samples.resources;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.samples.utils.PrintUtil;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ResourcesAsDependenciesBeanTest {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-resource-load-by-classpath.xml",
            ResourcesAsDependenciesBean.class);

    @Test
    public void testResourcesDependencies() throws Exception {
        ResourcesAsDependenciesBean foo = context.getBean(ResourcesAsDependenciesBean.class);
        Resource resource = foo.getTemplate();
        InputStream inputStream = resource.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        System.out.println(PrintUtil.formatTestResult(br.readLine(), foo.showResourceName()));
    }

    @Test
    public void testResourceMethods() throws Exception {
        Resource resource = context.getBean(ResourcesAsDependenciesBean.class).getTemplate();
        if (resource.exists()) {
            System.out.println("Resource file path : " + resource.getDescription());
            System.out.println("Resource file name : " +  resource.getFilename());
            System.out.println("Resource status : " + resource.isOpen());
        }
        ClassPathResource classPathResource = (ClassPathResource)resource;
        classPathResource.getDescription();
    }
}