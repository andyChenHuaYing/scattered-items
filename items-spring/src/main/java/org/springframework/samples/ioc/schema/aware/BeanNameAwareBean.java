package org.springframework.samples.ioc.schema.aware;

import org.springframework.beans.factory.BeanNameAware;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-27 21:00
 */
public class BeanNameAwareBean implements BeanNameAware {
    private String name;

    @Override
    public void setBeanName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BeanNameAwareBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
