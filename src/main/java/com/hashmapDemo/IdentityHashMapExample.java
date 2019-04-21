package com.hashmapDemo;
import java.util.Map;
import java.util.HashMap;
import java.util.IdentityHashMap;
 
public class IdentityHashMapExample 
{
    public static void main(String[] args) 
    {
    	
    	String s1="java";
    	String s2=new String("java");
    	System.out.println(s1==s2);
    	System.out.println(s1.equals(s2));
    	
    	new Thread();
    	
    	
        // Creating HashMap and IdentityHashMap objects
        Map hm = new HashMap();
        Map ihm = new IdentityHashMap();
 
        // Putting key and value in HashMap and IdentityHashMap Object
        hm.put("hmkey","hmvalue");
        hm.put(new String("hmkey"),"hmvalue1"); 
        //hm.put(new StringBuffer("hmkey"),"hmvalue");
        //hm.put(new StringBuffer("hmkey"),"hmvalue1");
        ihm.put("ihmkey","ihmvalue");
        ihm.put("ihmkey","ihmvalue");
        ihm.put(new String("ihmkey"),"ihmvalue1");
        ihm.put(new String("ihmkey"),"ihmvalue1");
        ihm.put(new StringBuffer("hmkey"),"hmvalue1");
        ihm.put(new StringBuffer("hmkey"),"hmvalue1");
        // Print Size of HashMap and WeakHashMap Object
        //hm.size() will print 1 since it compares the objects logically
        // and both the keys are same
        System.out.println("Size of HashMap: "+hm.size());
         
        //ihm.size() will print 2 since it compares the objects by reference
        System.out.println("Size of IdentityHashMap: "+ihm.size());
 
         
    }
}