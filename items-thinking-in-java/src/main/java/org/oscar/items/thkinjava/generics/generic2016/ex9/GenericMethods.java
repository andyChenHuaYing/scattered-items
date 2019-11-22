package org.oscar.items.thkinjava.generics.generic2016.ex9;

import org.oscar.items.thkinjava.entity.EntityOne;

/**
 * Created by andy on 5/24/2015.<br>
 * Version 1.0-SNAPSHOT<br>
 */
public class GenericMethods {
    public static void main(String[] args) {
        GenericMethods genericMethods = new GenericMethods();
        genericMethods.f("");
        genericMethods.f(1.0);
        genericMethods.f(1.0D);
        genericMethods.f(1.0F);
        genericMethods.f('c');
        genericMethods.f(genericMethods);
        genericMethods.f("", 1.0, 1.0F);
    }

    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }

    public <T> void f(T x, String s, EntityOne entityOne) {
        System.out.println(x.getClass().getName() + " " + s + entityOne.getClass().getName());
    }

    public <T, B, A> B f(T x, B b, A a) {
        System.out.println(x.getClass().getSimpleName() + " : " +
                b.getClass().getSimpleName() + " : " + a.getClass().getSimpleName());
        return b;
    }
}
