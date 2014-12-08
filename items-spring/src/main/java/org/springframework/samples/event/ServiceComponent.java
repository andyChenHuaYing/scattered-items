package org.springframework.samples.event;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-28 20:16
 */
public class ServiceComponent implements ApplicationEventPublisherAware, ApplicationContextAware {

    private ApplicationContext context;

    private ApplicationEventPublisher publisher;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }


    public void closeApplication() {
        publisher.publishEvent(new CleanConnEvent(context));
    }
}
