package org.nanshan.design.pattern.iterator.iterator;

import java.util.Vector;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/22
 */
public class ConcreteIterator<T> extends Iterator<T> {

    private Vector<T> vector = new Vector<>();
    private int cursor = 0;

    public ConcreteIterator(Vector<T> vector) {
        this.vector = vector;
    }

    @Override
    public boolean hasNext() {
        return vector.size() > cursor;
    }

    @Override
    public T next() {
        if (hasNext()) {
            return vector.elementAt(cursor++);
        }
        return null;
    }

    @Override
    public T currentItem() {
        return vector.elementAt(cursor);
    }

    @Override
    public boolean removeItem() {
        vector.remove(cursor);
        return false;
    }
}
