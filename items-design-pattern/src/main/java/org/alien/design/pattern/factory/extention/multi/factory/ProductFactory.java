package org.alien.design.pattern.factory.extention.multi.factory;

import org.alien.design.pattern.factory.common.product.Product;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/2
 */
public abstract class ProductFactory<T extends Product> {

    public abstract T createProduct();
}
