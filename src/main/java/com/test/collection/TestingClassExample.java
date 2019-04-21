package com.test.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Vector;

public class TestingClassExample {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap();
		hm.put(1, null);
		hm.put(null, "pra4");
		hm.put(null, null);hm.put(3, null);
		System.out.println(hm);
		
		HashSet h = new HashSet();
		h.add(11);
		h.add(null);h.add(null);
		System.out.println(h);
		
		
		Hashtable ht = new Hashtable();
		ht.put(1, 33);
		ht.put(2, 22);ht.put(3, 11);
		System.out.println(h);
		
		ArrayList al = new ArrayList();
		al.add("arrayList of array");
		al.add(null);al.add(null);
		System.out.println(al);
		
		LinkedList al1 = new LinkedList();
		al1.add("linkedList of list");
		al1.add(null);al1.add(null);
		System.out.println(al1);
		
		Vector v = new Vector();
		v.add("vector of list");
		v.add(null);v.add(null);
		System.out.println(v);
		
	}

}
