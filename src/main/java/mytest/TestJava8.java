package mytest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestJava8
{

    public static void main( String[] args )
    {

        List<String> alpha = Arrays.asList( "a", "b", "c", "d" );

        //Before Java8
        List<String> alphaUpper = new ArrayList<>();
        for( String s : alpha )
        {
            alphaUpper.add( s.toUpperCase() );
        }

        System.out.println( alpha ); //[a, b, c, d]
        System.out.println( alphaUpper ); //[A, B, C, D]

        // Java 8
        List<String> collect = alpha.stream().map( String::toUpperCase ).collect( Collectors.toList() );
        System.out.println( collect ); //[A, B, C, D]

        // Extra, streams apply to any data type.
        List<Integer> num = Arrays.asList( 1, 2, 3, 4, 5 );
        List<Integer> collect1 = num.stream().map( n ->
            n * 2
        ).collect( Collectors.toList() );
        System.out.println( collect1 ); //[2, 4, 6, 8, 10]
        //System.out.println(12 ^ 5);
        System.out.println( "------------------------------" );

        go();
    }

    public static void go()
    {
        List<Staff> staff = Arrays.asList(
            new Staff( "pk", 30, new BigDecimal( 10000 ) ),
            new Staff( "uk", 27, new BigDecimal( 20000 ) ),
            new Staff( "vgg", 33, new BigDecimal( 30000 ) )
        );

        List<String> collect = staff.stream().map( x -> x.getName() ).collect( Collectors.toList() );
        System.out.println( collect );
    }

}

class Staff
{

    private String name;
    private int age;
    private BigDecimal salary;

    public Staff( String name, int age, BigDecimal salary )
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge( int age )
    {
        this.age = age;
    }

    public BigDecimal getSalary()
    {
        return salary;
    }

    public void setSalary( BigDecimal salary )
    {
        this.salary = salary;
    }
}