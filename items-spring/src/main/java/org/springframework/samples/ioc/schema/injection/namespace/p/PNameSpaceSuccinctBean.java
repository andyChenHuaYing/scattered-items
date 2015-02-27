package org.springframework.samples.ioc.schema.injection.namespace.p;

import org.springframework.samples.model.PlainModelOne;

/**
 * Happy daily, happy life.
 * <p/>
 * Description:
 * <p/>
 * Created by andychen on 2015/1/26.
 * Version 1.0-SNAPSHOT
 */
public class PNameSpaceSuccinctBean {
    private String str;
    private PlainModelOne plainModelOne;

    public void setStr(String str) {
        this.str = str;
    }

    public void setPlainModelOne(PlainModelOne plainModelOne) {
        this.plainModelOne = plainModelOne;
    }

    @Override
    public String toString() {
        return "PNameSpaceSuccinctBean{" +
                "str='" + str + '\'' +
                ", plainModelOne=" + plainModelOne +
                '}';
    }
}
