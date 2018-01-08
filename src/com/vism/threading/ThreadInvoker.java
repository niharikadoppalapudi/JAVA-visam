package com.vism.threading;

public class ThreadInvoker {

	public static void main(String args[]) throws InterruptedException {
		
		
		Thread t1 = new MyThread("Thread1");
		Thread t2 = new MyThread("Thread2");

		t2.start();
		t1.start();

		Thread t3 = new Thread(new MyThreadCe("Thread3"));
		Thread t4 = new Thread(new MyThreadCe("Thread4"));
		
		for(int i = 0 ; i <2500 ; i++) {
			Thread t = new Thread(new MyThreadCe("Thread"+i));
			t.start();
		}
		
		
		t3.start();
		t4.start();
		
		System.out.println("I am the main method");
		
		t3.join();
		t4.join();
		t1.join();
		t2.join();

	}

}
