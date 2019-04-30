package mytest;

import java.util.HashSet;
import java.util.Set;

public class CreateTestObject
{

    public static void main( String[] args )throws InterruptedException
    {
        try
        {
            HashSet map = new HashSet(  );


            map.add( 10 );
            Thread th = new Thread();
            th.join();
            th.wait();
            CreateTestObject obj = (CreateTestObject) Class.forName( "mytest.CreateTestObject" ).newInstance();
            System.out.println( obj );
        }
        catch( InstantiationException | IllegalAccessException | ClassNotFoundException e )
        {
            e.printStackTrace();
        }

    }

}
