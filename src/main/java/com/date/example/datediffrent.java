package com.date.example;

import org.joda.time.LocalDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class datediffrent
{

    public static void main( String[] args ) throws ParseException
    {
        String date1 = "2017-11-05 00:00:00";
        String date2 = "2017-12-20 00:00:00";

        DateFormat formater = new SimpleDateFormat( "yyyy-MM-dd hh:mm:ss" );

        Calendar beginCalendar = Calendar.getInstance();
        Calendar finishCalendar = Calendar.getInstance();

        try
        {
            beginCalendar.setTime( formater.parse( date1 ) );
            finishCalendar.setTime( formater.parse( date2 ) );
        }
        catch( ParseException e )
        {
            e.printStackTrace();
        }

        while( beginCalendar.before( finishCalendar ) )
        {
            // add one month to date per loop
            String date = formater.format( beginCalendar.getTime() ).toUpperCase();
            //System.out.println(date);
            // System.out.println(beginCalendar.getTime());
            beginCalendar.add( Calendar.DATE, 1 );
            //System.out.println(beginCalendar.getTime());
        }

        LocalDate dateStart = new LocalDate( "2017-09-05" );
        LocalDate dateEnd = new LocalDate( "2017-11-05" );
        // day by day:
        while( dateStart.isBefore( dateEnd ) || dateStart.isAfter( dateEnd ) )
        {
            System.out.println( dateStart );
            dateStart = dateStart.plusDays( 1 );
        }

    }

}
