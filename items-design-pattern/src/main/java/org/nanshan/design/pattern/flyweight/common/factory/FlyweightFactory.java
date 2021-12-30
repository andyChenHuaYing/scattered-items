package org.nanshan.design.pattern.flyweight.common.factory;

import org.nanshan.design.pattern.flyweight.common.model.ConcreteFlyweight;
import org.nanshan.design.pattern.flyweight.common.model.Flyweight;

import java.util.HashMap;

/**
 * Author: oscar
 * Create Data: 29/08/16
 */
public class FlyweightFactory {

    private static HashMap<String, Flyweight> flyweightHashMap = new HashMap<>();

    public static Flyweight getFlyWeight(String key) {
        Flyweight flyweight;
        if (flyweightHashMap.containsKey(key)) {
            System.out.println("Get Flyweight from pool...");
            flyweight = flyweightHashMap.get(key);
        } else {
            System.out.println("Put Flyweight into pool...");
            flyweight = new ConcreteFlyweight(key);
            flyweightHashMap.put(key, flyweight);
        }
        return flyweight;
    }


}
