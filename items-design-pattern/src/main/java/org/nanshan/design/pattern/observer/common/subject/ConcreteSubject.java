package org.nanshan.design.pattern.observer.common.subject;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/18
 */
public class ConcreteSubject extends Subject {

    public void doSomething() {
        /*
         * do something
         */
        super.notifyAllObserver();
    }

}
