package org.alien.design.pattern.abstraction.factory.demo.product;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/3
 */
public abstract class FemalePerson {
    public void getSex(){
        System.out.println("Female...");
    }

    public abstract void getColor();
}
