package org.alien.design.pattern.builder.product;

/**
 * Created by andychen on 2015/6/1.<br>
 * Version 1.0-SNAPSHOT<br>
 */
public class BMWCarModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("BMWCar start...");
    }

    @Override
    protected void stop() {
        System.out.println("BMWCar stop...");
    }

    @Override
    protected void alarm() {
        System.out.println("BMWCar alarm...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("BMWCar engineBoom...");
    }
}
