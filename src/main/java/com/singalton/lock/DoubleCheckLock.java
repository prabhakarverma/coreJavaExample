package com.singalton.lock;

public class DoubleCheckLock
{

    private static volatile DoubleCheckLock _instance;

    public static void main( String[] args )
    {

        DoubleCheckLock.getDoubleCheckInstance();
        DoubleCheckLock.getSingleCheckInstance();
    }

    public static DoubleCheckLock getDoubleCheckInstance()
    {
        if( _instance == null )
        {
            synchronized( DoubleCheckLock.class )
            {
                if( _instance == null )
                {
                    _instance = new DoubleCheckLock();
                    System.out.println( "double chq locking instance: " + _instance );
                }
            }
        }
        return _instance;
    }

    public static DoubleCheckLock getSingleCheckInstance()
    {
        if( _instance == null )
        {
            _instance = new DoubleCheckLock();
            System.out.println( "single chq locking instance: " + _instance );
        }
        return _instance;
    }
}
