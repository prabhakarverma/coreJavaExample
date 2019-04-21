package com.a.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class test implements Comparable  {
	
	private String name;
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	private int age;
	
	public test(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public static void main() {
		
		String s1 = "abc";
		s1 = "xyz";
		System.out.println(s1);
		
		List<Integer> al = new ArrayList<Integer>();
		for (int j = 0; j <10; j++) {
			al.add(j);	
		}
		System.out.println(al);
		
		for (Integer integer : al) {
			if(integer == 3) {
				al.remove(3);
			}
		}
		System.out.println(al);
	}
	
	  public static void main(String[] args) {
			Set<test> set = new TreeSet<>();
			set.add(new test("pra", 29));
			set.add(new test("umesh", 23));
			set.add(new test("viv", 38));
			set.add(new test("amit", 27));
			set.add(new test("abc", 20));
			
		
			
			for (Iterator iterator = set.iterator(); iterator.hasNext();) {
				test test = (test) iterator.next();
				System.out.println(test.getName()  + "  :  "+test.getAge());
			}
			
		}
	@Override
	public int compareTo(Object o) {
		
		//return ((test)o).name.compareTo(this.name);  //desending
		return this.name.compareTo(((test)o).name); //assending
	}

}
