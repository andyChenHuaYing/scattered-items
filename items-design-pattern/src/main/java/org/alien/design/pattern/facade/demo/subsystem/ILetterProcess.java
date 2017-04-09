package org.alien.design.pattern.facade.demo.subsystem;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/9
 */
public interface ILetterProcess {
    void setAddress(String address);

    void setContent(String content);

    void putIntoEnvelope();

    void sendLetter();
}
