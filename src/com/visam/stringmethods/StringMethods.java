
	package com.visam.stringmethods;

	public class StringMethods {
		

		public static void main(String[] args) {
			String s1="welcome";
			String s2= new String("welcome");
			String s="welcome";
			String s3="WELCOME";
			String s4="thankyou";
			String s5="";
			String s6="Try to learn java";
			System.out.println(s1.equals(s3));
			System.out.println(s1.equalsIgnoreCase(s3));
			System.out.println(s1==s2);
			System.out.println(s1==s);
			System.out.println(s1.compareTo(s4));
			System.out.println(s3.compareTo(s5));
			s5=s5.concat("soo much");
			System.out.println(s5);
			System.out.println(s4.contains("thank"));
			System.out.println(s4.endsWith("you"));
			String sf=String.format("Please %s",s1);
			System.out.println(sf);
			System.out.println(s1.getBytes());
			char[] ch=new char[8];
			s6.getChars(3, 9,ch, 1);
			System.out.println(ch);
			int i1=s1.indexOf('c');
			int i2=s3.indexOf('C');
			System.out.println(i1+"+"+i2);
			System.out.println(s4.indexOf('k'));
			String in=s2.intern();
			System.out.println(s1==s2);
			System.out.println(s1==in);
			System.out.println(s5.isEmpty());
			String join1=String.join("/","first","second","third","fourth");
			System.out.println(join1);
			String la="welcome to mime game";
			System.out.println(la.lastIndexOf('m'));
			System.out.println(la.lastIndexOf('m',10));
			System.out.println(s5.charAt(4));
			System.out.println(s4.length());
			System.out.println(s5.replaceAll("soo","very"));
			System.out.println(s5.replaceFirst("soo","very"));
			System.out.println(s1.startsWith("w"));
			System.out.println(s5.substring(3, 6));
			char[] arry=s2.toCharArray();
			for(int i=0;i<arry.length;i++)
			{
				System.out.println(arry[i]);
			}
			System.out.println(s6.toUpperCase());
			System.out.println(s4.toLowerCase());
			String tr="let us                   ";
			System.out.println(tr.trim()+"try to trim"+tr.trim()+" the spaces");
			int i=10;
			String va=String.valueOf(i);
			System.out.println(va);
			}

	}

