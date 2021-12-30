package org.nanshan.design.pattern.abstraction.factory.demo.factory;

import org.nanshan.design.pattern.abstraction.factory.demo.product.FemalePerson;
import org.nanshan.design.pattern.abstraction.factory.demo.product.MalePerson;
import org.nanshan.design.pattern.abstraction.factory.demo.product.YellowFemalePerson;
import org.nanshan.design.pattern.abstraction.factory.demo.product.YellowMalePerson;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/3
 */
public class YellowPersonFactory extends PersonFactory {
    @Override
    public FemalePerson createFemalePerson() {
        return new YellowFemalePerson();
    }

    @Override
    public MalePerson createMalePerson() {
        return new YellowMalePerson();
    }
}
