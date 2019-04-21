package com.aaa.example;

public class StrExmp
{

    private StrExmp()
    {
        //System.out.println("hello");
    }

    public static void main( String[] args )
    {
        StrExmp bb = new StrExmp();
        String s1 = "abc";
        String s11 = "abc";
        String s2 = new String( "abc" );
        String s3 = new String( "abc" );
        System.out.println( s2 == s3 );

        System.out.println( s1.hashCode() == s2.hashCode() );
        System.out.println( s1.equals( s3 ) );
    }

}
