package org.nanshan.design.pattern.adpter.common.clazz.adapter.target;

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
