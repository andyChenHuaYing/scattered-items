package org.springframework.samples.ioc;

import org.springframework.samples.utils.ToString;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-15 11:23
 */
public class Baz {
    @Override
    public String toString() {
        return ToString.toString(this.getClass());
    }
}
