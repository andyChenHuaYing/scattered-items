package org.springframework.samples.ioc.annotation.annotation.based.fine.turning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.model.AbstractPlainModel;

import java.util.Set;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-02-02 20:56
 */
public class CustomQualifierWithoutValueBean {
    @Autowired
    @CustomQualifierWithoutValue
    private Set<AbstractPlainModel> models;

    @Override
    public String toString() {
        return "CustomQualifierWithoutValueBean{" +
                "models=" + models +
                '}';
    }
}
