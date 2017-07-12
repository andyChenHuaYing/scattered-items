package com.bjsxt.base.multi002.conn008;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * Description:
 *
 * @author Oscar
 * @version SNAPSHOT-0.1
 * @date 2017/7/5
 */
public class ListAdd3 {
    private static volatile List<String> list = new ArrayList<>();

    private void add(String element) {
        list.add(element);
    }

    private int size() {
        return list.size();
    }

    public static void main(String[] args) {
        final ListAdd3 listAdd3 = new ListAdd3();

        final CountDownLatch countDownLatch = new CountDownLatch(1);
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                list.add("Oscar");
                System.out.println("当前线程：" + Thread.currentThread().getName() + " 添加第" + i + "个元素。");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (list.size() == 5) {
                    countDownLatch.countDown();
                }
            }
        }, "t1");

        Thread t2 = new Thread(() -> {
            try {
                if (list.size() != 5) {
                    countDownLatch.await();
                    System.out.println("Current thread " + Thread.currentThread().getName() + " shutdown.");
                    throw new RuntimeException();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "t2");

        t2.start();
        t1.start();
    }
}
