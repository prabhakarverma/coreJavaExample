package com.epilio.quikr.migration.v2.test1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;

public class charduplicate {

	public static void main(String[] args) {
		String s[] = {"X","a","x","s","a","s"};
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String string : s) {
			Integer c = map.get(string);
			if(c == null) {
				c = 0;
			}
			map.put(string, c+1);
		}
		System.out.println(map);
		
	String ss = "mom";
	String rev="";
	for (int i = ss.length()-1; i >= 0; i--) {
		rev = rev + ss.charAt(i);
	}
	System.out.println(rev);
	if(ss.equals(rev)) {
		System.out.println("palin");
	}
	/////
	ArrayList<Integer> al = new ArrayList<>();
    al.add(1);al.add(2);
    al.add(3); al.add(4);

//  Iterator<Integer> itr = al.iterator();
    ListIterator<Integer> itr = al.listIterator();
    while (itr.hasNext()) {
    	synchronized (charduplicate.class) {
    		if (itr.next() == 2) {
                itr.remove();
                itr.add(6);
                
                
            }
		}
    	//al.remove(3);
    }
    
    System.out.println(al);

    /* itr = al.iterator();
    while (itr.hasNext()) {
        if (itr.next() == 3) {
            al.remove(3);
        }
    }*/

	}

}
