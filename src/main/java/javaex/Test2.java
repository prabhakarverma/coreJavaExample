package javaex;

public class Test2
{
    public static void main( String[] args ) throws Exception
    {
        try
        {
            int x = 10 * 20 - 20;
            System.out.println( x );
            String inter = "prabhakar";

            inter.intern();

            throw new Exception( "Hello " );
        }
        catch( Exception e )
        {
            System.out.print( e.getMessage() );
        }
        finally
        {
            System.out.println( "World" );
        }
    }
}