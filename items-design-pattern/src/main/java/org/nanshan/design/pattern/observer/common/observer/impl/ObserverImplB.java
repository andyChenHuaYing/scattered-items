package org.nanshan.design.pattern.observer.common.observer.impl;

import org.nanshan.design.pattern.observer.common.observer.Observer;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/18
 */
public class ObserverImplB implements Observer {
    @Override
    public void update() {
        System.out.println("ObserverImplB.update");
    }
}
