package org.andy.items.thkinjava.generics.model;

/**
 * Author: oscar
 * Create Data: 09/03/16
 */
@SuppressWarnings("unused")
public class Dog extends Animal {
    @Override
    public void animalMethod() {
        System.out.println("DOG method");
    }

    @Override
    public String toString() {
        return "Dog";
    }
}
