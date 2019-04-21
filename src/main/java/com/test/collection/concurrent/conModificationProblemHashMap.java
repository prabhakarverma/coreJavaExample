package com.test.collection.concurrent;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class conModificationProblemHashMap extends Thread
{

    static Map<String, Integer> al = new HashMap();// java.util.ConcurrentModificationException
    //static Map<String, Integer> al = new ConcurrentHashMap(); //success, because its thread safe and support bucket level locking

    public static void main( String[] args )
    {

        al.put( "A", 12 );
        al.put( "B", 13 );
        conModificationProblemHashMap t1 = new conModificationProblemHashMap();
        t1.start();

        for( Entry<String, Integer> entry : al.entrySet() )
        {
            System.out.println( "Main Thread..." );
            try
            {
                Thread.sleep( 0 );
                System.out.println( "Key : " + entry.getKey() + " Value : " + entry.getValue() );
            }
            catch( InterruptedException e )
            {
                e.printStackTrace();
            }
        }

        Hashtable ht = new Hashtable();
        ht.put( 1, 11 );

    }

    public void run()
    {

        try
        {
            Thread.sleep( 0 );
            System.out.println( "chile thread modification..." );
            al.put( "C", 11 );
        }
        catch( InterruptedException e )
        {
            e.printStackTrace();
        }

    }

}
