package org.alien.design.pattern.observer.demo.subject;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/18
 */
public class NanJingWeather extends Weather {

    @Override
    public void updateWeatherSituation(String temperature, String weather, String airQuality) {
        super.temperature = temperature;
        super.weather = weather;
        super.airQuality = airQuality;
        super.notifyAllObservers();
    }
}
