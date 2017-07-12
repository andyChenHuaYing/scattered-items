package com.bjsxt.base.multi002.conn009;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Description:
 *
 * @author Oscar
 * @version SNAPSHOT-0.1
 * @date 2017/7/5
 */
public class BlockQueue {
    private final List<Object> list = new ArrayList<>();
    private final AtomicInteger count = new AtomicInteger(0);
    private final int minSize = 0;
    private final int maxSize;

    public BlockQueue(int maxSize) {
        this.maxSize = maxSize;
    }

    private final byte[] lock = new byte[0];

    public Object take() throws InterruptedException {
        Object temp;

        synchronized (lock) {
            while (count.get() == minSize) {
                lock.wait();
            }
            count.decrementAndGet();
            temp = list.get(list.size() - 1);
            lock.notify();
            System.out.println("Take element:" + temp);
        }

        return temp;
    }

    public void put(Object element) throws InterruptedException {
        synchronized (lock) {
            while (count.get() == maxSize) {
                lock.wait();
            }
            count.incrementAndGet();
            list.add(element);
            lock.notify();
            System.out.println("Put element:" + element);
        }
    }


    public static void main(String[] args) throws InterruptedException {
        BlockQueue blockQueue = new BlockQueue(5);
        blockQueue.put(0);
        blockQueue.put(1);
        blockQueue.put(2);
        blockQueue.put(3);
        blockQueue.put(4);

        Thread.sleep(100);
        Object element = blockQueue.take();
        blockQueue.put(5);
        System.out.println(element);
    }

}
