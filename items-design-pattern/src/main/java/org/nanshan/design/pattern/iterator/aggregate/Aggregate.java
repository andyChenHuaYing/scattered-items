package org.nanshan.design.pattern.iterator.aggregate;

import org.nanshan.design.pattern.iterator.iterator.Iterator;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/22
 */
public abstract class Aggregate<T> {


    public abstract void addItem(T t);

    public abstract void removeItem(T t);

    public abstract void getItem(int index);

    public abstract Iterator<T> createIterator();
}
