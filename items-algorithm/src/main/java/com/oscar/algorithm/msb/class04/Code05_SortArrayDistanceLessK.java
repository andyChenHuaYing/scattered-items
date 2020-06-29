package com.oscar.algorithm.msb.class04;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Code05_SortArrayDistanceLessK {


    public void sortedArrDistanceLessK(int[] arr, int k) {
        // 默认小根堆
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int index = 0;
        for (; index <= Math.min(arr.length, k); index++) {
            heap.add(arr[index]);
        }
        int i = 0;
        for (; index < arr.length; i++, index++) {
            heap.add(arr[index]);
            arr[i] = heap.poll();
        }
        while (!heap.isEmpty()) {
            arr[i++] = heap.poll();
        }
    }

    public static void main(String[] args) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

		addElem(minHeap);

		System.out.println("===================");

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.comparingInt(Integer::intValue).reversed());
		addElem(maxHeap);

	}

	private static void addElem(PriorityQueue<Integer> minHeap) {
		minHeap.add(8);
		minHeap.add(4);
		minHeap.add(4);
		minHeap.add(9);
		minHeap.add(10);
		minHeap.add(3);

		while (!minHeap.isEmpty()) {
			System.out.println(minHeap.poll());
		}
	}

}
