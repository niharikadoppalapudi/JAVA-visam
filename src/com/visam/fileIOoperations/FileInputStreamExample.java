package com.visam.fileIOoperations;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;
public class FileInputStreamExample {

	public static void main(String[] args) {
	try
	{
		File f=new File("E:\\Niha\\new.txt");
		if(f.createNewFile())
		{
			System.out.println("file created.");
		}
		FileInputStream fin1=new FileInputStream("E:\\Niha\\Niha1.txt");
		FileInputStream fin2=new FileInputStream("E:\\Niha\\Niha2.txt");
		FileOutputStream fout=new FileOutputStream("E:\\Niha\\new.txt");
		SequenceInputStream sis=new SequenceInputStream(fin1,fin2);
		//BufferedInputStream bin=new BufferedInputStream(fin);
		//int i=fin.read();
		int i;
		
		while((i=sis.read())!=-1) {
		fout.write(i);
		}
		
		sis.close();
		fin1.close();
		fin2.close();
		fout.close();
		
		FileWriter fw = new FileWriter("E:\\Niha\\Niha1.txt");
		fw.write("Hello");
				
				
		
		
	}
	catch(Exception e) {}
	}

}
