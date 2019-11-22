package org.oscar.items.thkinjava.generics.generic2016.bound;

interface Animal {
    void speek();
}

interface Fish {
    void bubble();
}

public class GenericBound {
    public static void main(String[] args) {
        Item<GolderFish> item = new Item<>(new GolderFish());
        item.doSomething();
    }
}

/**
 * 俩接口的实现类，可以符合Item类T的要求，满足其类型参数要求。
 */
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
    T t;

    public HoldItem(T t) {
        this.t = t;
    }

    @SuppressWarnings("unused")
    public T getT() {
        return t;
    }

    @SuppressWarnings("unused")
    public void setT(T t) {
        this.t = t;
    }
}

//泛型的extends后如果有多个接口则使用&分开
class Item<T extends Animal & Fish> extends HoldItem<T> {
    public Item(T t) {
        super(t);
    }

    /**
     * 此时的T可以视为Animal和Fish接口的实现类，可以使用其方法。
     */
    public void doSomething() {
        super.t.speek();
        super.t.bubble();
    }
}

