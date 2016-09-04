package org.alien.design.pattern.chain.of.reponsibility.common.handler;

import org.alien.design.pattern.chain.of.reponsibility.common.buz.Level;
import org.alien.design.pattern.chain.of.reponsibility.common.buz.Request;
import org.alien.design.pattern.chain.of.reponsibility.common.buz.Response;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/9/4
 */
public abstract class Handler {

    private Handler nextHandler;

    public final Response handleMessage(Request request) {
        Response response = null;
        if ( this.getHandlerLevel() != null && this.getHandlerLevel().equals(request.getRequestLevel())) {
            response = this.echo(request);
        } else {
            if (nextHandler != null) {
                response = this.nextHandler.handleMessage(request);
            } else {
                System.out.println("do other things...");
            }
        }
        return response;

    }


    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected abstract Response echo(Request request);

    protected abstract Level getHandlerLevel();
}
