package org.springframework.samples.ioc.schema.container.extension;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.samples.utils.ExecutionOrderUtil;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2015-01-28 19:51
 */
public class BeanPostProcessorViaXml implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        ExecutionOrderUtil.put(beanName + " post process before initialization.");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        ExecutionOrderUtil.put(beanName + " post process after initialization.");
        return bean;
    }
}
