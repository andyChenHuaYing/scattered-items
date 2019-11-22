package org.oscar.items.thkinjava.generics;

import org.oscar.items.thkinjava.entity.EntityOne;

/**
 * Created by andy on 5/24/2015.<br>
 * Version 1.0-SNAPSHOT<br>
 */
@SuppressWarnings("unused")
public class Holder3<T> {
    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Holder3<EntityOne> holder3 = new Holder3<>(new EntityOne());
        EntityOne entityOne = holder3.getA();
        System.out.println(entityOne);
    }

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }
}
