package org.springframework.samples.ioc.schema.injection.method;

import org.springframework.samples.model.PlainModelOne;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-26 21:06
 */
public abstract class LookUpMethodBean {

    public abstract PlainModelOne createPlainModelOnePrototype();

    @Override
    public String toString() {
        return "LookUpMethodBean{" +
                "plainModelOnePrototype=" + createPlainModelOnePrototype() +
                '}';
    }
}
