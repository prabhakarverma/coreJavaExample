package com.a.b;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class treemap_testing2 {
	static HashMap<Integer,Integer> ret;

	public static void main(String[] args) {
		//ret.put(1,2);
		Emp e1 = new Emp("umesh",32);
		Emp e2 = new Emp("pra",28);
		Emp e3 = new Emp("vineet",22);
		Emp e4 = new Emp("lavlesh",24);
		Emp e5 = new Emp("aman",21);
		Emp e6 = new Emp("santosh",26);
		TreeMap<Emp,Integer> map = new TreeMap<>();
		map.put(e1,11);map.put(e2,19);map.put(e3,31);
		map.put(e4,46);map.put(e5,34);map.put(e6,23);
		
		System.out.println(map.pollFirstEntry().getKey().name);
		
		System.out.println(map.lastKey().name);
		System.out.println(map.firstKey().name);
		
		for (Map.Entry<Emp,Integer> m : map.entrySet()) {
			System.out.println("name: "+m.getKey().name  +" : "+m.getKey().age  +"  :  "+m.getValue());
		}
	}

}

class Emp implements Comparable{
	public int age;
	public String name;
	public Emp(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public int compareTo(Object arg0) {
		Emp ss = (Emp)arg0;
		//System.out.println("name: "+ss.name  +" : "+ss.age);
		return this.name.compareTo(ss.name);  //assending
		//return ss.name.compareTo(this.name);  //desending
	}
}
