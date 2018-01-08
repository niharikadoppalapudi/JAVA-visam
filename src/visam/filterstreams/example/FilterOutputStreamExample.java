package visam.filterstreams.example;
import java.io.*;
public class FilterOutputStreamExample {
public static void main( String args[])
		{
			try
			{
				//File f=new File("E:\\Niha\\streams.txt");
				FileOutputStream fos=new FileOutputStream("E:\\Niha\\streams.txt");
				FilterOutputStream filter=new FilterOutputStream(fos);
				String s="This is IO Stream.";
				byte b[]=s.getBytes();
				filter.write(b);
				//filter.flush();
				filter.close();
				FileInputStream filein=new FileInputStream("E:\\Niha\\streams.txt");
				FilterInputStream filterin=new BufferedInputStream(filein);
				int i;
				while((i=filterin.read())!=-1)
				{
					
					System.out.print((char)i);
					filterin.skip(2);
					//int a=filterin.available();
					//System.out.println("available bytes are:"+a);
				}
				filterin.close();
			}
			catch(Exception e)
			{
				
			}
			
		}
}
