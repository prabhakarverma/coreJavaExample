package com.interfacetest;

class A implements I1
{
    public static void main( String[] args )
    {
        System.out.println( I1.b );
    }

    public void foo()
    {
        System.out.println( I1.b );
    }
}