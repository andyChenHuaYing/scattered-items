package org.alien.design.pattern.prototype.common;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/22
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototypeClass concretePrototypeClass = new ConcretePrototypeClass();
        System.out.println(concretePrototypeClass);
        System.out.println(concretePrototypeClass.clone());
    }
}
