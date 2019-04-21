package javaex;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

public class dayOfTime
{

    public static void main( String[] args )
    {
        //DateTime startTime = DateTime.now();
        //2018-01-25 11:55:55.0
        //Fri Jan 26 06:36:12 EST 2018
        DateTime startTime = DateTime.parse( "2018-01-25 11:55:55.0", DateTimeFormat.forPattern( "YYYY-MM-dd HH:mm:ss.S" ) );
        startTime = startTime.withHourOfDay( 0 );
        startTime = startTime.withMinuteOfHour( 0 );
        startTime = startTime.withSecondOfMinute( 0 );
        startTime = startTime.withMillisOfSecond( 0 );

        System.out.println( "starttime: " + startTime );

        DateTime endTime = DateTime.now();
        endTime = endTime.withHourOfDay( 23 );
        endTime = endTime.withMinuteOfHour( 59 );
        endTime = endTime.withSecondOfMinute( 59 );
        endTime = endTime.withMillisOfSecond( 0 );
        System.out.println( "endTime: " + endTime );
    }

}
