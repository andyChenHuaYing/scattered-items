package org.oscar.items.thkinjava.generics.generic2016.wildcard;

/**
 * Author: oscar
 * Create Data: 09/03/16
 */
public class AnimalHolder<T> {

    private T t;

    public AnimalHolder(T t) {
        this.t = t;
    }

    public String getData() {
        return t.toString();
    }
}
