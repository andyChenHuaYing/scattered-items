package org.oscar.items.thkinjava.generics.generic2016;

interface Animal {
    void speek();
}

interface Fish {
    void bubble();
}

/**
 * Author: oscar
 * Create Data: 08/03/16
 */
public class GenericBound {
    public static void main(String[] args) {
        Item<GolderFish> item = new Item<>(new GolderFish());
        item.doSomething();
    }
}

class GolderFish implements Animal, Fish {


    @Override
    public void speek() {
        System.out.println("speek something...");
    }

    @Override
    public void bubble() {
        System.out.println("bubble...");
    }
}

class HoldItem<T> {
    T item;

    public HoldItem(T item) {
        this.item = item;
    }

    @SuppressWarnings("unused")
    public T getItem() {
        return item;
    }

    @SuppressWarnings("unused")
    public void setItem(T item) {
        this.item = item;
    }
}

//泛型的extends后如果有多个接口则使用&分开
class Item<T extends Animal & Fish> extends HoldItem<T> {
    public Item(T t) {
        super(t);
    }

    public void doSomething() {
        super.item.speek();
        super.item.bubble();
    }
}
