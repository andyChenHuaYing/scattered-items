package org.nanshan.design.pattern.template.demo;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/4
 */
public class BMWCarCreator extends CarCreator {
    @Override
    public void setColor() {
        System.out.println("Paint: yellow...");
    }

    @Override
    public void setLogo() {
        System.out.println("Logo: BMW...");
    }
}
