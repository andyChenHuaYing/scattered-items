package org.alien.design.pattern.singleton.extention;

import org.alien.design.pattern.support.Constants;

import java.util.Random;
import java.util.Vector;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/1
 */
public class FixedNumInstance {

    public static final Vector<FixedNumInstance> FIXED_NUM_INSTANCES = new Vector<>();

    private static final int INSTANCE_NUM = Constants.FIXED_INSTANCE_NUMBER;

    static {
        for (int i = 0; i < INSTANCE_NUM; i++) {
            FIXED_NUM_INSTANCES.add(new FixedNumInstance("Instance number : " + (i + 1)));
        }
    }

    private String name;

    @SuppressWarnings("unused")
    private FixedNumInstance() {
    }

    private FixedNumInstance(String name) {
        this.name = name;
    }

    public static FixedNumInstance getInstance() {
        return FIXED_NUM_INSTANCES.get(new Random().nextInt(3));
    }

    @Override
    public String toString() {
        return "FixedNumInstance{" +
                "name='" + name + '\'' +
                '}';
    }
}
