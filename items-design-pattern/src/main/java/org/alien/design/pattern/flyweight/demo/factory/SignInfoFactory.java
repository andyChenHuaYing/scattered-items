package org.alien.design.pattern.flyweight.demo.factory;

import org.alien.design.pattern.flyweight.demo.model.SignInfo;
import org.alien.design.pattern.flyweight.demo.model.SignInfo4Pool;

import java.util.HashMap;

/**
 * Author: oscar
 * Create Data: 29/08/16
 */
public class SignInfoFactory {

    private static HashMap<String, SignInfo> infoHashMap = new HashMap<>();


    public static SignInfo getSignInfo(String key) {

        SignInfo signInfo = null;
        if (infoHashMap.containsKey(key)) {
            signInfo = infoHashMap.get(key);
        } else {
            String subject = key.substring(key.indexOf("_") + 1, key.indexOf(";"));
            String location = key.substring(key.lastIndexOf("_") + 1, key.length());
            SignInfo signInfo4Pool = new SignInfo4Pool(key);
            signInfo4Pool.setSubject(subject);
            signInfo4Pool.setLocation(location);
            infoHashMap.put(key, signInfo4Pool);
            System.out.println("Put key: " + key);

        }
        return signInfo;

    }
}
