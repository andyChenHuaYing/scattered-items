package org.springframework.samples.data.transfer;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-24 13:45
 */
public class CustomDatePropertyEditor extends PropertyEditorSupport {

    private String formatter;

    public void setFormatter(String formatter) {
        this.formatter = formatter;
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatter);
        try {
            this.setValue(simpleDateFormat.parse(text));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
