package org.alien.design.pattern.flyweight.demo.model;

/**
 * Author: oscar
 * Create Data: 29/08/16
 */
public class SignInfo4Pool extends SignInfo {

    private String key;

    public SignInfo4Pool(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
