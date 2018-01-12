package com.vism;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOStreamsTest {

	public void readFileUsingInputStream(String filePath, String writePath) {

		try (InputStream is = new FileInputStream(new File(filePath));
				OutputStream os = new FileOutputStream(writePath)) {

			long startTime = System.currentTimeMillis();

			BufferedInputStream bis = new BufferedInputStream(is, 512);

			byte b = (byte) bis.read();

			while (b != -1) {
				System.out.println("Data read from Input Stream is " + (char) b);

				b = (byte) bis.read();

				os.write(b);

			}

			long endTime = System.currentTimeMillis();

			
			System.out.println("Time in millis " + (endTime - startTime));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String args[]) {
		IOStreamsTest io = new IOStreamsTest();
		io.readFileUsingInputStream("C:\\Users\\sairam\\Desktop\\sAGEit\\read.txt",
				"C:\\Users\\sairam\\Desktop\\sAGEit\\write.txt");
	}

}
