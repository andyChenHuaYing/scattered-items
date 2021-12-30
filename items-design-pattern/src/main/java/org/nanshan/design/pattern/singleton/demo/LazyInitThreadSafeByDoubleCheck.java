package org.nanshan.design.pattern.singleton.demo;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/1
 */
@SuppressWarnings("unused")
public class LazyInitThreadSafeByDoubleCheck {

    private static volatile LazyInitThreadSafeByDoubleCheck lazyInitThreadSafeByDoubleCheck;

    private LazyInitThreadSafeByDoubleCheck() {
    }

    public static LazyInitThreadSafeByDoubleCheck getInstance() {
        if (lazyInitThreadSafeByDoubleCheck == null) {
            synchronized (LazyInitThreadSafeByDoubleCheck.class) {
                if (lazyInitThreadSafeByDoubleCheck == null) {
                    lazyInitThreadSafeByDoubleCheck = new LazyInitThreadSafeByDoubleCheck();
                }
            }
        }
        return lazyInitThreadSafeByDoubleCheck;
    }
}
