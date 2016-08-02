package org.alien.design.pattern.singleton.common;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/1
 */
public class Singleton {

    private Singleton(){}

    private static class SingletonBuilder{
        private static final Singleton SINGLETON = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonBuilder.SINGLETON;
    }
}
