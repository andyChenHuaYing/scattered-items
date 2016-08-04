package org.alien.design.pattern.template.demo;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/4
 */
public class BenzCarCreator extends CarCreator {
    @Override
    public void setColor() {
        System.out.println("Paint car: red...");
    }

    @Override
    public void setLogo() {
        System.out.println("Logo: Benz");
    }
}
