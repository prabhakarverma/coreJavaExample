package com.test.example;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class testExampleInro {

	public static void main(String... p) {
//		&& &  | || 
		
		// AND      bitwise and   bitwise or           OR
		
		int a =4;
		int b = 9;
		
		
		//a =  111   
		//b =  101
		//           
		
		System.out.println(a & b);
		
	
		ArrayList al = new ArrayList();

		String s;
	
		CopyOnWriteArraySet ss = new CopyOnWriteArraySet<>();
		CopyOnWriteArrayList l = new CopyOnWriteArrayList<>();
		l.addIfAbsent("a");
		l.addIfAbsent("b");
		l.addIfAbsent("a");
		
	}

}
