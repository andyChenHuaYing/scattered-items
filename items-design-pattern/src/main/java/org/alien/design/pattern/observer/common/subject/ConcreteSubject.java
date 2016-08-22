package org.alien.design.pattern.observer.common.subject;

import org.alien.design.pattern.observer.common.observer.Observer;

import java.util.Vector;

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
