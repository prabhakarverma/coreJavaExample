package testing;

public class Test
{
    private String name;
    private String id;

    public Test( String name, String id )
    {
        this.name = name;
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getId()
    {
        return id;
    }

    public void setId( String id )
    {
        this.id = id;
    }

    @Override
    public boolean equals( Object o )
    {
        return true;
    }

    @Override
    public int hashCode()
    {
        return 1;
    }
}
