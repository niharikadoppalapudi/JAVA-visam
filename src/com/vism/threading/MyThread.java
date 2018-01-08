package com.vism.threading;

public class MyThread extends Thread {

	String name;
	
	public MyThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println("Thread is running"+name);
	}
	
}
