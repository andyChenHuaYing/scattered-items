package org.alien.design.pattern.singleton.common;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/1
 */
public class Client {

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance() == Singleton.getInstance());
    }
}
