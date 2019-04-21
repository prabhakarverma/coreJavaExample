package com.test.lemdaExp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class streamExample {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);al.add(5);al.add(5);
		al.add(8);al.add(23);
		System.out.println(al);
		
		List<Integer> l2 =  al.stream().filter(i->i%2==0).collect(Collectors.toList());
		long l3 =  al.stream().count();
		al.stream().distinct().collect(Collectors.toList());
		System.out.println(al.stream().distinct().collect(Collectors.toList()));
		

	}

}
