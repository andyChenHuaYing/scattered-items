package org.springframework.samples.ioc.schema.injection.setter;

import java.util.List;
import java.util.Set;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-24 15:46
 */
public class CollectionInjectionBean {
    private List<Object> list;
    private Set<Object> set;


    public void setList(List<Object> list) {
        this.list = list;
    }

    public void setSet(Set<Object> set) {
        this.set = set;
    }

    @Override
    public String toString() {
        return "CollectionInjectionBean{" +
                "list=" + list +
                ", set=" + set +
                '}';
    }
}

