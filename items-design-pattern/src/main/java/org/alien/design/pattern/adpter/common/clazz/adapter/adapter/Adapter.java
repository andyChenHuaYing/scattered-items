package org.alien.design.pattern.adpter.common.clazz.adapter.adapter;

import org.alien.design.pattern.adpter.common.clazz.adapter.adaptee.Adaptee;
import org.alien.design.pattern.adpter.common.clazz.adapter.target.Target;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/22
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        System.out.println("Adapter.requestA");
        super.doSomethingCommon();
    }
}
