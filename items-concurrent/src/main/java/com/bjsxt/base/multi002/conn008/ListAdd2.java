package com.bjsxt.base.multi002.conn008;

import java.util.ArrayList;
import java.util.List;

/**
 * @author alienware
 *
 * notify 不释放锁。所以输出结果为t1添加10个元素之后，t2才会解释现有线程
 */
public class ListAdd2 {
	private volatile static List list = new ArrayList();	
	
	public void add(){
		list.add("bjsxt");
	}
	public int size(){
		return list.size();
	}

	public static void main(String[] args) {
		
		final ListAdd2 list2 = new ListAdd2();
		final Object lock = new Object();
		Thread t1 = new Thread(() -> {
            try {
                synchronized (lock) {
                    System.out.println("t1启动..");
                    for(int i = 0; i <10; i++){
                        list2.add();
                        System.out.println("当前线程：" + Thread.currentThread().getName() + "添加了一个元素..");
                        Thread.sleep(500);
                        if(list2.size() == 5){
                            System.out.println("已经发出通知..");
                            lock.notify();
                        }
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }, "t1");
		
		Thread t2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("t2启动..");
                if(list2.size() != 5){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("当前线程：" + Thread.currentThread().getName() + "收到通知线程停止..");
                throw new RuntimeException();
            }
        }, "t2");

        /*
         *换个位置，t1先执行，则不是我们预期的结果，t1先执行，t2不会被唤醒
         */
		t2.start();
		t1.start();
		
	}
	
}
