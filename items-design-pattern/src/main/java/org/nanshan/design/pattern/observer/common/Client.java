package org.nanshan.design.pattern.observer.common;

import org.nanshan.design.pattern.observer.common.observer.impl.ObserverImplA;
import org.nanshan.design.pattern.observer.common.observer.impl.ObserverImplB;
import org.nanshan.design.pattern.observer.common.subject.ConcreteSubject;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/18
 */
public class Client {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        ObserverImplA observerImplA = new ObserverImplA();
        ObserverImplB observerImplB = new ObserverImplB();

        subject.addObserver(observerImplA);
        subject.addObserver(observerImplB);

        subject.doSomething();

    }
}
