package com.test.collection;

import java.util.ArrayList;
import java.util.List;

public class TestClass
{

    public static void main( String[] args )
    {
        func1( new ArrayList<String>(), new Integer( 1 ) );
        func2( new ArrayList<String>(), new Integer( 1 ) );
        func2( new ArrayList<String>(), new Integer( 2 ) );

        List<? extends Object> list1 = new ArrayList<Object>();
        List<?> list2 = new ArrayList<Object>();

        List<? extends Object> list3 = new ArrayList<String>();
        List<?> list4 = new ArrayList<String>();
    }

    static void func1( List<?> o, Object s )
    {
        o.add( null ); // only null
        //  o.add(s); // wrong
        o.get( 0 );  // OK
    }

    static void func2( List<? extends Object> o, Object s )
    {
        o.add( null ); // only null
        //   o.add(s); // wrong
        o.get( 0 ); // OK
        o.get( 1 );
    }
}