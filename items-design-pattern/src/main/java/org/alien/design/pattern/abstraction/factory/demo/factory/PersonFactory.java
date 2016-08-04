package org.alien.design.pattern.abstraction.factory.demo.factory;

import org.alien.design.pattern.abstraction.factory.demo.product.FemalePerson;
import org.alien.design.pattern.abstraction.factory.demo.product.MalePerson;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/3
 */
public abstract class PersonFactory {
    public abstract FemalePerson createFemalePerson();
    public abstract MalePerson createMalePerson();
}
