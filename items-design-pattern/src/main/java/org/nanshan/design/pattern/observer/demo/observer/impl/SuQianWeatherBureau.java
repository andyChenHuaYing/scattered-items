package org.nanshan.design.pattern.observer.demo.observer.impl;

import org.nanshan.design.pattern.observer.demo.observer.Observer;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/18
 */
public class SuQianWeatherBureau implements Observer {
    @Override
    public void update(String temperature, String weather, String airQuality) {
        System.out.println("SuQian weather situation:");
        System.out.println("|-Temperature: " + temperature);
        System.out.println("|-Weather: " + weather);
        System.out.println("|-Air Quality: " + airQuality);
    }
}
