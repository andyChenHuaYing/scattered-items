package org.nanshan.design.pattern.abstraction.factory.common.factory;

import org.nanshan.design.pattern.abstraction.factory.common.product.ProductA;
import org.nanshan.design.pattern.abstraction.factory.common.product.ProductB;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/3
 */
public abstract class AbstractFactory {

    public abstract ProductA createProductA();

    public abstract ProductB createProductB();


}
