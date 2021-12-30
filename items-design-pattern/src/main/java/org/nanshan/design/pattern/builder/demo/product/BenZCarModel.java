package org.nanshan.design.pattern.builder.demo.product;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/9
 */
public class BenZCarModel extends CarModel {
    @Override
    public void start() {
        System.out.println("BenZCarModel.start");
    }

    @Override
    public void stop() {
        System.out.println("BenZCarModel.stop");
    }

    @Override
    public void engineBoom() {
        System.out.println("BenZCarModel.engineBoom");
    }

    @Override
    public void alarm() {
        System.out.println("BenZCarModel.alarm");
    }
}
