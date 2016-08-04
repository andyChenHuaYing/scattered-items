package org.alien.design.pattern.abstraction.factory.demo.factory;

import org.alien.design.pattern.abstraction.factory.demo.product.BlackFemalePerson;
import org.alien.design.pattern.abstraction.factory.demo.product.BlackMalePerson;
import org.alien.design.pattern.abstraction.factory.demo.product.FemalePerson;
import org.alien.design.pattern.abstraction.factory.demo.product.MalePerson;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/3
 */
public class BlackPersonFactory extends PersonFactory {
    @Override
    public FemalePerson createFemalePerson() {
        return new BlackFemalePerson();
    }

    @Override
    public MalePerson createMalePerson() {
        return new BlackMalePerson();
    }
}
