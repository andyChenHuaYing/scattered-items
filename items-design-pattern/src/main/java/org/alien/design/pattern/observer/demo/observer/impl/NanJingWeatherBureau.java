package org.alien.design.pattern.observer.demo.observer.impl;

import org.alien.design.pattern.observer.demo.observer.Observer;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/18
 */
public class NanJingWeatherBureau implements Observer {
    @Override
    public void update(String temperature, String weather, String airQuality) {
        System.out.println("NanJing weather situation:");
        System.out.println("|-Temperature: " + temperature);
        System.out.println("|-Weather: " + weather);
        System.out.println("|-Air Quality: " + airQuality);
    }
}
