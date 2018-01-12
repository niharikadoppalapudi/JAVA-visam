
package com.visam.threadssynchronize;

public class ThreadSynchronizeExample implements Runnable{
public synchronized void ThreadMethod()
{
	String s="Synchronization";
	String s1=" in JAVA.";
	System.out.println(s.concat(s1));
}
public static synchronized
void TestingLoop()//When static method is synchronized,lock will be on class not on object.
{
	for(int i=0;i<3;i++)
	{
		System.out.println(""+i);
	}
}
@Override
public void run()
{
	//System.out.println("Overriding run method.");
	TestingLoop();
	ThreadMethod();
}	
public static void main(String args[])
{ 	ThreadSynchronizeExample syn1=new ThreadSynchronizeExample();
ThreadSynchronizeExample syn2=new ThreadSynchronizeExample();
	Thread t1=new Thread(syn1);
	Thread t2=new Thread(syn1);
	Thread t3= new Thread(syn2);
	Thread t4=new Thread(syn2);
	t1.start();
	t2.start();
	t3.start();
	t4.start();

	
}
}
