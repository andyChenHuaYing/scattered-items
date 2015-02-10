package org.springframework.samples.ioc.annotation.java.based.configuration;

/**
 * Happy daily, happy life.
 * =========================
 * Description:
 * Created by andychen on 2015/2/6.
 * Version 1.0-SNAPSHOT
 */
public abstract class SingletonBeanAbstract {
    private PrototypeBeanAbstract prototypeBeanAbstract;

    public abstract PrototypeBeanAbstract createPrototypeBeanAbstract();

    public void initPrototypeBean() {
        prototypeBeanAbstract = createPrototypeBeanAbstract();
    }

    @Override
    public String toString() {
        initPrototypeBean();
        return "SingletonBeanAbstract{" +
                "prototypeBeanAbstract=" + prototypeBeanAbstract +
                '}';
    }
}
