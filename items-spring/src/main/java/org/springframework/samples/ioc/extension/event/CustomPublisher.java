package org.springframework.samples.ioc.extension.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * Happy daily, happy life.<br>
 * =========================<br>
 * Description:<br>
 * Created by andychen on 2015/2/10.<br>
 * Version 1.0-SNAPSHOT<br>
 */
public class CustomPublisher implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }

    public void publishCustomEvent(CustomEvent customEvent) {
        //biz code.
        publisher.publishEvent(customEvent);
    }
}
