package com.oscar.algorithm.practice.class04;

/**
 * Description
 *
 * @author huaying
 * @version 0.0.1
 * @since 2020/6/29
 */
public class Heap {

    private int[] heapArr;
    private int size;

    public Heap(int size) {
        heapArr = new int[size];
        this.size = 0;
    }

    public void push(int e) {
        heapArr[size] = e;
        heapInsert(size++);
    }

    private void heapInsert(int index) {
        while (heapArr[index] > heapArr[(index - 1) / 2]) {
            swap(heapArr[index], heapArr[(index - 1) / 2]);
            index = (index - 1) / 2;
        }
    }

    private void swap(int i, int j) {
        int temp = heapArr[i];
        heapArr[i] = heapArr[j];
        heapArr[j] = temp;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int pop() {
        int result = heapArr[0];
        swap(0, --size);
        heapify(0, size);

        return result;
    }

    private void heapify(int index, int size) {
        int left = index * 2 + 1;
        while (left < size) {
            int largest = left + 1 < size && heapArr[left] < heapArr[left + 1] ? left + 1 : left;
            largest = heapArr[largest] > heapArr[index] ? largest : index;
            if (largest == index) {
                break;
            }
            swap(index, largest);
            index = largest;
            left = index * 2 + 1;
        }
    }
}
