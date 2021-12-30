package org.nanshan.design.pattern.template.demo;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/4
 */
public class Client {
    public static void main(String[] args) {
        CarCreator carCreator1 = new BenzCarCreator();
        carCreator1.showCarInfo();
        CarCreator carCreator = new BMWCarCreator();
        carCreator.showCarInfo();
    }
}
