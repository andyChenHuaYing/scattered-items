package org.springframework.samples.aop.issues;

import org.springframework.stereotype.Service;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-21 19:26
 */
@Service
public class BizServiceImpl implements BizService{

    public BizServiceImpl() { }

    public String proxiedMethod() throws Exception {
        System.out.println(this.getClass().getName() + " : proxied method.");
        this.thisMethod();
//        ((BizService) AopContext.currentProxy()).withoutThisMethod();
        return "proxiedMethod";
    }

    public String thisMethod() {
        System.out.println(this.getClass().getName() + " : with this keyword method.");

        return "thisMethod";
    }

    public String withoutThisMethod() {
        System.out.println(this.getClass().getName() + " : without this keyword method.");
        return "withoutThisMethod";
    }
}
