package abc.uk.thread;

import java.util.concurrent.*;

public class ExecutorThreadPool implements Callable
{

    public ExecutorThreadPool( String name )
    {
        System.out.println( name +" is active " );
    }

    public static void main( String[] args ) throws InterruptedException, ExecutionException
    {

        ExecutorThreadPool my[] = {
            new ExecutorThreadPool( "priya" ),
            new ExecutorThreadPool( "umesh" ),
            new ExecutorThreadPool( "amit" ),
            new ExecutorThreadPool( "prabhat" ),
            new ExecutorThreadPool( "nazz" )
        };

        ExecutorService ex = Executors.newFixedThreadPool( 2 );
        for( ExecutorThreadPool m : my )
        {
            Future<String> f = ex.submit( m );
        }

        ex.shutdown();

    }

    @Override
    public Object call() throws Exception
    {

        System.out.println( " job started by thread " + Thread.currentThread().getName() );
        Thread.sleep( 5000 );
        System.out.println( " job completed by thread " + Thread.currentThread().getName() );
        return Thread.currentThread().getName();
    }

}
