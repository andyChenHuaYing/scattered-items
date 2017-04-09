package org.springframework.samples.ioc;

import org.springframework.samples.utils.OrderUtils;
import org.springframework.samples.utils.ToString;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-17 20:03
 */
public class DependsOnSomeBean {
    private BeDependsOnBean beDependsOnBean;

    public DependsOnSomeBean() {
        System.out.println("order : " + OrderUtils.order++ + " : " + this.getClass().getName() + " is instantiated");
    }

    public void setBeDependsOnBean(BeDependsOnBean beDependsOnBean) {
        this.beDependsOnBean = beDependsOnBean;
    }

    @Override
    public String toString() {
        return ToString.toString(this.getClass());
    }
}
