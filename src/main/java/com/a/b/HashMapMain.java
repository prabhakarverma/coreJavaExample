package com.a.b;
 
import java.util.HashMap;
import java.util.Map;

import com.hashmapDemo.IdentityHashMapExample;
 
public class HashMapMain {
 
	public static void main(String[] args) {
		MyEmployee emp1=new MyEmployee("Martin",27);
		Map<MyEmployee,String> hm=new HashMap<MyEmployee,String>();
		hm.put(emp1, "Verified");
		emp1.setName("John");
		System.out.println(hm.get(emp1));
		
		for(Map.Entry<MyEmployee, String> entry : hm.entrySet()) {
			System.out.println(entry.getKey().getName()  +  "    "+   entry.getValue());
			
		}
		
		
		
		
		
	}
}