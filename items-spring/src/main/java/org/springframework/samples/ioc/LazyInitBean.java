package org.springframework.samples.ioc;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-17 20:20
 */
public class LazyInitBean {
    public LazyInitBean() {
        System.out.println(this.getClass().getName() + " is instantiated...");
    }
}
