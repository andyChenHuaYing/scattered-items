package org.oscar.items.thkinjava.generics.generic2016;

import org.oscar.items.thkinjava.entity.EntityOne;

/**
 * Author: oscar
 * Create Data: 01/03/16
 */
public class Holder<T> {

    private T t;

    public static void main(String[] args) {
        EntityOne entityOne = new EntityOne();
        Holder<EntityOne> holder = new Holder<>();
        holder.setT(entityOne);
        System.out.println(holder);
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Holder{" +
                "t=" + t +
                '}';
    }
}
