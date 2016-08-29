package org.alien.design.pattern.facade.demo;

import org.alien.design.pattern.facade.demo.facade.PostOffice;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/9
 */
public class Client {

    public static void main(String[] args) {
        PostOffice postOffice = new PostOffice();
        postOffice.sendLetter("Address", "Content");
    }
}
