package com.abst.exe;

public abstract class dummyAbstract extends myAbstract implements mytest1, dummytest
{

    public void show()
    {
        System.out.println( "show body..." );
    }

    public void hide()
    {
        System.out.println( "hide body..." );
    }

}
