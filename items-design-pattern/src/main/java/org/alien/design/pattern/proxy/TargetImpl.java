package org.alien.design.pattern.proxy;

/**
 * Description
 *
 * @author huaying
 * @version 0.0.1
 * @since 2020/10/9
 */
public class TargetImpl implements Target {
    @Override
    public void targetMethod() {
        System.out.println("org.alien.design.pattern.proxy.TargetImpl.targetMethod");
    }
}
