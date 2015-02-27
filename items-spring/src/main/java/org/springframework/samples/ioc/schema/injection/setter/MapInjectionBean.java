package org.springframework.samples.ioc.schema.injection.setter;

import java.util.Map;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-24 16:10
 */
public class MapInjectionBean {
    private Map<String, Object> map;

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "MapInjectionBean{" +
                "map=" + map +
                '}';
    }
}
