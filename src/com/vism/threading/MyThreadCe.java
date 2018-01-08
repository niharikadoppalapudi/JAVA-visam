package com.vism.threading;

public class MyThreadCe implements Runnable{

	String name;
	
	public MyThreadCe(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println("Thread Running Clonelable"+name);
	}

}
