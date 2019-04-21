package com.date.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyElementCheck
{

    public static void main( String a[] )
    {
        ArrayList<String> arrl = new ArrayList<String>();
        arrl.add( "First" );
        arrl.add( "Second" );
        arrl.add( "Third" );
        arrl.add( "Random" );
        List<String> list = new ArrayList<String>();
        list.add( "Second" );
        list.add( "Random" );
        System.out.println( "Does ArrayList contains all list elements?: "
                            + arrl.containsAll( list ) );
        list.retainAll( arrl );
        System.out.println( "Does ArrayList contains all list elements?: "
                            + arrl );

        ArrayList listOne = new ArrayList( Arrays.asList( "milan", "dingo", "elpha", "hafil", "meat", "iga", "neeta.peeta" ) );
        ArrayList listTwo = new ArrayList( Arrays.asList( "hafil", "iga", "binga", "mike", "dingo", "prabhakar" ) );
        listTwo.retainAll( listOne );
        //System.out.println( listTwo );
        // System.out.println( listTwo );

        List<String> list1 = new ArrayList( Arrays.asList( "milan", "dingo", "elpha", "hafil", "meat", "iga", "neeta.peeta" ) );
        List<String> list2 = new ArrayList( Arrays.asList( "hafil", "iga", "binga", "mike", "dingo", "prabhakar" ) );

        List<String> common = list2.stream().filter( list1::contains ).collect( Collectors.toList() );
        System.out.println( common );
        System.out.println( list1 );
        System.out.println( list2 );
        list1.removeAll( common );
        System.out.println( "list: " + list1 );
    }
}