package javaex;

import java.io.StringWriter;

public class AllExample
{

    public static void main( String[] args )
    {

        String s1 = "abc";
        StringBuffer s2 = new StringBuffer( s1 );
        //System.out.println(s1.equals(s2));
        StringWriter str;
        String s = "Java String Quiz";
        //System.out.println(s.substring(5,3));

        String s11 = "abc";
        String s22 = new String( "abc" );

        System.out.println( "pra: " + s1 == s11 );

        //System.out.print(s11==s22);
        //System.out.println(s11==s22.intern());

        String s1s = "abc";
        String s2s = new String( "abc" );

        s2s.intern();
        System.out.println( s1s == s2s );

        String sa = "Java String Quiz";
        System.out.println( sa.charAt( sa.toUpperCase().length() ) );

    }

}
