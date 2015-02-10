package org.springframework.samples.ioc.extension.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;

/**
 * Happy daily, happy life.<br>
 * =========================<br>
 * Description:<br>
 * Created by andychen on 2015/2/10.<br>
 * Version 1.0-SNAPSHOT<br>
 */
public class CustomEvent extends ApplicationEvent {
    public CustomEvent(ApplicationContext source) {
        super(source);
    }
}
