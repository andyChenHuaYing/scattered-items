package org.andy.items.thkinjava.generics;

/**
 * Created by andy on 5/24/2015.<br>
 * Version 1.0-SNAPSHOT<br>
 */
@SuppressWarnings("unused")
public class TwoTuple<A, B> {
    public final A first;
    public final B second;

    public TwoTuple(A first, B second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Tuple{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
