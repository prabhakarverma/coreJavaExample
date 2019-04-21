package mytest;

import java.util.HashMap;
import java.util.Map;

public class testClass
{
    public static void main( String[] args )
    {
        HashMap h = new HashMap();
        System.out.println( "abcdef".hashCode() );
        System.out.println( "abcdfG".hashCode() );
        h.put( "abcdef", "prab1" );
        h.put( "abcdFG", "prab2" );
        h.put( "abcdfH", "prab3" );
        h.put( true, "prab3" );
        h.put( null, "prab3" );
        h.put( null, "prab13" );
        System.out.println( h );
        my m1 = new my();
        m1.setId( 11 );
        m1.setName( "pra1" );
        my m2 = new my();
        m2.setId( 11 );
        m2.setName( "pra2" );
        my m3 = new my();
        m3.setId( 11 );
        m3.setName( "java" );
        HashMap<my, String> hs = new HashMap();

        hs.put( m1, "java1" );
        hs.put( m2, "java2" );
        hs.put( m3, "java3" );

        for( Map.Entry<my, String> m : hs.entrySet() )
        {
            System.out.println( "key: " + m.getKey() + "  ,value: " + m.getValue() );
        }

    }

}

class my
{
    private int id;
    private String name;

    public int getId()
    {
        return id;
    }

    public void setId( int id )
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }
}
