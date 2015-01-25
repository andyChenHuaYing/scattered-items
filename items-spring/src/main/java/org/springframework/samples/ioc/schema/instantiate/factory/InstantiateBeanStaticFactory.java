package org.springframework.samples.ioc.schema.instantiate.factory;

import org.springframework.samples.model.PlainModelOne;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-23 23:24
 */
public class InstantiateBeanStaticFactory {
    private static PlainModelOne plainModelOne;

    public static PlainModelOne instantiatePlainModelOne() {
        return plainModelOne == null ? plainModelOne = new PlainModelOne() : plainModelOne;
    }
}
