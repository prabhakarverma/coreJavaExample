package testing;

public class cpppp
{

    int a = 10;

    public  void test( int a){

        a = a;
        System.out.println(this.a);
    }

    public static void main( String[] args )
    {

        new cpppp().test( 100 );
    }
}
