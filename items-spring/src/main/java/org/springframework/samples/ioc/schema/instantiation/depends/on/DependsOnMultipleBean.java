package org.springframework.samples.ioc.schema.instantiation.depends.on;

/**
 * Happy daily, happy life.
 * <p/>
 * Description:
 * <p/>
 * Created by andychen on 2015/1/26.
 * Version 1.0-SNAPSHOT
 */
public class DependsOnMultipleBean {
    public void init() {
        System.out.println(this.getClass().getName() + " init...");
    }

    public void destroy() {
        System.out.println(this.getClass().getName() + " destroy...");
    }
}
