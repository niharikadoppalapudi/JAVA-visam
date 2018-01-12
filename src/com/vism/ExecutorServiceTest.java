package com.vism;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceTest {

	public void constructExecutor() throws InterruptedException, ExecutionException {

		long s = System.currentTimeMillis();

		//ExecutorService es = Executors.newFixedThreadPool(10);
		
		ScheduledExecutorService ses = Executors.newScheduledThreadPool(10);
		
		ExecutorCompletionService ecs = new ExecutorCompletionService<>(ses);
		List<PrintTask1> pt1s = new ArrayList<PrintTask1>();


			PrintTask pt = new PrintTask();
		/*	((ExecutorService)es).submit(pt);*/

			ses.schedule(pt, 30, TimeUnit.SECONDS);

			/*PrintTask1 pt1 = new PrintTask1();
			pt1s.add(pt1);*/

			Future ft = ecs.take();
			System.out.println("data.."+ft.get());
			
		
		
		/*List<Future<Data>> futures = es.invokeAll(pt1s);

		for (Future<Data> ft : futures) {
			System.out.println("data..." + ft.get());
		}
*/
	
		
		
		long e = System.currentTimeMillis();

		System.out.println("time" + (e - s));

	
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorServiceTest est = new ExecutorServiceTest();

		est.constructExecutor();
	}

}
