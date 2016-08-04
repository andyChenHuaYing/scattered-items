package org.alien.design.pattern.abstraction.factory.demo;

import org.alien.design.pattern.abstraction.factory.demo.factory.BlackPersonFactory;
import org.alien.design.pattern.abstraction.factory.demo.factory.PersonFactory;
import org.alien.design.pattern.abstraction.factory.demo.factory.WhitePersonFactory;
import org.alien.design.pattern.abstraction.factory.demo.factory.YellowPersonFactory;
import org.alien.design.pattern.abstraction.factory.demo.product.FemalePerson;
import org.alien.design.pattern.abstraction.factory.demo.product.MalePerson;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/3
 */
public class Client {
    public static void main(String[] args) {
        PersonFactory blackPersonFactory = new BlackPersonFactory();
        FemalePerson femalePerson = blackPersonFactory.createFemalePerson();
        MalePerson malePerson = blackPersonFactory.createMalePerson();
        femalePerson.getColor();
        femalePerson.getSex();
        malePerson.getColor();
        malePerson.getSex();

        PersonFactory whitePersonFactory = new WhitePersonFactory();
        FemalePerson femalePerson1 = whitePersonFactory.createFemalePerson();
        MalePerson malePerson1 = whitePersonFactory.createMalePerson();
        femalePerson1.getColor();
        femalePerson1.getSex();
        malePerson1.getColor();
        malePerson1.getSex();

        PersonFactory yellowPersonFactory = new YellowPersonFactory();
        FemalePerson femalePerson2 = yellowPersonFactory.createFemalePerson();
        MalePerson malePerson2 = yellowPersonFactory.createMalePerson();
        femalePerson2.getColor();
        femalePerson2.getSex();
        malePerson2.getColor();
        malePerson2.getSex();
    }
}
