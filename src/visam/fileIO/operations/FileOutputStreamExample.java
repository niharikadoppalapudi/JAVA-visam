package visam.fileIO.operations;

import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String args[]) {
		try {
			FileOutputStream fos = new FileOutputStream("E:\\Niha\\Niha.txt");
			String s = "I want to write this file to you to read.";
			byte b[] = s.getBytes();
			fos.write(b);
			fos.close();
			// fos.write(65);
			// fos.close();
			System.out.println("success");
		} catch (Exception e) {
		}

	}
}
