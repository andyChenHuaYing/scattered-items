package com.bjsxt.base.multi001.sync005;
/**
 * synchronized的重入
 * @author alienware
 *
 */
public class SyncDubbo1 {

	public synchronized void method1(){
		System.out.println("method1..");
		method2();
	}
	public synchronized void method2(){
		System.out.println("method2..");
		method3();
	}
	public synchronized void method3(){
		System.out.println("method3..");
	}
	
	public static void main(String[] args) {
		final SyncDubbo1 sd = new SyncDubbo1();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				sd.method1();
			}
		});
		t1.start();
	}
}
