package org.springframework.samples.ioc.schema.injection.setter;

import java.util.Arrays;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-24 16:02
 */
public class ArrayInjectionBean {
    private Object[] objects;
    private Object[][] objs;


    public void setObjects(Object[] objects) {
        this.objects = objects;
    }

    public void setObjs(Object[][] objs) {
        this.objs = objs;
    }

    @Override
    public String toString() {
        return "ArrayInjectionBean{" +
                "objects=" + Arrays.toString(objects) +
                ", objs=" + Arrays.toString(objs) +
                '}';
    }
}
