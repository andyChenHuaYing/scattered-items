package org.springframework.samples.ioc.schema.injection.constructor;

import org.springframework.samples.model.PlainModelOne;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-24 10:42
 */
public class ConstructorInjectionBean {
    private int varIntOne;
    private String varStringOne;
    private String varStringTwo;
    private PlainModelOne varPlainModelOne;

    public ConstructorInjectionBean() {
        System.out.println("ConstructorInjectionBean() is used!");
    }

    public ConstructorInjectionBean(int varIntOne, String varStringOne,
                                    String varStringTwo, PlainModelOne varPlainModelOne) {
        this.varIntOne = varIntOne;
        this.varStringOne = varStringOne;
        this.varStringTwo = varStringTwo;
        this.varPlainModelOne = varPlainModelOne;
        System.out.println("ConstructorInjectionBean(int varIntOne, String varStringOne, String varStringTwo, " +
                "PlainModelOne varPlainModelOne)  is used!");
    }

    public ConstructorInjectionBean(String varStringOne, String varStringTwo) {
        this.varStringOne = varStringOne;
        this.varStringTwo = varStringTwo;
        System.out.println("ConstructorInjectionBean(String varStringOne, String varStringTwo) is used!");
    }

    public ConstructorInjectionBean(int varIntOne, String varStringOne) {

        this.varIntOne = varIntOne;
        this.varStringOne = varStringOne;
        System.out.println("ConstructorInjectionBean(int varIntOne, String varStringOne) is used!");
    }

    public ConstructorInjectionBean(int varIntOne) {
        this.varIntOne = varIntOne;
        System.out.println("ConstructorInjectionBean(int varIntOne) is used!");
    }

    @Override
    public String toString() {
        return "ConstructorInjectionBean{" +
                "varIntOne=" + varIntOne +
                ", varStringOne='" + varStringOne + '\'' +
                ", varStringTwo='" + varStringTwo + '\'' +
                ", varPlainModelOne=" + varPlainModelOne +
                '}';
    }
}
