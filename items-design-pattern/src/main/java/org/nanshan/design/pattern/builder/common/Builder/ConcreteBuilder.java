package org.nanshan.design.pattern.builder.common.Builder;


import org.nanshan.design.pattern.builder.common.product.Product;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/5
 */
public class ConcreteBuilder extends Builder {

    private Product product = new Product();

    public void setPart() {
        System.out.println("ConcreteBuilder.setPart");
    }

    public Product buildProduct() {
        System.out.println("ConcreteBuilder.buildProduct");
        return product;
    }
}
