package org.springframework.samples.ioc.schema.parent;

import org.springframework.samples.model.PlainModelOne;
import org.springframework.samples.model.PlainModelThree;
import org.springframework.samples.model.PlainModelTwo;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-27 21:30
 */
public class WithParentAttributeBean {
    private String string;
    private PlainModelOne plainModelOne;
    private PlainModelTwo plainModelTwo;
    private PlainModelThree plainModelThree;

    public void init() {
        System.out.println(this.getClass().getSimpleName() + " init!");
    }

    public void destroy() {
        System.out.println(this.getClass().getSimpleName() + " destroy!");
    }

    public void setString(String string) {
        this.string = string;
    }

    public void setPlainModelOne(PlainModelOne plainModelOne) {
        this.plainModelOne = plainModelOne;
    }

    public void setPlainModelTwo(PlainModelTwo plainModelTwo) {
        this.plainModelTwo = plainModelTwo;
    }

    public void setPlainModelThree(PlainModelThree plainModelThree) {
        this.plainModelThree = plainModelThree;
    }

    @Override
    public String toString() {
        return "WithParentAttributeBean{" +
                "string='" + string + '\'' +
                ", plainModelOne=" + plainModelOne +
                ", plainModelTwo=" + plainModelTwo +
                ", plainModelThree=" + plainModelThree +
                '}';
    }
}
