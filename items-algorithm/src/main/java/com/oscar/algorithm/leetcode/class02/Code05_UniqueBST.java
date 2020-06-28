package com.oscar.algorithm.leetcode.class02;

import java.util.LinkedList;
import java.util.List;

public class Code05_UniqueBST {

	public static class Node {
		public int value;
		public Node left;
		public Node right;

		public Node(int data) {
			this.value = data;
		}
	}

	public static List<Node> generateTrees(int n) {
		return generate(1, n);
	}

	public static List<Node> generate(int start, int end) {
		List<Node> res = new LinkedList<Node>();
		if (start > end) {
			res.add(null);
		}
		Node head = null;
		for (int i = start; i < end + 1; i++) {
			head = new Node(i);
			List<Node> lSubs = generate(start, i - 1);
			List<Node> rSubs = generate(i + 1, end);
			for (Node l : lSubs) {
				for (Node r : rSubs) {
					head.left = l;
					head.right = r;
					res.add(cloneTree(head));
				}
			}
		}
		return res;
	}

	public static Node cloneTree(Node head) {
		if (head == null) {
			return null;
		}
		Node res = new Node(head.value);
		res.left = cloneTree(head.left);
		res.right = cloneTree(head.right);
		return res;
	}

	// for test -- print tree
	public static void printTree(Node head) {
		System.out.println("Binary Tree:");
		printInOrder(head, 0, "H", 17);
		System.out.println();
	}

	public static void printInOrder(Node head, int height, String to, int len) {
		if (head == null) {
			return;
		}
		printInOrder(head.right, height + 1, "v", len);
		String val = to + head.value + to;
		int lenM = val.length();
		int lenL = (len - lenM) / 2;
		int lenR = len - lenM - lenL;
		val = getSpace(lenL) + val + getSpace(lenR);
		System.out.println(getSpace(height * len) + val);
		printInOrder(head.left, height + 1, "^", len);
	}

	public static String getSpace(int num) {
		String space = " ";
		StringBuffer buf = new StringBuffer("");
		for (int i = 0; i < num; i++) {
			buf.append(space);
		}
		return buf.toString();
	}

	public static void main(String[] args) {
		int n = 4;
		List<Node> res = generateTrees(n);
		for (Node node : res) {
			printTree(node);
		}
	}

}
