package com.oscar.algorithm.leetcode;

/**
 * Description
 *
 * @author huaying
 * @version 0.0.1
 * @since 2020/4/4
 */
public class ListNode {
    ListNode next;
    int val;

    public ListNode(int val) {
        this.val = val;
    }

    public void print() {
        String result = val + "";
        while (next != null) {
            result = result + "->" + next.val;
            next = next.next;
        }

        result = result + "->" + "null";
        System.out.println(result);
    }
}
