package com.oscar.algorithm.leetcode;

/**
 * Description
 *
 * @author huaying
 * @version 0.0.1
 * @since 2020/6/26
 */
public class RingArray {

    private int[] arr;
    private int iPopIndex;
    private int iPushIndex;
    private int size;
    private final int limit;

    public RingArray(int limit) {
        arr = new int[limit];
        iPopIndex = 0;
        iPushIndex = 0;
        size = 0;
        this.limit = limit;
    }

    public int pop() {
        if (size == 0) {
            throw new IllegalStateException("empty");
        }

        size--;
        iPopIndex = nextIndex(iPopIndex);

        return arr[iPopIndex - 1];
    }

    private int nextIndex(int i) {
        return i < limit ? ++i : 0;
    }

    public void push(int elem) {
        if (size == limit) {
            throw new IllegalStateException("full");
        }

        size++;
        arr[iPushIndex] = elem;
        iPushIndex = nextIndex(iPushIndex);
    }

    public boolean isFull() {
        return size == limit;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        RingArray ringArray = new RingArray(1);

        ringArray.push(1);
        try {
            ringArray.push(2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(ringArray.pop());
        try {
            System.out.println(ringArray.pop());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
