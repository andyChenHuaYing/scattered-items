package org.springframework.samples.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ContextClosedEvent;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-28 20:12
 */
public class CleanConnEvent extends ContextClosedEvent {
    public CleanConnEvent(ApplicationContext source) {
        super(source);
        System.out.println(this.getClass().getName() + " is created...");
    }

    public void clearConnection() {
        System.out.println("clear connection...");
    }
}
