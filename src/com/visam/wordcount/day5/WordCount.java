package com.visam.wordcount.day5;

public class WordCount 
{
	public static void main(String args[])
	{
	//String s="Visam technologies JAVA training program with JAVA lessons, JAVA tutorials, and JAVA assignments";
	String s="Financial System of any country consists of financial markets, financial intermediation and financial instruments or financial products. This paper discusses the meaning of finance and Indian Financial System and focus on the financial markets, financial intermediaries and financial instruments. The brief review on various money market instruments are also covered in this study.";
	String  sub="Financial";
	int index,count=0;
	s=s.toLowerCase();
	sub=sub.toLowerCase();
	for(int i=0;i+sub.length()<=s.length();i++)
	{
		index=s.indexOf(sub,i);
		if(index>0)
		{
			count++;
			i=index;
			index=-1;
		}
	}
	System.out.println("Financial occurs " +count +" times in the given paragraph.");
	}

}


	
