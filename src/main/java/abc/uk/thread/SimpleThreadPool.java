package abc.uk.thread;

import java.util.concurrent.ExecutionException;

public class SimpleThreadPool implements Runnable
{

    String name;

    public SimpleThreadPool( String name )
    {
        this.name = name;
    }

    public static void main( String[] args ) throws InterruptedException, ExecutionException
    {

        SimpleThreadPool sp[] = {
            new SimpleThreadPool( "hello1" ),
            new SimpleThreadPool( "hello2" ),
            new SimpleThreadPool( "hello3" ),
            new SimpleThreadPool( "hello4" ),
            new SimpleThreadPool( "hello5" )
        };
        for( SimpleThreadPool obj : sp )
        {
            Thread t = new Thread( obj );
            t.start();
        }

    }

    @Override
    public void run()
    {

        System.out.println( name + " job started by thread " + Thread.currentThread().getName() );

        try
        {
            Thread.sleep( 8000 );
        }
        catch( InterruptedException e )
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println( name + " job completed by thread " + Thread.currentThread().getName() );

    }

}
