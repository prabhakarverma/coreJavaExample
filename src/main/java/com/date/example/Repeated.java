package com.date.example;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
class Repeated {
      public static void main( String  [] args ) {

          Collection<String> listOne = Arrays.asList("milan","iga",
                                                    "dingo","iga",
                                                    "elpha","iga",
                                                    "hafil","iga",
                                                    "meat","iga", 
                                                    "neeta.peeta","iga");

          Collection<String> listTwo = Arrays.asList("hafil",
                                                     "iga",
                                                     "binga", 
                                                     "mike", 
                                                     "dingo","dingo","dingo");

          Collection<String> similar = new HashSet<String>( listOne );
          Collection<String> different = new HashSet<String>();
          different.addAll( listOne );
          different.addAll( listTwo );

          similar.retainAll( listTwo );
          different.removeAll( similar );
          
          List<String> common = listOne.stream().filter(listTwo::contains).collect(Collectors.toList());
          System.out.println("common: "+ common);
          
          System.out.println("One: "+ listOne);
          System.out.println("Two: "+ listTwo);
          System.out.println("Similar: "+ similar);
          System.out.println("Different: "+ different);
      }
}