package org.nanshan.design.pattern.factory.extention.repalce.singleton;

import org.nanshan.design.pattern.factory.common.product.ConcreteProductA;
import org.nanshan.design.pattern.factory.common.product.ConcreteProductB;
import org.nanshan.design.pattern.factory.common.product.Product;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/2
 */
public class Client {

    public static void main(String[] args) throws InstantiationException {
        for (int i = 0; i < 10; i++) {
            Product concreteProductA = SingletonFactory.getProduct(ConcreteProductA.class);
            System.out.println(concreteProductA.toString() + " | " + concreteProductA.hashCode());
        }

        System.out.println("---------- break line ----------");

        for (int i = 0; i < 10; i++) {
            Product concreteProductB = SingletonFactory.getProduct(ConcreteProductB.class);
            System.out.println(concreteProductB.toString() + " | " + concreteProductB.hashCode());
        }
    }
}
