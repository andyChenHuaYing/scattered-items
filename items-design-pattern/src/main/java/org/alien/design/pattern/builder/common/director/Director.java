package org.alien.design.pattern.builder.common.director;

import org.alien.design.pattern.builder.common.Builder.ConcreteBuilder;
import org.alien.design.pattern.builder.common.product.Product;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/5
 */
public class Director {

    private ConcreteBuilder concreteBuilder = new ConcreteBuilder();

    public Product getProduct(){
        concreteBuilder.setPart();
        System.out.println("Director.getProduct");
        return concreteBuilder.buildProduct();
    }
}
