package com.visam.casting;

public class Test {

	public static void main(String[] args) {
		Employee e=new Accountant();//By default, called as upcasting
		e.hello();
		((Accountant) e).doSomething();//downcasting is to invoke my subclass methods by using super class reference.

	}

}
