package org.springframework.samples.ioc.annotation.annotation.based.generic.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.model.AbstractGenericPlainModel;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-02-02 22:05
 */
public class GenericQualifierImplicitBean {
    @Autowired
    private AbstractGenericPlainModel<String> stringModel;
    @Autowired
    private AbstractGenericPlainModel<Integer> intModel;

    @Override
    public String toString() {
        return "GenericQualifierImplicitBean{" +
                "stringModel=" + stringModel +
                ", intModel=" + intModel +
                '}';
    }
}
