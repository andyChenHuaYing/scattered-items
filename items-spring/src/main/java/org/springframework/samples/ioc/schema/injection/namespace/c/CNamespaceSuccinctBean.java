package org.springframework.samples.ioc.schema.injection.namespace.c;

import org.springframework.samples.model.PlainModelOne;
import org.springframework.samples.model.PlainModelThree;
import org.springframework.samples.model.PlainModelTwo;

/**
 * Happy daily, happy life.
 * <p/>
 * Description:
 * <p/>
 * Created by andychen on 2015/1/26.
 * Version 1.0-SNAPSHOT
 */
public class CNamespaceSuccinctBean {
    private String string;
    private PlainModelOne plainModelOne;
    private PlainModelTwo plainModelTwo;
    private PlainModelThree plainModelThree;

    public CNamespaceSuccinctBean(String string, PlainModelOne plainModelOne, PlainModelTwo plainModelTwo, PlainModelThree plainModelThree) {
        this.string = string;
        this.plainModelOne = plainModelOne;
        this.plainModelTwo = plainModelTwo;
        this.plainModelThree = plainModelThree;
    }

    @Override
    public String toString() {
        return "CNamespaceSuccinctBean{" +
                "string='" + string + '\'' +
                ", plainModelOne=" + plainModelOne +
                ", plainModelTwo=" + plainModelTwo +
                ", plainModelThree=" + plainModelThree +
                '}';
    }
}
