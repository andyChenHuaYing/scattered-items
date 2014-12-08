package org.springframework.samples.event;

import org.springframework.context.ApplicationListener;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-28 19:11
 */
public class BlackListNotifier implements ApplicationListener<BlackListEvent> {
    private String notificationAddress;

    public BlackListNotifier() {
        System.out.println(this.getClass().getName() + " is created...");
    }

    public void setNotificationAddress(String notificationAddress) {
        this.notificationAddress = notificationAddress;
    }

    @Override
    public void onApplicationEvent(BlackListEvent event) {
        event.showBlackAddressInfo();
        System.out.println("Notifier : " + notificationAddress);
    }
}
