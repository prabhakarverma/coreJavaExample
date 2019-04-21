package com.hashmapDemo;
import java.util.*;
class HashMapDemo
{
    public static void main(String args[])throws Exception
    {
        HashMap m = new HashMap();
        Demo d = new Demo();
         
        // puts an entry into HashMap
        m.put(d," Hi "); 
         
        System.out.println(m); 
        d = null;
         
        // garbage collector is called
        System.gc();
         
        //thread sleeps for 5 sec
        Thread.sleep(5000); 
         
        System.out.println(m);
        }
    }
    class Demo
    {
        public String toString()
        {
            return "demo";
        }
         
        // finalize method
        public void finalize()
        {
            System.out.println("Finalize method is called");
        }
}