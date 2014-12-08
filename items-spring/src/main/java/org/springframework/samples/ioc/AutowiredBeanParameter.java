package org.springframework.samples.ioc;

import org.springframework.samples.utils.ToString;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-17 20:51
 */
public class AutowiredBeanParameter {
    public AutowiredBeanParameter() {
        System.out.println(this.getClass().getName() + " is instantiated...");
    }

    @Override
    public String toString() {
        return ToString.toString(this.getClass());
    }
}
