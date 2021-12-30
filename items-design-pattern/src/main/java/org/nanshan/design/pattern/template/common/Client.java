package org.nanshan.design.pattern.template.common;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/4
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass abstractClass = new AbstractClassImplA();
        abstractClass.templateMethod();

        AbstractClass abstractClassImplB = new AbstractClassImplB();
        abstractClassImplB.templateMethod();
    }
}
