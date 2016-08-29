package org.alien.design.pattern.facade.demo.subsystem;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/9
 */
public class LetterProcessImpl implements ILetterProcess {
    @Override
    public void setAddress(String address) {
        System.out.println("LetterProcessImpl.setAddress");
    }

    @Override
    public void setContent(String content) {
        System.out.println("LetterProcessImpl.setContent");
    }

    @Override
    public void putIntoEnvelope() {
        System.out.println("LetterProcessImpl.putIntoEnvelope");
    }

    @Override
    public void sendLetter() {
        System.out.println("LetterProcessImpl.sendLetter");
    }
}
