package org.springframework.samples.ioc.schema.injection.compound.property;

import org.springframework.samples.model.PlainModelTwo;

/**
 * Happy daily, happy life.
 * <p/>
 * Description:
 * <p/>
 * Created by andychen on 2015/1/26.
 * Version 1.0-SNAPSHOT
 */
public class CompoundPropertyBean {
    private PlainModelTwo plainModelTwoSingleton;

    public PlainModelTwo getPlainModelTwoSingleton() {
        return plainModelTwoSingleton;
    }

    public void setPlainModelTwoSingleton(PlainModelTwo plainModelTwoSingleton) {
        this.plainModelTwoSingleton = plainModelTwoSingleton;
    }

    @Override
    public String toString() {
        return "CompoundPropertyBean{" +
                "plainModelTwoSingleton=" + plainModelTwoSingleton +
                '}';
    }
}
