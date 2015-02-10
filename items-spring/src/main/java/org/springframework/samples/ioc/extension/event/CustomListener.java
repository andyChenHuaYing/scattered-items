package org.springframework.samples.ioc.extension.event;

import org.springframework.context.ApplicationListener;

/**
 * Happy daily, happy life.<br>
 * =========================<br>
 * Description:<br>
 * Created by andychen on 2015/2/10.<br>
 * Version 1.0-SNAPSHOT<br>
 */
public class CustomListener implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println(event.getClass().getSimpleName());
    }
}
