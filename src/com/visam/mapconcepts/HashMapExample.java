package com.visam.mapconcepts;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample {

	public static void main(String[] args) {
	HashMap<Integer,String> hm=new HashMap<Integer,String>();
	hm.put(836,"Niha");
	hm.put(884,"Teja");
	hm.put(806, "Manu");
	
	int key=884;
	String value=hm.get(key);
	System.out.println("key: "+key +"and value " +value);
	Iterator<Integer> itr=hm.keySet().iterator();
	while(itr.hasNext())
	{
		int key1=itr.next();
		System.out.println("key: "+key1 +"and value:" +hm.get(key1));
		//hm.put(811, "sravani"); CONCURRENT MODIFICATION EXCEPTION.
	
	}
	Collections.synchronizedMap(hm);
	//hm.remove(806);
	//hm.clear();
	System.out.println(""+hm);
	}
}
