package org.springframework.samples.event;

import org.springframework.context.ApplicationListener;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-28 20:15
 */
public class ShutdownListener implements ApplicationListener<CleanConnEvent> {
    @Override
    public void onApplicationEvent(CleanConnEvent event) {
        event.clearConnection();
    }
}
