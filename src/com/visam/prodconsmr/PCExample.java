package com.visam.prodconsmr;

import java.util.LinkedList;

public class PCExample {
	public static void main(String[] args) throws InterruptedException {
		final PC pc = new PC();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pc.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}

public static class PC {
	LinkedList<Integer> ll = new LinkedList();
	int capacity = 1;

	public void produce() throws InterruptedException {
		int pvalue = 0;
		while (true) {
			synchronized (this) {
				
				while (ll.size() == capacity)
					wait();
				System.out.println("Producer produced value:" + pvalue);
				ll.add(pvalue++);
				notify();
				Thread.sleep(1000);
			}
		}
	}

	public void consume() throws InterruptedException {
		while (true) {
			synchronized (this) {
				while (ll.size() == 0)
					wait();
				int cvalue = ll.removeFirst();
				System.out.println("consumer consumed value:" + cvalue);
				notify();
				Thread.sleep(1000);
			}
		}
	}

}
}