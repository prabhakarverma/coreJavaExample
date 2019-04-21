package com.test.collection;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapExample extends PrintStream
{

    public HashMapExample( String arg0 ) throws FileNotFoundException
    {
        super( arg0 );
        // TODO Auto-generated constructor stub
    }

    public static void main( String[] args ) throws FileNotFoundException
    {

        HashMapExample example = new HashMapExample( "hello" );

        example.println( "hii\n" );
        example.println( "" == null );

        HashMap hs = new HashMap();
        hs.put( "a", 10 );
        hs.put( "a", 20 );
        List p = new ArrayList();

        //System.out.println(hs);
        List<?> list1 = new ArrayList<Object>();
        list1.add( null );

        System.out.println( list1 );

        List list = new ArrayList();
        list.add( "abc" );
        list.add( new Integer( 5 ) ); //OK

        for( Object obj : list )
        {
            //type casting leading to ClassCastException at runtime
            String str = (String) obj;

        }
    }

    @Override
    public void println( boolean x )
    {
        //synchronized (this) {
        print( x );
        //newLine();
        // }
    }
}
