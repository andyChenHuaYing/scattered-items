package org.alien.design.pattern.builder.client;

import org.alien.design.pattern.builder.product.BMWCarModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Client
 * Created by andychen on 2015/6/1.<br>
 * Version 1.0-SNAPSHOT<br>
 */
public class Client {

    public static void main(String[] args) {
        BMWCarModel bmwCarModel = new BMWCarModel();
        List<String> sequence = new ArrayList<>();
        Collections.addAll(sequence, "start", "stop", "alarm");
        bmwCarModel.setSequence(sequence);
        bmwCarModel.run();
    }
}
