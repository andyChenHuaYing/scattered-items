package org.nanshan.design.pattern.singleton.demo;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/1
 */
@SuppressWarnings("unused")
public class LazyInitThreadSafeByInnerClass {

    private LazyInitThreadSafeByInnerClass() {
    }

    public static LazyInitThreadSafeByInnerClass getInstance() {
        return LazyInitThreadSafeByInnerClassBuilder.LAZY_INIT;
    }

    private static class LazyInitThreadSafeByInnerClassBuilder {
        private static final LazyInitThreadSafeByInnerClass LAZY_INIT = new LazyInitThreadSafeByInnerClass();
    }

}
