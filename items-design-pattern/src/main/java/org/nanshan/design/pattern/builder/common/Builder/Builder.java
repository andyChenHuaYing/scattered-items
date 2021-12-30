package org.nanshan.design.pattern.builder.common.Builder;

import org.nanshan.design.pattern.builder.common.product.Product;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/5
 */
public abstract class Builder {

    public abstract void setPart();

    public abstract Product buildProduct();

}
