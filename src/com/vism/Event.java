package com.vism;

import java.io.Serializable;

public class Event implements Serializable{

	private String name = "Some event";
	private int i = 10;
	
	public Event(String name){
		this.name = name;
	}

	@Override
	public String toString() {
		return "Event [name=" + name + ", i=" + i + "]";
	}

	
	
}
