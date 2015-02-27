package org.springframework.samples.ioc.annotation.annotation.based.required;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.samples.model.PlainModelOne;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-29 21:53
 */
public class RequiredAnnotationBean {
    private PlainModelOne plainModelOne;


    @Required
    public void setPlainModelOne(PlainModelOne plainModelOne) {
        this.plainModelOne = plainModelOne;
    }

    @Override
    public String toString() {
        return "RequiredAnnotationBean{" +
                "plainModelOne=" + plainModelOne +
                '}';
    }
}
