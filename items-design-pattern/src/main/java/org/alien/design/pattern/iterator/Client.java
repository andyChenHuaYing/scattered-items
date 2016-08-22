package org.alien.design.pattern.iterator;

import org.alien.design.pattern.iterator.aggregate.Aggregate;
import org.alien.design.pattern.iterator.aggregate.ConcreteAggregate;
import org.alien.design.pattern.iterator.iterator.Iterator;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/22
 */
public class Client {

    public static void main(String[] args) {
        Aggregate<Integer> integerAggregate = new ConcreteAggregate<>();

        for (int i = 0; i < 10; i++) {
            integerAggregate.addItem(i);
        }

        Iterator<Integer> integerIterator = integerAggregate.createIterator();
        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }
    }
}
