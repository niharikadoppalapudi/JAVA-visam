package com.vism;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerilization {

	public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException {

		Event e = new Event("chakri");

		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(new File("C:\\Users\\sairam\\Desktop\\sAGEit\\abc.txt")));

		oos.writeObject(e);

		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(new File("C:\\Users\\sairam\\Desktop\\sAGEit\\abc.txt")));

		Event deser = (Event)ois.readObject();
		
		System.out.println("r"+deser);
		
	}

}
