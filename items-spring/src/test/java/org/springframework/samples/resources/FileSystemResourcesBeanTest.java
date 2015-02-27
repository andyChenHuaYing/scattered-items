package org.springframework.samples.resources;

import org.junit.Test;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.util.Assert;

public class FileSystemResourcesBeanTest {

    @Test
    public void testToString() throws Exception {
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(
                "items-spring/src/main/java/org/springframework/samples/resources/spring-resource-file-system-xml-application-context.xml");
        Assert.notNull(context);
    }
}