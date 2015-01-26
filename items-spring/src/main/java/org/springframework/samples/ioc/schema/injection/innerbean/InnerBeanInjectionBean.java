package org.springframework.samples.ioc.schema.injection.innerbean;

import org.springframework.samples.model.PlainModelOne;

/**
 * Happy daily, happy life.
 * <p/>
 * Description:
 * <p/>
 * Created by andychen on 2015/1/26.
 * Version 1.0-SNAPSHOT
 */
public class InnerBeanInjectionBean {
    private PlainModelOne plainModelOne;

    public void setPlainModelOne(PlainModelOne plainModelOne) {
        this.plainModelOne = plainModelOne;
    }

    @Override
    public String toString() {
        return "InnerBeanInjectionBean{" +
                "plainModelOne=" + plainModelOne +
                '}';
    }
}
