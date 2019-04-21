package com.test.collection.concurrent;

import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class conModificationSloution extends Thread
{

    static ConcurrentHashMap<String, Integer> al = new ConcurrentHashMap<>();

    public static void main( String[] args )
    {

        al.put( "A", 12 );
        al.put( "B", 13 );
        conModificationSloution t1 = new conModificationSloution();
        t1.start();

        for( Entry<String, Integer> entry : al.entrySet() )
        {
            System.out.println( "Main Thread..." );
            try
            {
                Thread.sleep( 3000 );
                System.out.println( "Key : " + entry.getKey() + " Value : " + entry.getValue() );
            }
            catch( InterruptedException e )
            {
                e.printStackTrace();
            }
        }

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
