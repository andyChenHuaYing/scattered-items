package org.springframework.samples.annotations.beanAndconfiguration;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-01 20:03
 */
public class A {
    private B b;

    public A(B b) {
        System.out.println("a....");
        this.b = b;
    }
}
