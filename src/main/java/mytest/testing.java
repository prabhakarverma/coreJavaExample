package mytest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

public class testing {

	public static void main(String[] args) {

//		Hashtable ht =new Hashtable();
//		ht.put("A",101);
//		
//		HashMap hm = new HashMap();
//		hm.put("A",101);
//		
		
		HashMap<String,Integer> hm = new HashMap();
		
		hm.put("a", 1);
		hm.put("b", 2);
		hm.put("c", 3);
		
		System.out.println(hm);
		
		
		ArrayList<Integer> al = new ArrayList();
		al.add(11);
		Vector<Integer> v = new Vector();
		v.addElement(11);
		v.addElement(22);
		v.addElement(33);
		v.addElement(44);
		
		
		
		
	}

}
