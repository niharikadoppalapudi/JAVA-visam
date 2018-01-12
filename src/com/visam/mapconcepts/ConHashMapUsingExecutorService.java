package com.visam.mapconcepts;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConHashMapUsingExecutorService {
	private final ConcurrentHashMap<Integer,String> chmap=new ConcurrentHashMap<Integer,String>();

	public static void main(String[] args) {
		ExecutorService es=Executors.newFixedThreadPool(5);
		ConHashMapUsingExecutorService chm=new ConHashMapUsingExecutorService();
		es.execute(chm.new ComputerScienceCourse());
		es.execute(chm.new InformationTechnologyCourse());
		es.execute(chm.new ValuesFromMap());
		es.execute(chm.new Sample());
	}

class ComputerScienceCourse implements Runnable
{

	@Override
	public void run() {
	chmap.put(836,"Niha");
	System.out.println(""+chmap);
		
	}
	
}
class InformationTechnologyCourse implements Runnable
{

	@Override
	public void run() {
	chmap.put(806,"Manu");
	chmap.put(884,"Teja");
		
	}
	
}
class ValuesFromMap implements Runnable
{

	@Override
	 public void run() {
		Iterator<Integer> itr=chmap.keySet().iterator();
		while(itr.hasNext())
		{
			int key=itr.next();
			System.out.println("key: "+key+" and value: "+chmap.get(key));
			chmap.put(811, "sravani");//ConcurrentHashMap doesn't throw ConcurrentModificationException.
		}
		
		
	}
}
	class Sample implements Runnable
	{

		@Override
		public void run() {
			Iterator<Integer> itr=chmap.keySet().iterator();
			while(itr.hasNext())
			{
				int key=itr.next();
				System.out.println("key: "+key+" and value: "+chmap.get(key));
				chmap.put(846, "Ashi");
			}
			
			
		}
		
	}
	
}
	
