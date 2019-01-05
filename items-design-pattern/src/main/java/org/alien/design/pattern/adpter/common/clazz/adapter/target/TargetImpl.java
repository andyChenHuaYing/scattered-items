package org.alien.design.pattern.adpter.common.clazz.adapter.target;

import org.alien.design.pattern.adpter.common.clazz.adapter.target.Target;

/**
 * Description:
 *
 * @author Oscar
 * @version SNAPSHOT-0.1
 * @since 2019/1/5
 */
public class TargetImpl implements Target {
    @Override
    public void request() {
        System.out.println("TargetImpl.request");
    }
}
