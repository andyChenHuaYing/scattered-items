package org.springframework.samples.ioc;

import org.springframework.samples.utils.ToString;

import java.util.Map;
import java.util.Set;

/**
 * Happy day, happy life.
 *
 * @author andy
 * @version 1.0-SNAPSHOT
 *          Created date: 2014-11-15 11:23
 */
public class Foo {
    private Bar bar;
    private Baz baz;
    private Map<String, Float> accounts;

    public Foo() {
    }

    public Foo(Bar bar, Baz baz) {
        this.bar = bar;
        this.baz = baz;
    }

    public Foo(Map<String, Float> accounts) {
        this.accounts = accounts;
    }

    public void iterateMap() {
        Set<String> keys = accounts.keySet();
        for (String key : keys) {
            System.out.println("Key : " + key + ", value: " + accounts.get(key));
        }
    }

    public void setAccounts(Map<String, Float> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        System.out.println(ToString.toString(this.getClass(), bar.getClass(), baz.getClass()));
        return ToString.toString(this.getClass(), bar.getClass(), baz.getClass());
    }
}
