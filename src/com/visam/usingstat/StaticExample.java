package com.visam.usingstat;

public class StaticExample implements StaticInterface {
	static int i=5;
	static int j=6;
	static String name="Niha";
	static int id=836;
	static int a;
	static int b;
static void usingStaticMethod()
{
	// String name="Niha";
	//int id=836;
	System.out.println("My name is: "+name+" and My ID is: "+id);
	System.out.println(+i);
	System.out.println("values are: "+a+" and "+b);
}
public void add()
{
	System.out.println(+(i+j));
	//usingStaticMethod();
}
	public static void main(String[] args) 
	{
		System.out.println(""+(i*j));
		//System.out.println(""+(a*b));
		StaticExample se=new StaticExample();
		usingStaticMethod();
		se.add();
		//System.out.println("values are: "+a+" and "+b);
		//System.out.println("values are: "+a+" and "+b);
	}
static
{
a=10;
b=20;
//int c=5;
System.out.println("values are: "+a+" and "+b);
}
static
{
a=30;
b=40;
	//System.out.println("values are: "+c+" and "+d);
}
}