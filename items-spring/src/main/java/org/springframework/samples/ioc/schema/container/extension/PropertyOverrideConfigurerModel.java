package org.springframework.samples.ioc.schema.container.extension;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-28 21:18
 */
public class PropertyOverrideConfigurerModel {
    private int intOne;
    private int intTwo;
    private String strOne;
    private String strTwo;

    public void setIntOne(int intOne) {
        this.intOne = intOne;
    }

    public void setIntTwo(int intTwo) {
        this.intTwo = intTwo;
    }

    public void setStrOne(String strOne) {
        this.strOne = strOne;
    }

    public void setStrTwo(String strTwo) {
        this.strTwo = strTwo;
    }

    @Override
    public String toString() {
        return "PropertyOverrideConfigurerModel{" +
                "intOne=" + intOne +
                ", intTwo=" + intTwo +
                ", strOne='" + strOne + '\'' +
                ", strTwo='" + strTwo + '\'' +
                '}';
    }
}
