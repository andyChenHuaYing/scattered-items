package com.oscar.algorithm.msb.class02;

public class Code04_RingArray {

	public static class MyQueue {
		private int[] arr;
		private int pushi;
		private int polli;
		private int size;
		private final int limit;

		public MyQueue(int l) {
			arr = new int[l];
			pushi = 0;
			polli = 0;
			size = 0;
			limit = l;
		}

		public void push(int value) {
			if (size == limit) {
				throw new RuntimeException("栈满了，不能再加了");
			}
			size++;
			arr[pushi] = value;
			pushi = nextIndex(pushi);
		}

		public int pop() {
			if (size == 0) {
				throw new RuntimeException("栈空了，不能再拿了");
			}
			size--;
			int ans = arr[polli];
			polli = nextIndex(pushi);
			return ans;
		}

		public boolean isEmpty() {
			return size == 0;
		}

		private int nextIndex(int i) {
			return i < limit - 1 ? i + 1 : 0;
		}

	}

}
