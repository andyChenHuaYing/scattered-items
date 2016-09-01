package org.andy.items.thkinjava.generics.generic2016;

/**
 * Author: oscar
 * Create Data: 01/03/16
 */
public class LinkedStack<T> {


    private class Node<U> {
        protected U item;
        protected Node<U> next;

        public Node() {
            item = null;
            next = null;
        }

        public Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return item == null && next == null;
        }
    }


    private Node<T> top = new Node<>();

    public T pop() {
        T result = top.item;
        if (!top.end()) {
            top = top.next;
        }

        return result;
    }

    public void push(T t) {
        top = new Node<>(t, top);
    }

    public static void main(String[] args) {
        LinkedStack<String> linkedStack = new LinkedStack<>();
        String str = "a b c d";
        for (String s : str.split(" ")) {
            linkedStack.push(s);
        }
        System.out.println(linkedStack);

        String element;
        while ((element = linkedStack.pop()) != null) {
            System.out.println(element);
        }
    }


}
