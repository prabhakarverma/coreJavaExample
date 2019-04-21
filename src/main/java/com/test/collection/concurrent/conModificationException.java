package com.test.collection.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class conModificationException extends Thread
{

    static List al = new ArrayList();

    public static void main( String[] args )
    {

        al.add( "A" );
        al.add( "B" );
        conModificationException t1 = new conModificationException();
        t1.start();

        for( Iterator iterator = al.iterator(); iterator.hasNext(); )
        {
            System.out.println( "Main Thread..." );
            try
            {
                Thread.sleep( 3000 );
                System.out.println( iterator.next() );
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
            al.add( "C" );
        }
        catch( InterruptedException e )
        {
            e.printStackTrace();
        }

    }

}
