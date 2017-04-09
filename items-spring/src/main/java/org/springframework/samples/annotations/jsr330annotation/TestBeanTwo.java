package org.springframework.samples.annotations.jsr330annotation;

import javax.inject.Named;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-21 20:01
 */
//@Component("beanTwo")
@Named("bean2")
public class TestBeanTwo implements BeanInterface {
}
