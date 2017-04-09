package org.alien.design.pattern.template.demo;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/4
 */
public abstract class CarCreator {

    public abstract void setColor();

    public abstract void setLogo();

    public final void showCarInfo() {
        this.setColor();
        this.setLogo();
    }
}
