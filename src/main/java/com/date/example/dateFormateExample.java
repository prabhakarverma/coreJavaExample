package com.date.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateFormateExample {

	public static void main(String[] args) throws ParseException {
		
		 String p111 = "Mon Apr 16 19:30:59 IST 2018";
	     SimpleDateFormat p222 = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
	     SimpleDateFormat p333 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	     System.out.println(p333.format(p222.parse(p111)));
		
		//"dddd, MMMM Do YYYY, h:mm:ss a"   //Dec 29, 2017 9:54:38 AM   2018-02-06T08:47:44.252Z  2018-02-07T14:43:59.861Z
		//2018-02-12T13:30:27.100Z 
		String dd = "2013-08-09T02:19:58.765Z"; 
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.S'Z'"); 
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy h:mm:ss a");
        String formattedDate = sdf.format(df.parse(dd));
        //System.out.println(formattedDate);
        
        
       
        
        //Tue Feb 06 00:00:00 IST 2018  E MMM dd HH:mm:ss Z yyyy  2018-02-16T00:00:00.000+05:30
        String p1 = "2018-02-16T00:00:00.000+05:30";
        SimpleDateFormat sss = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.S"); 
        SimpleDateFormat ddd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fff = ddd.format(sss.parse(p1));
        System.out.println(fff);
        
        
        String dd1 = "2018-02-12T13:30:27.100Z";//"2018-02-07T14:43:59.861Z"; 
		SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.S'Z'"); 
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate1 = sdf1.format(df1.parse(dd1));
        System.out.println(formattedDate1);
        
        String string ="1/14/2019 09:00 PM"; //-> 2019-03-14T12:00:00
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm a"); 
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss");
        String formatted = dateFormat.format(simpleDateFormat.parse(string));
        System.out.println(formatted);
        
        String s1="hello";
        String s2="heLLo"; 
        System.out.println(s1.equalsIgnoreCase(s2));   // returns true
       
        // h = 31 * h + (val & 0xff);
        System.out.println("abc".hashCode());
        System.out.println("AB".hashCode());
      
	}

}
