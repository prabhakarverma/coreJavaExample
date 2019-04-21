package javaex;

public class Adder
{
    public static void main( String[] args )
    {
        Adder adder = new Adder();
        for( long i = -100000; i <= 314572800; i++ )
        {
            adder.addIncremental( i );
        }
    }

    public long addIncremental( long l )
    {
        Long sum = 0L;
        sum = sum + l;
        System.out.println( sum );
        return sum;
    }
}