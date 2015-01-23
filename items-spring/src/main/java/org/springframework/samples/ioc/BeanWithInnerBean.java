package org.springframework.samples.ioc;

import org.springframework.samples.ioc.dto.InnerBean;

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
    private InnerBean innerBean;

    @SuppressWarnings("unused")
    public void setInnerBean(InnerBean innerBean) {
        this.innerBean = innerBean;
    }

    public String showInnerBean() {
        return innerBean.toString();
    }
}
