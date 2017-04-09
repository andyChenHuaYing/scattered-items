package org.andy.items.thkinjava.generics;

/**
 * Created by andy on 5/24/2015.<br>
 * Version 1.0-SNAPSHOT<br>
 */
public class TupleTest {
    static TwoTuple<String, Integer> f() {
        return new TwoTuple<>("twoTupleString", 1);
    }

    static ThreeTuple<String, Integer, Amphibian> g() {
        return new ThreeTuple<>("three", 2, new Amphibian());
    }

    static FourTuple<String, Integer, Amphibian, Vehicle> h() {
        return new FourTuple<>("four", 3, new Amphibian(), new Vehicle());
    }

    static FiveTuple<String, Integer, Amphibian, Vehicle, Double> i() {
        return new FiveTuple<>("five", 4, new Amphibian(), new Vehicle(), 1.0d);
    }

    public static void main(String[] args) {
        System.out.println(f());
        System.out.println(g());
        System.out.println(h());
        System.out.println(i());
    }
}

class Amphibian {
    @Override
    public String toString() {
        return "Amphibian{}";
    }
}

class Vehicle {
    @Override
    public String toString() {
        return "Vehicle{}";
    }
}
