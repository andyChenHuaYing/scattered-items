package org.alien.design.pattern.builder.demo;

import org.alien.design.pattern.builder.demo.director.Director;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/9
 */
public class Client {


    public static void main(String[] args) {
        Director director = new Director();
        director.getBenZCarModel().run();
        director.getBMWCarModel().run();
    }
}
