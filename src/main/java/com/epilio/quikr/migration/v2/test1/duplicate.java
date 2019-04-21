package com.epilio.quikr.migration.v2.test1;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class duplicate {

	public static void main(String[] args) {
		String s= "hello i am pra hello pra i";
		String words[]=s.split(" ");
		Map<String, Integer> occurrences = new HashMap<String, Integer>();

		for ( String word : words ) {
		   Integer oldCount = occurrences.get(word);
		   if ( oldCount == null ) {
		      oldCount = 0;
		   }
		   occurrences.put(word, oldCount + 1);
		}
		
		System.out.println(occurrences);
		
		int wrc=1;							//Variable for getting Repeated word count
		
		for(int i=0;i<words.length;i++)		//Outer loop for Comparison		
		{
			for(int j=i+1;j<words.length;j++)	//Inner loop for Comparison
			{
				
			if(words[i].equals(words[j]))	//Checking for both strings are equal
				{
					wrc=wrc+1;				//if equal increment the count
					words[j]="0";			//Replace repeated words by zero
				}
			}
			if(words[i]!="0")
			//System.out.println(words[i]+"--"+wrc);	//Printing the word along with count
			wrc=1;
			
	     }  

	}

	

}
