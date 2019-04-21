package com.a.b;

import java.util.*;

public class listEqualsTestExample
{

    public static void main( String[] args )
    {
        String arr[] = {
            "Accept-Encoding", "Accept-Language", "chrome-proxy", "Connection", "Cookie", "Host", "Range", "Referer",
            "User-Agent", "Content-Length", "Content-Type", "Origin", "X-Requested-With", "Upgrade-Insecure-Requests"
        };
        List<String> list = new ArrayList<String>();
        list = Arrays.asList( arr );
        List<String> l1 = new ArrayList<String>();
        List<String> l2 = new ArrayList<String>();
        List<String> l3 = new ArrayList<String>();
        l1.add( "aa" );
        l1.add( "bb" );
        l2.add( "cc" );
        l3.add( "dd" );
        l2.add( "ee" );
        l3.add( "ff" );
        l2.add( "gg" );
        l3.add( "hh" );
        l1.add( "chhy" );
        l2.add( "zz" );

        Map<String, List<String>> headers = new HashMap<>();
        headers.put( "Accept-Encoding", l1 );
        headers.put( "Range", l2 );
        headers.put( "AccepEnReferercoding", l1 );
        headers.put( "Connection", l3 );
        headers.put( "Origin", l2 );
        headers.put( "X-Requested-With", l3 );

        for( Map.Entry<String, List<String>> entry : headers.entrySet() )
        {
            String headerName = entry.getKey();
            for( String headerValue : entry.getValue() )
            {
                System.out.println( "header : " + headerName + " :--- " + headerValue );
                if( list.contains( headerName ) )
                {
                    System.out.println( "Cookie not added" );
                }
                else
                {
                    System.out.println( "headerName: " + headerName );
                }
            }
        }

    }

}
