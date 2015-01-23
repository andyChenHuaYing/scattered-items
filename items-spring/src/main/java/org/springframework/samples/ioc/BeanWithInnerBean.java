package org.springframework.samples.ioc;

import org.springframework.samples.model.InnerBeanModel;

/**
 * /**
 * Happy daily, happy life.
 * <p/>
 * Description:
 * <p/>
 * Created by andychen on 2015/1/23.
 * Version 1.0-SNAPSHOT
 */
public class BeanWithInnerBean {
    private InnerBeanModel innerBeanModel;

    @SuppressWarnings("unused")
    public void setInnerBeanModel(InnerBeanModel innerBeanModel) {
        this.innerBeanModel = innerBeanModel;
    }

    public String showInnerBean() {
        return innerBeanModel.toString();
    }
}
