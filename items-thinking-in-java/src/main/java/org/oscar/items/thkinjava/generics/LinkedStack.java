package org.oscar.items.thkinjava.generics;

/**
 * Created by andy on 5/24/2015.<br>
 * Version 1.0-SNAPSHOT<br>
 */
public class LinkedStack<T> {

    private Node<T> top = new Node<>();

    public static void main(String[] args) {
        LinkedStack<String> lss = new LinkedStack<>();
        for (String s : "Phasers or stun!".split(" ")) {
            lss.push(s);
        }
        String s;
        while ((s = lss.pop()) != null) {
            System.out.println(s);
        }
    }

    public void push(T item) {
        top = new Node<>(item, top);
    }

    public T pop() {
        T result = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return result;
    }

    private static class Node<U> {
        U item;
        Node<U> next;

        Node() {
            item = null;
            next = null;
        }

        Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return item == null && next == null;
        }
    }
}
