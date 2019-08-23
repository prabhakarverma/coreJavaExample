package java8;

import java.util.*;

public class ListSumStreamApi
{
    public static void main( String[] args )
    {
        List<Integer> list = Arrays.asList( 10, 12, 25, 3, 5, 20, 15, 6, 8, 11 );

        int sum = list.stream().filter( integer -> integer > 15 ).mapToInt( value -> value ).sum();

        System.out.println( "sum : " + sum );

        Map<String, String> m = new HashMap<>( );

        System.out.println(new StringBuilder( "ab" ).hashCode() == new StringBuilder( "ab" ).hashCode() );
        m.put( new String("" ), " H1 " );
        m.put( new String( ), " H2 " );
        System.out.println( m );
        System.out.println( new StringBuilder(  ).toString().hashCode() );
        System.out.println( new StringBuilder(  ).toString().hashCode() );

    }
}
