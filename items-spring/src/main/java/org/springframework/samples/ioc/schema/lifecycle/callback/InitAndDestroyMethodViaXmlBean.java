package org.springframework.samples.ioc.schema.lifecycle.callback;

import org.springframework.samples.model.PlainModelOne;
import org.springframework.samples.model.PlainModelTwo;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-27 20:27
 */
public class InitAndDestroyMethodViaXmlBean {

    private String string;
    private PlainModelOne plainModelOne;
    private PlainModelTwo plainModelTwo;

    @SuppressWarnings("unused")
    public InitAndDestroyMethodViaXmlBean() {
    }

    @SuppressWarnings("unused")
    public InitAndDestroyMethodViaXmlBean(PlainModelOne plainModelOne) {
        //System.out.println("constructor : set plainModelTwo!");
        this.plainModelOne = plainModelOne;
    }

    public void init() {
        //System.out.println(this.getClass().getSimpleName() + " init.");
    }

    public void destroy() {
        //System.out.println(this.getClass().getSimpleName() + " destroy");
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "InitAndDestroyMethodViaXmlBean{" +
                "string='" + string + '\'' +
                ", plainModelOne=" + plainModelOne +
                ", plainModelTwo=" + plainModelTwo +
                '}';
    }

    public void setPlainModelTwo(PlainModelTwo plainModelTwo) {
        System.out.println("set method : plainModelTwo.");
        this.plainModelTwo = plainModelTwo;
    }
}
