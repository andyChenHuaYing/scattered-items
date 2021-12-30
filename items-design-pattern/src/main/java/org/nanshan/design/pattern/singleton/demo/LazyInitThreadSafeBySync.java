package org.nanshan.design.pattern.singleton.demo;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/1
 */
@SuppressWarnings("unused")
public class LazyInitThreadSafeBySync {

    private static LazyInitThreadSafeBySync lazyInitThreadSafeBySync;

    private LazyInitThreadSafeBySync() {
    }

    public synchronized LazyInitThreadSafeBySync getInstance() {
        if (lazyInitThreadSafeBySync == null) {
            lazyInitThreadSafeBySync = new LazyInitThreadSafeBySync();
        }
        return lazyInitThreadSafeBySync;
    }
}
