package org.springframework.samples.ioc;

import org.springframework.samples.utils.OrderUtils;

import java.util.Map;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-17 21:24
 */
public class Command {
    private Map<String, Boolean> state;

    public Object execute(){
        return new Object();
    }

    public void setState(Map<String, Boolean> state) {
        this.state = state;
    }

    public Command() {
        System.out.println("Order : " + OrderUtils.order + ", " + this.getClass().getName() + " is instantiated...");
    }
}
