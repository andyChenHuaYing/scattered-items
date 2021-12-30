package org.nanshan.design.pattern.adpter.common.object.adapter.target;

/**
 * Description:
 *      Adapter target interface
 * @author Oscar
 * @version SNAPSHOT-0.1
 * @since 2019/1/5
 */
public interface Target {

    /**
     * process requestB.
     */
    void requestA();

    /**
     * process requestB.
     */
    void requestB();
}
