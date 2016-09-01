package org.alien.design.pattern.flyweight.demo;

import org.alien.design.pattern.flyweight.demo.factory.SignInfoFactory;
import org.alien.design.pattern.flyweight.demo.model.SignInfo;

/**
 * Author: oscar
 * Create Data: 29/08/16
 */
public class Client {

    public static void main(String[] args) {

        String key;

        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 40; j++) {
                key = "Subject_" + i + ";Location_" + j;
                SignInfoFactory.getSignInfo(key);
            }
        }

        SignInfo signInfo = SignInfoFactory.getSignInfo("Subject_1;Location_10");
        System.out.println(signInfo);

    }
}
