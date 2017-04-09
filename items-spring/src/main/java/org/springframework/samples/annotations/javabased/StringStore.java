package org.springframework.samples.annotations.javabased;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-21 19:27
 */
public class StringStore implements Store {
    private String instanceType;

    public StringStore() {
    }

    public StringStore(String instanceType) {
        this.instanceType = instanceType;
    }

    public void showInstanceType() {
        System.out.println("Instance type : " + instanceType);
    }
}
