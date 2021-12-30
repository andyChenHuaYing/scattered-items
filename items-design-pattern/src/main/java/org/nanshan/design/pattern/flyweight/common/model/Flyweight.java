package org.nanshan.design.pattern.flyweight.common.model;

/**
 * Author: oscar
 * Create Data: 29/08/16
 */
@SuppressWarnings("unused")
public abstract class Flyweight {

    protected final String extrinsic;
    private String intrinsic;

    public Flyweight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }

    public abstract void operate();

    @Override
    public String toString() {
        return "Flyweight{" +
                "intrinsic='" + intrinsic + '\'' +
                ", extrinsic='" + extrinsic + '\'' +
                '}';
    }
}
