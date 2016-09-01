package org.andy.items.thkinjava.generics.model;

/**
 * Author: oscar
 * Create Data: 09/03/16
 */
@SuppressWarnings("unused")
public class Fish extends Animal {
    @Override
    public void animalMethod() {
        System.out.println("Fish method");
    }

    @Override
    public String toString() {
        return "Fish";
    }
}
