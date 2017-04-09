package org.andy.items.thkinjava.generics.generic2016;

/**
 * Author: oscar
 * Create Data: 08/03/16
 */
@SuppressWarnings("unused")
public class GenericClass<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public <E> E genericMethod(E e) {
        return e;
    }
}
