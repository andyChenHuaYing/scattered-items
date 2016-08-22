package org.alien.design.pattern.observer.demo;

import org.alien.design.pattern.observer.demo.observer.impl.NanJingWeatherBureau;
import org.alien.design.pattern.observer.demo.observer.impl.SuQianWeatherBureau;
import org.alien.design.pattern.observer.demo.observer.impl.SuZhouWeatherBureau;
import org.alien.design.pattern.observer.demo.subject.NanJingWeather;
import org.alien.design.pattern.observer.demo.subject.Weather;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/18
 */
public class Client {

    public static void main(String[] args) {
        Weather weather = new NanJingWeather();

        NanJingWeatherBureau nanJingWeatherBureau = new NanJingWeatherBureau();
        SuQianWeatherBureau suQianWeatherBureau = new SuQianWeatherBureau();
        SuZhouWeatherBureau suZhouWeatherBureau = new SuZhouWeatherBureau();

        weather.addObserver(nanJingWeatherBureau);
        weather.addObserver(suQianWeatherBureau);
        weather.addObserver(suZhouWeatherBureau);

        weather.updateWeatherSituation("10 C", "Cloudy", "Great");
    }
}
