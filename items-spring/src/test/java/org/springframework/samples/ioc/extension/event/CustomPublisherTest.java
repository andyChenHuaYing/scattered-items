package org.springframework.samples.ioc.extension.event;

import org.junit.Test;
import org.springframework.samples.testbase.TestBase;

public class CustomPublisherTest extends TestBase {
    public CustomPublisherTest() {
        super("spring_configuration/ioc/extension/spring-ioc-extension-event.xml");
    }

    @Test
    public void testPublishCustomEvent() throws Exception {
        CustomPublisher publisher = getBean(CustomPublisher.class);
        publisher.publishCustomEvent(new CustomEvent(context));
    }
}