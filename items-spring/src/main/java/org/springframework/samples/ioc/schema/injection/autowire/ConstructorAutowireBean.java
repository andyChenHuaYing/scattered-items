package org.springframework.samples.ioc.schema.injection.autowire;

import org.springframework.samples.model.AbstractPlainModel;

import java.util.Map;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-26 20:15
 */
public class ConstructorAutowireBean {
    private Map<String, AbstractPlainModel> map;

    public ConstructorAutowireBean(Map<String, AbstractPlainModel> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "ConstructorAutowireBean{" +
                "map=" + map +
                '}';
    }
}
