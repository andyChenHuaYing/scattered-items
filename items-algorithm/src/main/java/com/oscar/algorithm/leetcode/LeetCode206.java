package com.oscar.algorithm.leetcode;

/**
 * Description
 *
 * @author huaying
 * @version 0.0.1
 * @since 2020/4/4
 */
public class LeetCode206 {
/*
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }*/

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode tempN = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tempN;
        }

        return prev;
    }

    public static void main(String[] args) {
        LeetCode206 lc = new LeetCode206();


        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        ListNode listNode = lc.reverseList(one);
        listNode.print();
    }
}
