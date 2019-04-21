package com.a.b;

public class CompareToExample
{
    public static void main( String args[] )
    {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "hemlo";
        String s4 = "Zlag";
        System.out.println( s1.compareTo( s2 ) ); // 0 because both are equal
        System.out.println( s1.compareTo( s3 ) ); //-1 because "l" is only one time lower than "m"
        System.out.println( s1.compareTo( s4 ) ); // 2 because "h" is 2 times greater than "f"

        String ss = "urn:lsid:ibm.com:oa:7397161b-43c0-46b1-8f43-75eae4642e6f";
        System.out.println( ss.replaceAll( "urn:lsid:ibm.com:oa:", "" ) );

    }
}