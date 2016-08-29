package org.alien.design.pattern.builder.demo.product;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/9
 */
public class BMWCarModel extends CarModel {
    @Override
    public void start() {
        System.out.println("BMWModel.start");
    }

    @Override
    public void stop() {
        System.out.println("BMWModel.stop");
    }

    @Override
    public void engineBoom() {
        System.out.println("BMWModel.engineBoom");
    }

    @Override
    public void alarm() {
        System.out.println("BMWModel.alarm");
    }
}
