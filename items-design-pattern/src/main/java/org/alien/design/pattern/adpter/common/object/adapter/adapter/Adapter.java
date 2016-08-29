package org.alien.design.pattern.adpter.common.object.adapter.adapter;

import org.alien.design.pattern.adpter.common.clazz.adapter.adaptee.Adaptee;
import org.alien.design.pattern.adpter.common.object.adapter.adaptee.AdapteeA;
import org.alien.design.pattern.adpter.common.object.adapter.adaptee.AdapteeB;
import org.alien.design.pattern.adpter.common.object.adapter.target.Target;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/22
 */
public class Adapter implements Target {

    private AdapteeA adapteeA;
    private AdapteeB adapteeB;

    public Adapter(AdapteeA adapteeA, AdapteeB adapteeB) {
        this.adapteeA = adapteeA;
        this.adapteeB = adapteeB;
    }

    @Override
    public void requestA() {
        System.out.println("Adapter.requestA");
        adapteeA.doSomethingCommon();
    }

    @Override
    public void requestB() {
        System.out.println("Adapter.requestB");
        adapteeB.doSomethingCommon();
    }
}
