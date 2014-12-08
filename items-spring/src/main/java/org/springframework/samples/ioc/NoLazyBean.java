package org.springframework.samples.ioc;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-17 20:21
 */
public class NoLazyBean {
    private LazyInitBean lazyInitBean;


    public void setLazyInitBean(LazyInitBean lazyInitBean) {
        this.lazyInitBean = lazyInitBean;
    }

    public NoLazyBean() {
        System.out.println(this.getClass().getName() + " is instantiated...");
    }
}