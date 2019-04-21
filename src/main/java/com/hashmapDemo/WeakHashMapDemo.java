package com.hashmapDemo;

import java.util.WeakHashMap;

class WeakHashMapDemo
{
    public static void main( String args[] ) throws Exception
    {
        //join thread example

        WeakHashMap m = new WeakHashMap();
        HDemo d = new HDemo();

        // puts an entry into WeakHashMap
        m.put( d, " Hi " );
        System.out.println( m );

        d = null;

        // garbage collector is called
        System.gc();

        // thread sleeps for 4 sec
        // Thread.sleep(4000);

        System.out.println( m );
    }
}

class HDemo
{
    public String toString()
    {
        return "demo";
    }

    // finalize method
    public void finalize()
    {
        System.out.println( "finalize method is called" );
    }
}