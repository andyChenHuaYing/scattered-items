package org.springframework.samples.ioc.schema.injection.setter;


import org.springframework.samples.model.PlainModelOne;

import java.util.Date;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-24 13:02
 */
public class SetterInjectionBean {
    private Date date;
    private PlainModelOne plainModelOne;
    private String string;

    public void setString(String string) {
        this.string = string;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPlainModelOne(PlainModelOne plainModelOne) {
        this.plainModelOne = plainModelOne;
    }

    @Override
    public String toString() {
        return "SetterInjectionBean{" +
                "date=" + date +
                ", plainModelOne=" + plainModelOne +
                ", string='" + string + '\'' +
                '}';
    }
}
