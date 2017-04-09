package org.springframework.samples.annotations.jsr330annotation;

import org.springframework.samples.utils.ShowReferencesUtil;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-21 19:56
 */
@Component
public class BeanPortal {

    @Inject
    private TestBeanOne testBeanOne;

    private TestBeanTwo testBeanTwo;

    private TestBeanThree testBeanThree;

    private BeanInterface testBeanFour;

    @Inject
    public void setTestBeanFour(@Named("beanFour") BeanInterface testBeanFour) {
        this.testBeanFour = testBeanFour;
    }

    @Inject
    public void setTestBeanTwo(TestBeanTwo testBeanTwo) {
        this.testBeanTwo = testBeanTwo;
    }

    @Inject
    public void setTestBeanThree(TestBeanThree testBeanThree) {
        this.testBeanThree = testBeanThree;
    }

    public void showReference() {
        ShowReferencesUtil.showReferences(testBeanOne, testBeanTwo, testBeanThree, testBeanFour);
    }
}
