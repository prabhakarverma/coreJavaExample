package javaex;

public class newException extends Exception
{

    public static void main( String[] args )
    {

        try
        {
            throw new newException();
        }
        catch( newException e )
        {
            System.out.println( "Got the  Exception " + e );
        }

    }

}
