package org.nanshan.design.pattern.builder.demo.builder;

import org.nanshan.design.pattern.builder.demo.product.BenZCarModel;
import org.nanshan.design.pattern.builder.demo.product.CarModel;

import java.util.ArrayList;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/9
 */
public class BenZCarBuilder extends CarBuilder {

    private ArrayList<String> sequence = new ArrayList<>();


    @Override
    public CarModel getCarModel() {
        BenZCarModel benZCarModel = new BenZCarModel();
        benZCarModel.setSequence(sequence);
        return benZCarModel;
    }

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
