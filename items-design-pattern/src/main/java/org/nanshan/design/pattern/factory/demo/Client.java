package org.nanshan.design.pattern.factory.demo;

import org.nanshan.design.pattern.factory.demo.factory.HumanFactory;
import org.nanshan.design.pattern.factory.demo.factory.SimpleHumanFactory;
import org.nanshan.design.pattern.factory.demo.product.BlackHuman;
import org.nanshan.design.pattern.factory.demo.product.Human;
import org.nanshan.design.pattern.factory.demo.product.WhiteHuman;
import org.nanshan.design.pattern.factory.demo.product.YellowHuman;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/2
 */
public class Client {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        HumanFactory humanFactory = new SimpleHumanFactory();
        Human blackHuman = humanFactory.createHuman(BlackHuman.class);
        Human whiteHuman = humanFactory.createHuman(WhiteHuman.class);
        Human yellowHuman = humanFactory.createHuman(YellowHuman.class);
        blackHuman.getColor();
        whiteHuman.getColor();
        yellowHuman.getColor();
    }
}
