package org.springframework.samples.aop.programmatic;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

/**
 * Happy daily, happy life.<br>
 * =========================<br>
 * Description:<br>
 * Create target class aspectJ proxy.
 * Target class must have a interface.
 * Aspect also is necessary!
 * Created by andychen on 2015/2/11.<br>
 * Version 1.0-SNAPSHOT<br>
 */
public class ProgrammaticProxyBean {

    public ITargetObject createProxy(ITargetObject object) {
        AspectJProxyFactory factory = new AspectJProxyFactory(object);
        factory.addAspect(AspectJClass.class);
        return factory.getProxy();
    }
}
