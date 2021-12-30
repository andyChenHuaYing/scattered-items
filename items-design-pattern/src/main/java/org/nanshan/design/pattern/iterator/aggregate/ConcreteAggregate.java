package org.nanshan.design.pattern.iterator.aggregate;

import org.nanshan.design.pattern.iterator.iterator.ConcreteIterator;
import org.nanshan.design.pattern.iterator.iterator.Iterator;

import java.util.Vector;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/22
 */
public class ConcreteAggregate<T> extends Aggregate<T> {

    private Vector<T> vector = new Vector<>();

    @Override
    public void addItem(T t) {
        this.vector.add(t);
    }

    @Override
    public void removeItem(T t) {
        this.vector.remove(t);
    }

    @Override
    public void getItem(int index) {
        this.vector.get(index);
    }

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(vector);
    }
}
