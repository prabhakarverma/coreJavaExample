package com.threadpool.example;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallableExample implements Callable{
	private String name;
	MyCallableExample(String name){
		this.name=name;
	}
	@Override
	public Object call()throws Exception {
		
		System.out.println(name+" job started by thread "+Thread.currentThread().getName());
		
			Thread.sleep(8000);
		
		System.out.println(name+" job completed by thread "+Thread.currentThread().getName()+"\n.................");
		return name;
	
	}
	public static void main(String arr[]) throws Exception {
		MyCallableExample my[]= {
				new MyCallableExample("prabhat"),
				new MyCallableExample("umesh"),
				new MyCallableExample("vivek"),
				new MyCallableExample("lavlesh"),
				new MyCallableExample("naresh")
				
		};
		ExecutorService ex =Executors.newFixedThreadPool(2);
		for(MyCallableExample m: my) {
			Future<String> f = ex.submit(m);
			//System.out.println("job was completed: "+f.get());
		}
		ex.shutdown();
	}
}
