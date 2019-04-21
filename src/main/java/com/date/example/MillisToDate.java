package com.date.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MillisToDate
{

    public static void main( String args[] )
    {

        long currentDateTime = Long.parseLong( "1520748107144" );
        Date currentDate = new Date( currentDateTime );
        System.out.println( "current Date: " + currentDate );

        DateFormat df = new SimpleDateFormat( "dd/MM/yy HH:mm:ss" );

        //formatted value of current Date
        System.out.println( "Milliseconds to Date: " + df.format( currentDate ) );

        //Converting milliseconds to Date using Calendar
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis( currentDateTime );
        System.out.println( "Milliseconds to Date using Calendar:"
                            + df.format( cal.getTime() ) );

        //copying one Date's value into another Date in Java
        Date now = new Date();
        Date copiedDate = new Date( now.getTime() );

        System.out.println( "original Date: " + df.format( now ) );
        System.out.println( "copied Date: " + df.format( copiedDate ) );
    }

}
