package com.visam.threadssynchronize;

//public class ThreadExample extends Thread {
public class ThreadExample implements Runnable {
	@Override
	public void run() {
		System.out.println("I am Overrided.");

		Thread curr = Thread.currentThread();
		System.out.println("" + curr);

	}

	public static void main(String[] args) throws InterruptedException {
		ThreadExample syn = new ThreadExample();
		Thread t1 = new Thread(syn);
		Thread t2 = new Thread(syn);
		t1.start();
		t1.sleep(10);
		t2.start();
		System.out.println("join");
		t1.join();
		t2.join();
	}

}
