package com.epilio.quikr.migration.v2.test1;

import java.util.HashMap;
import java.util.Map;

public class stringsort {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		String s[] = {"X","a","x","s","a","s","A","x"};
		/*List list = Arrays.asList(s);
		Collections.sort(list);
		System.out.println(list);*/
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String string : s) {
			Integer c = map.get(string);
			if(c == null) {
				c = 0;
			}
			map.put(string, c+1);
		}
		//Arrays.sort(s, new mytest()); 
		
		System.out.println(map);  //count string

	}
}
/*class mytest implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		String s1 = (String)arg0;
		String s2 = (String)arg1;
		 return s1.compareTo(s2);
	  }
	}*/
	