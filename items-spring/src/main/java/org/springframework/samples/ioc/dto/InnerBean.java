package org.springframework.samples.ioc.dto;

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
public class InnerBean {
    @Override
    public String toString() {
        return ShowReferencesUtil.showClassFullName(this);
    }
}
