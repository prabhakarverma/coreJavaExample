package com.a.b;

class prabha extends DataHiding
{
    protected static void show()
    {
        System.out.println( "java" );
    }

    public static void main( String[] args )
    {
        DataHiding p = new prabha();
        ( (prabha) p ).hi();
        System.out.println( p.hashCode() );
        System.out.println( new prabha().hashCode() );
        System.out.println( new DataHiding().hashCode() );
        System.out.println( ( (prabha) p ).hashCode() );
    }

    void hi()
    {
        System.out.println( "hi" );
    }

    void me()
    {
        System.out.println( "ch me" );
    }
}