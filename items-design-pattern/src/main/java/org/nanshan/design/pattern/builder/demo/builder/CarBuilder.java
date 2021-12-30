package org.nanshan.design.pattern.builder.demo.builder;

import org.nanshan.design.pattern.builder.demo.product.CarModel;

import java.util.ArrayList;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/9
 */
public abstract class CarBuilder {

    public abstract CarModel getCarModel();

    public abstract void setSequence(ArrayList<String> sequence);
}
