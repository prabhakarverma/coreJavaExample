package com.a.b;

import java.util.Set;
import java.util.TreeSet;

public class treeset_testing
{

    public static void main( String[] args )
    {
        Employee e1 = new Employee( "umesh", 32 );
        Employee e2 = new Employee( "pra", 28 );
        Employee e3 = new Employee( "vineet", 22 );
        Employee e4 = new Employee( "lavlesh", 24 );
        Set<Employee> set = new TreeSet<>();

        set.add( e1 );
        set.add( e2 );
        set.add( e3 );
        set.add( e4 );

        for( Employee employee : set )
        {
            System.out.println( "name: " + employee.name + " : " + employee.age );
        }
    }

}

class Employee implements Comparable
{
    public int age;
    public String name;

    public Employee( String name, int age )
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo( Object arg0 )
    {
        Employee ss = (Employee) arg0;
        //return this.name.compareTo(ss.name);  //assending
        return ss.name.compareTo( this.name );  //desending
    }
}
