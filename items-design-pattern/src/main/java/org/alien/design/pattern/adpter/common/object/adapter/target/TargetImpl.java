package org.alien.design.pattern.adpter.common.object.adapter.target;

/**
 * Description:
 *
 * @author Oscar
 * @version SNAPSHOT-0.1
 * @since 2019/1/5
 */
public class TargetImpl implements Target {

    @Override
    public void requestA() {
        System.out.println("TargetImpl.requestA");
    }

    @Override
    public void requestB() {
        System.out.println("TargetImpl.requestB");
    }
}
