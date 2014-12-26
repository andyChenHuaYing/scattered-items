package org.alien.design.pattern.proxy.issue;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-12-21 17:59
 */
public class ProxiedClass implements BizInterface{
    public void proxiedMethod() {
        System.out.println(this.getClass().getName() + " : proxied method.");
        this.thisMethod();
        withoutThisMethod();
    }

    public void thisMethod() {
        System.out.println(this.getClass().getName() + " : with this keyword method.");

    }

    public void withoutThisMethod() {
        System.out.println(this.getClass().getName() + " : without this keyword method.");
    }
}
