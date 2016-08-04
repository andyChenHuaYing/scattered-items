package org.alien.design.pattern.factory.extention.repalce.singleton;

import org.alien.design.pattern.factory.common.product.ConcreteProductA;
import org.alien.design.pattern.factory.common.product.ConcreteProductB;
import org.alien.design.pattern.factory.common.product.Product;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/2
 */
public class Client {

    public static void main(String[] args) throws InstantiationException {
        for (int i = 0; i < 10; i++) {
            Product concreteProductA = SingletonFatory.getProduct(ConcreteProductA.class);
            System.out.println(concreteProductA.toString()+ " | " + concreteProductA.hashCode());
        }

        System.out.println("---------- break line ----------");

        for (int i = 0; i < 10; i++) {
            Product concreteProductB = SingletonFatory.getProduct(ConcreteProductB.class);
            System.out.println(concreteProductB.toString() + " | " + concreteProductB.hashCode());
        }
    }
}
