package com.hashmapDemo;

import java.util.HashMap;

class HashMapExmp
{
    public static void main( String args[] ) throws Exception
    {
        HashMap m = new HashMap(22,2);

        // puts an entry into HashMap
        m.put( "abcdef1", " H1 " );
        m.put( "abcdfG", " H2 " );
        m.put( "abcdgh2", " H3 " );
        m.put( "abcdeh", " H4 " );

        System.out.println(m);




    }
}
   