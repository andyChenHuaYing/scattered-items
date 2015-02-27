package org.springframework.samples.ioc.schema.injection.emptyandnull.string;

/**
 * Happy daily, happy life.
 * <p/>
 * Description:
 * <p/>
 * Created by andychen on 2015/1/26.
 * Version 1.0-SNAPSHOT
 */
public class EmptyAndNullStringValueBean {
    private String nullValue;
    private String emptyValue;

    public void setNullValue(String nullValue) {
        this.nullValue = nullValue;
    }

    public void setEmptyValue(String emptyValue) {
        this.emptyValue = emptyValue;
    }

    @Override
    public String toString() {
        return "EmptyAndNullStringValueBean{" +
                "nullValue='" + nullValue + '\'' +
                ", emptyValue='" + emptyValue + '\'' +
                '}';
    }
}
