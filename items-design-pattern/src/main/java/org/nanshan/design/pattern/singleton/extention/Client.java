package org.nanshan.design.pattern.singleton.extention;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/1
 */
public class Client {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(FixedNumInstance.getInstance());
        }
    }
}
