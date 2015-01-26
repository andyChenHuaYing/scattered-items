package org.springframework.samples.ioc.schema.injection.autowire;

import org.springframework.samples.model.AbstractPlainModel;
import org.springframework.samples.model.PlainModelOne;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-26 20:16
 */
@SuppressWarnings("unused")
public class SingleAutowireBean {
    private AbstractPlainModel abstractPlainModel;
    private PlainModelOne plainModelOneSingleton;

    public void setPlainModelOneSingleton(PlainModelOne plainModelOneSingleton) {
        this.plainModelOneSingleton = plainModelOneSingleton;
    }

    public void setAbstractPlainModel(AbstractPlainModel abstractPlainModel) {
        this.abstractPlainModel = abstractPlainModel;
    }

    @Override
    public String toString() {
        return "SingleAutowireBean{" +
                "abstractPlainModel=" + abstractPlainModel +
                ", plainModelOneSingleton=" + plainModelOneSingleton +
                '}';
    }
}
