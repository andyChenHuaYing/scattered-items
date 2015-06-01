package org.alien.design.pattern.builder.product;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract car product model.
 * <p/>
 * Created by andychen on 2015/6/1.<br>
 * Version 1.0-SNAPSHOT<br>
 */
public abstract class CarModel {

    private List<String> sequence = new ArrayList<>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    public final void run() {
        for (String actionName : sequence) {
            if ("start".equals(actionName)) {
                this.start();
            } else if ("stop".equals(actionName)) {
                this.stop();
            } else if ("alarm".equalsIgnoreCase(actionName)) {
                this.alarm();
            } else if ("engineBoom".equalsIgnoreCase(actionName)) {
                this.engineBoom();
            }
        }
    }

    public final void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }
}
