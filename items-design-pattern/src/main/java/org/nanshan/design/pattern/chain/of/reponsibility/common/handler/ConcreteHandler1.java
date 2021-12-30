package org.nanshan.design.pattern.chain.of.reponsibility.common.handler;

import org.nanshan.design.pattern.chain.of.reponsibility.common.buz.Level;
import org.nanshan.design.pattern.chain.of.reponsibility.common.buz.Request;
import org.nanshan.design.pattern.chain.of.reponsibility.common.buz.Response;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/9/4
 */
public class ConcreteHandler1 extends Handler {
    @Override
    protected Response echo(Request request) {
        System.out.println("ConcreteHandler1.echo");
        return null;
    }

    @Override
    protected Level getHandlerLevel() {
        return null;
    }
}
