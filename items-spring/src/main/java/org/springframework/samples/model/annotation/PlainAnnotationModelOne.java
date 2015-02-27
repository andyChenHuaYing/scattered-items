package org.springframework.samples.model.annotation;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-02-04 22:05
 */
@SuppressWarnings("unused")
public class PlainAnnotationModelOne extends AbstractPlainAnnotationModelOne {

    private int anInt;
    private String string;
    private boolean aBoolean;
    private AbstractPlainAnnotationModelOne abstractPlainAnnotationModelOne;

    public PlainAnnotationModelOne(int anInt, String string, boolean aBoolean, AbstractPlainAnnotationModelOne abstractPlainAnnotationModelOne) {
        this.anInt = anInt;
        this.string = string;
        this.aBoolean = aBoolean;
        this.abstractPlainAnnotationModelOne = abstractPlainAnnotationModelOne;
    }

    public PlainAnnotationModelOne(int anInt, String string, boolean aBoolean) {
        this.anInt = anInt;
        this.string = string;
        this.aBoolean = aBoolean;
    }

    public PlainAnnotationModelOne(int anInt, String string) {

        this.anInt = anInt;
        this.string = string;
    }

    public PlainAnnotationModelOne() {

    }

    public PlainAnnotationModelOne(int anInt) {

        this.anInt = anInt;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public boolean isaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    public AbstractPlainAnnotationModelOne getAbstractPlainAnnotationModelOne() {
        return abstractPlainAnnotationModelOne;
    }

    public void setAbstractPlainAnnotationModelOne(AbstractPlainAnnotationModelOne abstractPlainAnnotationModelOne) {
        this.abstractPlainAnnotationModelOne = abstractPlainAnnotationModelOne;
    }

    @Override
    public String toString() {
        return "PlainAnnotationModelOne{" +
                "anInt=" + anInt +
                ", string='" + string + '\'' +
                ", aBoolean=" + aBoolean +
                ", abstractPlainAnnotationModelOne=" + abstractPlainAnnotationModelOne +
                '}';
    }
}
