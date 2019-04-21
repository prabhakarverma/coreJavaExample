package com.threadpool.example;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyRunnable implements Runnable
{
    private String name;

    MyRunnable( String name )
    {
        this.name = name;
    }

    public static void main( String arr[] )
    {
        MyRunnable my[] = {
            new MyRunnable( "prabhat" ),
            new MyRunnable( "umesh" ),
            new MyRunnable( "vivek" ),
            new MyRunnable( "lavlesh" ),
            new MyRunnable( "naresh" ),
            new MyRunnable( "ramesh" ),
            new MyRunnable( "mahesh" ),
            new MyRunnable( "suresh" ),
            new MyRunnable( "harish" )

        };

        //ExecutorService ex =Executors.newFixedThreadPool(1);
        ThreadPoolExecutor ex = new ThreadPoolExecutor( 3, 6, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>() );

        for( MyRunnable m : my )
        {
            ex.submit( m );
        }
        ex.shutdown();
        //System.out.println(ex);
    }

    @Override
    public void run()
    {

        System.out.println( name + " job started by thread " + Thread.currentThread().getName() );
        try
        {
            Thread.sleep( 1000 );
        }
        catch( InterruptedException e )
        {
            e.printStackTrace();
        }
        System.out.println( name + " job completed by thread " + Thread.currentThread().getName() );

    }
}
