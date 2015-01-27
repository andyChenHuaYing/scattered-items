package org.springframework.samples.ioc.schema.lifecycle.callback;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-27 20:48
 */
public class InitAndDestroyViaSpringBean implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println(this.getClass().getSimpleName() + " destroy!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(this.getClass().getSimpleName() + " afterPropertiesSet!");
    }
}
