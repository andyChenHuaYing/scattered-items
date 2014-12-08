package org.springframework.samples.event;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceComponentTest {
    @Test
    public void testContextClosedEvent() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-annotationEvent.xml");
        ServiceComponent serviceComponent = context.getBean(ServiceComponent.class);
        serviceComponent.closeApplication();
    }
}