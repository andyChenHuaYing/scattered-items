package org.springframework.samples.model;

import org.springframework.samples.utils.ShowReferencesUtil;

/**
 * /**
 * Happy daily, happy life.
 * <p/>
 * Description:
 * <p/>
 * Created by andychen on 2015/1/23.
 * Version 1.0-SNAPSHOT
 */
@SuppressWarnings("unused")
public class InnerBeanModel {
    private String innerBeanModelStr;

    public void setInnerBeanModelStr(String innerBeanModelStr) {
        this.innerBeanModelStr = innerBeanModelStr;
    }

    public String getInnerBeanModelStr() {
        return innerBeanModelStr;
    }

    @Override
    public String toString() {
        return ShowReferencesUtil.showClassFullName(this);
    }
}
