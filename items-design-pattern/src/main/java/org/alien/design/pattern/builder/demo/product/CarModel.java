package org.alien.design.pattern.builder.demo.product;

import java.util.ArrayList;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/9
 */
public abstract class CarModel {
    private ArrayList<String> sequence = new ArrayList<>();

    public abstract void start();
    public abstract void stop();
    public abstract void engineBoom();
    public abstract void alarm();

    public void run(){
        for (String command : sequence) {
            if ("start".equals(command)) {
                this.start();
            }
            if ("stop".equals(command)) {
                this.stop();
            }
            if ("alarm".equals(command)) {
                this.alarm();
            }
            if ("engineBoom".equals(command)) {
                this.engineBoom();
            }
        }
    }

    public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
