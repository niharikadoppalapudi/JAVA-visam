package com.vism;

import java.util.concurrent.Callable;

public class PrintTask1 implements Callable<Data> {

	@Override
	public Data call() throws Exception {

		System.out.println("do something");

		Data d = new Data();
		
		return d;
	}

}
