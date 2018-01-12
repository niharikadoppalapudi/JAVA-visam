package com.visam.collectionsconcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class CollectionExample{

	public static void main(String[] args) {
	Student s1=new Student();
	Student s2=new Student();
	Student s3=new Student();
	s1.setAge(25);
	s2.setAge(45);
	s3.setAge(30);
	List<Student> l=new ArrayList<Student>();
	l.add(s1);
	l.add(s2);
	l.add(s3);
	System.out.println("Before sorting: "+l);
	Collections.sort(l);
	System.out.println("After sorting:"+l);
	s1.setAge(15);
	s2.setAge(10);
	s3.setAge(25);
	Set<Student> s=new TreeSet<Student>();
	
	s.add(s1);
	s.add(s2);
	s.add(s3);
	//Iterator<Student>i=s.iterator();
	System.out.println("After sorting:"+s);
}
}
