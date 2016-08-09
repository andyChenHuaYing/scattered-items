package org.alien.design.pattern.builder.common;

import org.alien.design.pattern.builder.common.director.Director;
import org.alien.design.pattern.builder.common.product.Product;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/5
 */
public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        Product product = director.getProduct();
        System.out.println(product);
    }
}
