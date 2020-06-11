package abc.uk.thread;

import java.util.TreeSet;

public class SortArray
{
    public static void main( String[] args )
    {

        String arr[] = { "45632", "-974536", "4754" };
        TreeSet<Integer> ts = new TreeSet<>();
        for( String s : arr )
        {
            ts.add( Integer.parseInt( s ) );
        }
        System.out.println( ts );
    }
}
