package org.nanshan.design.pattern.builder.demo.builder;

import org.nanshan.design.pattern.builder.demo.product.BMWCarModel;
import org.nanshan.design.pattern.builder.demo.product.CarModel;

import java.util.ArrayList;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/9
 */
public class BMWCarBuilder extends CarBuilder {
    private ArrayList<String> sequence = new ArrayList<>();


    @Override
    public CarModel getCarModel() {
        BMWCarModel bmwCarModel = new BMWCarModel();
        bmwCarModel.setSequence(this.sequence);
        return bmwCarModel;
    }

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
