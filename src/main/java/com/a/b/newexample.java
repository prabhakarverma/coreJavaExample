package com.a.b;

public class newexample
{

    public static void main( String[] args )
    {
        String a1 = new String( "abc" );
        String a2 = new String( "abc" );

        StringBuffer sb = new StringBuffer( "abc" );

        //a1 = "XYZ";
        a1.concat( "pra" );

        String s1 = "abc";
        String s2 = "abc";
        //s2 = "ABC";
        s2.concat( "pra" );
        System.out.println( a1 );

        System.out.println( a1.equals( sb ) );
        //System.out.println(s1 ==s2);

        //System.out.println(s2);

    }

}
