package org.springframework.samples.ioc.schema.instantiation.factory;

import org.springframework.samples.model.PlainModelOne;
import org.springframework.samples.model.PlainModelTwo;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-23 23:24
 */
public class InstantiateBeanStaticFactory {
    private static PlainModelOne plainModelOne;
    private PlainModelTwo plainModelTwo;
    private String string;

    private InstantiateBeanStaticFactory() {
    }

    /**
     * Create PlainModelOne instance.
     *
     * @return PlainModelOne instance.
     */
    public static PlainModelOne instantiatePlainModelOne() {
        return plainModelOne == null ? plainModelOne = new PlainModelOne() : plainModelOne;
    }

    public static InstantiateBeanStaticFactory createInstantiateBeanStaticFactory(PlainModelOne plainModelOne,
                                                                                  PlainModelTwo plainModelTwo,
                                                                                  String string) {
        InstantiateBeanStaticFactory.plainModelOne = plainModelOne;
        InstantiateBeanStaticFactory instantiateBeanStaticFactory = new InstantiateBeanStaticFactory();
        instantiateBeanStaticFactory.plainModelTwo = plainModelTwo;
        instantiateBeanStaticFactory.string = string;
        return instantiateBeanStaticFactory;
    }

    @Override
    public String toString() {
        return "InstantiateBeanStaticFactory{" +
                "plainModelTwo=" + plainModelTwo +
                ", string='" + string + '\'' +
                '}';
    }
}
