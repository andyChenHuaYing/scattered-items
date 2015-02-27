package org.springframework.samples.ioc.schema.container.extension;

import org.springframework.samples.model.PlainModelOne;
import org.springframework.samples.model.PlainModelTwo;
import org.springframework.samples.utils.ExecutionOrderUtil;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-28 20:02
 */
public class BeanPostProcessorModelBean {

    public PlainModelOne plainModelOne;
    public PlainModelTwo plainModelTwo;

    public void setPlainModelTwo(PlainModelTwo plainModelTwo) {
        ExecutionOrderUtil.put(this.getClass().getSimpleName() + " inject plainModelOne via set method.");
        this.plainModelTwo = plainModelTwo;
    }

    public BeanPostProcessorModelBean(PlainModelOne plainModelOne) {
        ExecutionOrderUtil.put(this.getClass().getSimpleName() + " inject plainModelTwo via constructor.");
        this.plainModelOne = plainModelOne;
    }

    public void init() {
        ExecutionOrderUtil.put(this.getClass().getSimpleName() + " init.");
    }

    public void destroy() {
        ExecutionOrderUtil.put(this.getClass().getSimpleName() + " destroy.");
    }
}
