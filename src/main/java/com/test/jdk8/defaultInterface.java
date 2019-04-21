package com.test.jdk8;

public interface defaultInterface
{

    default void show()
    {
        System.out.println( "defaultInterface" );
    }
}
