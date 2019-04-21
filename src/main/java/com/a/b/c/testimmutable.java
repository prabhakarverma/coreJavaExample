package com.a.b.c;

import java.util.HashSet;
import java.util.Set;

public class testimmutable
{

    public static void main( String[] args )
    {
        String s1 = new String( "prabha" );
        String s2 = new String( "prabha" );

        StringBuffer sb1 = new StringBuffer( "prabha" );
        StringBuffer sb2 = new StringBuffer( "prabha" );

        immutable im = new immutable( "pra", 29 );
        immutable im2 = new immutable( "pra", 29 );

        Set<Object> set = new HashSet<>();

        set.add( sb1 );
        set.add( sb2 );
        System.out.println( set.size() );

        System.out.println( sb1.equals( sb2 ) );
        System.out.println( s1.equals( s2 ) );

        System.out.println( im.equals( im2 ) );

        System.out.println( im.getAge() );
        System.out.println( im.getName() );

    }

}
