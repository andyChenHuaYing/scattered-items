package org.springframework.samples.ioc.annotation.annotation.based.fine.turning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.model.AbstractPlainModel;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-02-02 22:21
 */
public class CustomAutowireConfigurerQualifierBean {
    @Autowired
    @CustomAutowireConfigurerQualifier("customAutowiredConfigurer")
    private AbstractPlainModel model;

    @Override
    public String toString() {
        return "CustomAutowireConfigurerQualifierBean{" +
                "model=" + model +
                '}';
    }
}
