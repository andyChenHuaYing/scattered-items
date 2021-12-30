package org.nanshan.design.pattern.prototype.common;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/22
 */
public class ConcretePrototypeClass extends PrototypeClass {

    @Override
    protected ConcretePrototypeClass clone() throws CloneNotSupportedException {
        ConcretePrototypeClass concretePrototypeClass = null;
        try {
            concretePrototypeClass = (ConcretePrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return concretePrototypeClass;
    }
}
