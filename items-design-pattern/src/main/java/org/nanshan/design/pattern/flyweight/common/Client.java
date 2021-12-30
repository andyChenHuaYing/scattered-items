package org.nanshan.design.pattern.flyweight.common;

import org.nanshan.design.pattern.flyweight.common.factory.FlyweightFactory;
import org.nanshan.design.pattern.flyweight.common.model.Flyweight;

/**
 * Author: oscar
 * Create Data: 29/08/16
 */
public class Client {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 30; j++) {
                String extrinsic = i + "_" + j;
                Flyweight flyweight = FlyweightFactory.getFlyWeight(extrinsic);
                System.out.println(flyweight);
            }
        }

        Flyweight flyweight = FlyweightFactory.getFlyWeight("1_10");
        System.out.println(flyweight);
    }
}
