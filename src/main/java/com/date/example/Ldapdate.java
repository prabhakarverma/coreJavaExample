package com.date.example;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Interval;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ldapdate
{
    private static final DateTime LDAP_START_DATE = new DateTime( 1601, 1, 1, 0, 0, DateTimeZone.UTC );

    public static void main( String[] args )
    {
        String nano = "131558179297308111";
        long nanoseconds = Long.parseLong( nano );
        long mills = ( nanoseconds / 10000000 );
        // System.out.println(mills);
        long unix = ( ( ( 1970 - 1601 ) * 365 ) - 3 + Math.round( ( 1970 - 1601 ) / 4 ) ) * 86400L;
        //System.out.println(unix);
        long timeStamp = mills - unix;
        Date date = new Date( timeStamp * 1000L );
        SimpleDateFormat sdf = new SimpleDateFormat( "MMM dd, yyyy hh:mm:ss a z" );//sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        String formattedDate = sdf.format( date );
        System.out.println( formattedDate );

        final DateTime now = DateTime.now();
        final Interval interval = new Interval( LDAP_START_DATE, now );
        System.out.println( interval.toDurationMillis() * 10000 );

    }

}