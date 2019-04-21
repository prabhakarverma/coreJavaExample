package mytest;

public class SingletonCuston
{

    private static SingletonCuston _instance = null;

    private SingletonCuston()
    {

    }

    public static SingletonCuston getSingletonCuston()
    {
        if( _instance == null )
        {
            _instance = new SingletonCuston();
        }
        return _instance;
    }

}
