package org.springframework.samples.ioc.schema.injection.setter;

import java.util.Properties;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-24 16:01
 */
public class PropertiesInjectionBean {
    private Properties properties;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "PropertiesInjectionBean{" +
                "properties=" + properties +
                '}';
    }
}
