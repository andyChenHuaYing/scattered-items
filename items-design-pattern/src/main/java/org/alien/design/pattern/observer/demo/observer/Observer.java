package org.alien.design.pattern.observer.demo.observer;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/18
 */
public interface Observer {
    void update(String temperature, String weather, String airQuality);
}
