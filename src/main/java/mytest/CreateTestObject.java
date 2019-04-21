package mytest;

public class CreateTestObject
{

    public static void main( String[] args )
    {
        try
        {
            CreateTestObject obj = (CreateTestObject) Class.forName( "mytest.CreateTestObject" ).newInstance();
            System.out.println( obj );
        }
        catch( InstantiationException | IllegalAccessException | ClassNotFoundException e )
        {
            e.printStackTrace();
        }

    }

}
