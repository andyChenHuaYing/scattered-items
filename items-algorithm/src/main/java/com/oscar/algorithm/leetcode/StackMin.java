package com.oscar.algorithm.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Description
 *
 * @author huaying
 * @version 0.0.1
 * @since 2020/6/26
 */
public class StackMin {
    private Deque<Integer> dataStack = new ArrayDeque<>();
    private Deque<Integer> minStack = new ArrayDeque<>();

    public void push(int e) {
        dataStack.push(e);

        Integer topElement = minStack.peek();
        int min = minStack.peek() == null || e < topElement ? e : topElement;
        minStack.push(min);
    }

    public int pop() {
        minStack.pop();
        return dataStack.pop();
    }

    public Integer getMin() {
        return minStack.peek();
    }

}
