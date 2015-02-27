package org.springframework.samples.ioc.schema.container.extension;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-28 20:49
 */
public class PropertyPlaceholderConfigurerModel {
    private int intOne;
    private boolean booleanOne;
    private float floatOne;
    private String strOne;

    public void setIntOne(int intOne) {
        this.intOne = intOne;
    }

    public void setBooleanOne(boolean booleanOne) {
        this.booleanOne = booleanOne;
    }

    public void setFloatOne(float floatOne) {
        this.floatOne = floatOne;
    }

    @SuppressWarnings("unused")
    public void setStrOne(String strOne) {
        this.strOne = strOne;
    }

    @Override
    public String toString() {
        return "PropertyPlaceholderConfigurerModel{" +
                "intOne=" + intOne +
                ", booleanOne=" + booleanOne +
                ", floatOne=" + floatOne +
                ", strOne='" + strOne + '\'' +
                '}';
    }
}
