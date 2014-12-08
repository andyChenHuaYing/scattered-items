package org.springframework.samples.annotations.beanAndconfiguration;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-24 19:27
 */
public class FooWithInnerBar {
    private Bar bar;

    public Bar getBar() {
        return bar;
    }

    public FooWithInnerBar(Bar bar) {
        this.bar = bar;
    }
}
