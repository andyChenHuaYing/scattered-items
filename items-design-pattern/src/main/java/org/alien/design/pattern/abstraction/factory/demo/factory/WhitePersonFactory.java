package org.alien.design.pattern.abstraction.factory.demo.factory;

import org.alien.design.pattern.abstraction.factory.demo.product.FemalePerson;
import org.alien.design.pattern.abstraction.factory.demo.product.MalePerson;
import org.alien.design.pattern.abstraction.factory.demo.product.WhiteFemalePerson;
import org.alien.design.pattern.abstraction.factory.demo.product.WhiteMalePerson;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/3
 */
public class WhitePersonFactory extends PersonFactory {
    @Override
    public FemalePerson createFemalePerson() {
        return new WhiteFemalePerson();
    }

    @Override
    public MalePerson createMalePerson() {
        return new WhiteMalePerson();
    }
}
