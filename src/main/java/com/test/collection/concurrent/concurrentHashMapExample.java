package com.test.collection.concurrent;

import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class concurrentHashMapExample extends Thread {

	static ConcurrentHashMap<String, Integer> al = new ConcurrentHashMap<>();
	
	public static void main(String[] args) {
	
		al.put("A",12);al.put("B",13);
		concurrentHashMapExample t1 = new concurrentHashMapExample();
		
		al.putIfAbsent("A", 14);al.putIfAbsent("C", 14);
		System.out.println("Main Thread..."+al);
		
		for (Entry<String, Integer> entry : al.entrySet()) {
			System.out.println("Main Thread...");
			try {
				al.put("D",15);
				Thread.sleep(1000);
				System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			
		

	}

}
