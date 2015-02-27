package org.springframework.samples.ioc.annotation.annotation.based.fine.turning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.model.InnerBeanModel;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-02-02 20:35
 */
public class CustomQualifierBean {
    @Autowired
    @CustomQualifier("innerBeanModelSingletonCustomQualifier")
    private InnerBeanModel innerBeanModel;

    @Override
    public String toString() {
        return "CustomQualifierBean{" +
                "innerBeanModel=" + innerBeanModel +
                '}';
    }
}
