package com.visam.StringAppending;

public class StringAppending {
	public void concat(String s1,String s2)
	{

		String s3=s1.concat(s2);
		System.out.println(""+s3);
	}
	public void add(String s3,String s4)
	{
		
		String s5=s3+s4;
		System.out.println(""+s5);
	}
		public static void main(String[] args) {
			StringAppending sa= new StringAppending();
			sa.concat("1)strings","concatenation");
			sa.add("2)using+operator","toappend");
			StringBuffer buff= new StringBuffer("3)StringBuffer");
			buff.append("Appending string");
			System.out.println(""+buff);
			StringBuilder bldr= new StringBuilder("4)StringBuilder");
			bldr.append("Appending string");
			System.out.println(""+bldr);
		}
	}

