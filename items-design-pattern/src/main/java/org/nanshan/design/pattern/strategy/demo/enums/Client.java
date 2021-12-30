package org.nanshan.design.pattern.strategy.demo.enums;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/22
 */
public class Client {

    public static void main(String[] args) {
        System.out.println(Calculator.ADD.exec(1, 2));
        System.out.println(Calculator.DEL.exec(1, 2));
    }
}
