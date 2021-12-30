package org.nanshan.design.pattern.chain.of.reponsibility.common;

import org.nanshan.design.pattern.chain.of.reponsibility.common.buz.Request;
import org.nanshan.design.pattern.chain.of.reponsibility.common.buz.Response;
import org.nanshan.design.pattern.chain.of.reponsibility.common.handler.ConcreteHandler1;
import org.nanshan.design.pattern.chain.of.reponsibility.common.handler.ConcreteHandler2;
import org.nanshan.design.pattern.chain.of.reponsibility.common.handler.ConcreteHandler3;
import org.nanshan.design.pattern.chain.of.reponsibility.common.handler.Handler;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/9/4
 */
public class Client {

    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        Response response = handler1.handleMessage(new Request());
        System.out.println(response);

    }
}
