package org.nanshan.design.pattern.facade.demo.facade;

import org.nanshan.design.pattern.facade.demo.function.Police;
import org.nanshan.design.pattern.facade.demo.subsystem.ILetterProcess;
import org.nanshan.design.pattern.facade.demo.subsystem.LetterProcessImpl;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/9
 */
public class PostOffice {
    private ILetterProcess letterProcess = new LetterProcessImpl();
    private Police police = new Police();

    public void sendLetter(String address, String content) {
        this.letterProcess.setAddress(address);
        this.letterProcess.setContent(content);
        police.checkLetterPolice(letterProcess);
        this.letterProcess.sendLetter();
    }
}
