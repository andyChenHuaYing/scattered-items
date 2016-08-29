package org.alien.design.pattern.singleton.demo;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/1
 */
@SuppressWarnings("unused")
public class InitNowThreadSafe {

    private static final InitNowThreadSafe INIT_NOW_THREAD_SAFE = new InitNowThreadSafe();

    public InitNowThreadSafe getInstance(){
        return INIT_NOW_THREAD_SAFE;
    }

}
