package org.alien.design.pattern.adpter.common.clazz.adapter;

import org.alien.design.pattern.adpter.common.clazz.adapter.adapter.Adapter;
import org.alien.design.pattern.adpter.common.clazz.adapter.target.Target;
import org.alien.design.pattern.adpter.common.clazz.adapter.target.TargetImpl;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/22
 */
public class Client {

    public static void main(String[] args) {
        Target target = new TargetImpl();
        target.request();

        Target adapter = new Adapter();
        adapter.request();
    }
}
