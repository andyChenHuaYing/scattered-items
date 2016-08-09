package org.alien.design.pattern.factory.extention.repalce.singleton;

import org.alien.design.pattern.factory.common.product.Product;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/2
 */
public class SingletonFactory {
    private static final Map<String, Product> PRODUCT_MAP = new ConcurrentHashMap<>();

    public static Product getProduct(Class clazz) throws InstantiationException {
        if (!PRODUCT_MAP.containsKey(clazz.getName())) {
            synchronized (SingletonFactory.class) {
                try {
                    Product product = (Product) clazz.newInstance();
                    PRODUCT_MAP.put(clazz.getName(), product);
                } catch (IllegalAccessException e) {
                    System.out.println(clazz.getName() + " is not Product.");
                }
            }

        }
        return PRODUCT_MAP.get(clazz.getName());
    }
}
