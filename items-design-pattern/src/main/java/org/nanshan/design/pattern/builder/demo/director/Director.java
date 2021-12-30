package org.nanshan.design.pattern.builder.demo.director;

import org.nanshan.design.pattern.builder.demo.builder.BMWCarBuilder;
import org.nanshan.design.pattern.builder.demo.builder.BenZCarBuilder;
import org.nanshan.design.pattern.builder.demo.product.BMWCarModel;
import org.nanshan.design.pattern.builder.demo.product.BenZCarModel;

import java.util.ArrayList;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/9
 */
public class Director {
    BMWCarBuilder bmwCarBuilder = new BMWCarBuilder();
    BenZCarBuilder benZCarBuilder = new BenZCarBuilder();
    private ArrayList<String> sequence = new ArrayList<>();

    public BenZCarModel getBenZCarModel() {
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("engineBoom");
        this.sequence.add("start");
        this.sequence.add("stop");
        benZCarBuilder.setSequence(this.sequence);
        return (BenZCarModel) benZCarBuilder.getCarModel();
    }

    public BMWCarModel getBMWCarModel() {
        this.sequence.clear();
        this.sequence.add("engineBoom");
        this.sequence.add("start");
        this.sequence.add("alarm");
        this.sequence.add("stop");
        bmwCarBuilder.setSequence(sequence);
        return (BMWCarModel) bmwCarBuilder.getCarModel();
    }
}
