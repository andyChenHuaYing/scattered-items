package org.alien.design.pattern.adpter.common.object.adapter.adaptee;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/22
 */
public class AdapteeA {

    public void doSomethingCommon() {
        System.out.println(this.getClass().getSimpleName() + " do something common...");
    }
}
