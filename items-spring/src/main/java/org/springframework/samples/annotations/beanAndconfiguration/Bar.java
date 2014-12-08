package org.springframework.samples.annotations.beanAndconfiguration;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-24 19:07
 */
public class Bar {
    public void barInit() {
        System.out.println("barInit...");
    }

    public void barDestroy() {
        System.out.println("barDestroy...");
    }
}
