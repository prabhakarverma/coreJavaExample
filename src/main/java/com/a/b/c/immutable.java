package com.a.b.c;

public final class immutable implements Comparable<immutable>
{

    private String name;
    private int age;

    public immutable( String name, int age )
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    @Override
    public int compareTo( immutable arg0 )
    {

        return this.name.compareTo( arg0.name );
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ( ( name == null ) ? 0 : name.hashCode() );
        return result;
    }

    @Override
    public boolean equals( Object obj )
    {
        return ( this.name == ( (immutable) obj ).name ) && ( this.age == ( (immutable) obj ).age );
    }

}
