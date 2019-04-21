package com.test.collection;

import java.util.ArrayList;

public class testAppJDK9Example
{

    public static void main( String[] args )
    {

        ArrayList<String> al = new ArrayList()
        {
            private ArrayList<String> aa()
            {
                System.out.println( "Hello World..." );
                return null;
            }
        }.aa();

    }

}
