package org.nanshan.design.pattern.iterator.iterator;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/22
 */
public abstract class Iterator<T> {

    public abstract boolean hasNext();

    public abstract T next();

    public abstract T currentItem();

    public abstract boolean removeItem();
}



