package org.springframework.samples.ioc.annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.model.*;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-29 22:01
 */
public class AutowiredSingleBean {

    @Autowired
    private PlainModelOne plainModelOne;

    @Autowired(required = false)
    private InnerBeanModel innerBeanModel;

    @SuppressWarnings("unused")
    @Autowired(required = false)
    private PlainModelFour plainModelFour;

    private PlainModelTwo plainModelTwo;

    private PlainModelThree plainModelThree;

    @Autowired
    public void setPlainModelThree(PlainModelThree plainModelThree) {
        this.plainModelThree = plainModelThree;
    }

    @Autowired

    public AutowiredSingleBean(PlainModelTwo plainModelTwo) {
        this.plainModelTwo = plainModelTwo;
    }

    @Override
    public String toString() {
        return "AutowiredSingleBean{" +
                "plainModelOne=" + plainModelOne +
                ", innerBeanModel=" + innerBeanModel +
                ", plainModelFour=" + plainModelFour +
                ", plainModelTwo=" + plainModelTwo +
                ", plainModelThree=" + plainModelThree +
                '}';
    }

}
