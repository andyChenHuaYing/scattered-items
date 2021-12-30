package org.nanshan.design.pattern.singleton.demo;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/1
 */
@SuppressWarnings("unused")
public class LazyInitThreadUnsafe {

    private static LazyInitThreadUnsafe lazyInitThreadUnsafe;

    private LazyInitThreadUnsafe() {
    }

    public LazyInitThreadUnsafe getInstance() {
        if (lazyInitThreadUnsafe == null) {
            lazyInitThreadUnsafe = new LazyInitThreadUnsafe();
        }
        return lazyInitThreadUnsafe;
    }

}
