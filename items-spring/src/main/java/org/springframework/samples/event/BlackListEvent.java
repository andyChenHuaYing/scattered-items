package org.springframework.samples.event;

import org.springframework.context.ApplicationEvent;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-28 19:05
 */
public class BlackListEvent extends ApplicationEvent {
    private final String address;
    private final String test;

    public BlackListEvent(Object source, String address, String test) {
        super(source);
        this.address = address;
        this.test = test;
        System.out.println(this.getClass().getName() + " is created...");
    }

    public void showBlackAddressInfo() {
        System.out.println("Address : " + address + ", test : " + test);
    }
}
