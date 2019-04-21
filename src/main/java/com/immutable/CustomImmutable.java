package com.immutable;

import java.util.Date;

public final class CustomImmutable
{
    private final String name;
    private final String email;
    private final Date dob;

    private CustomImmutable( String name, String email, Date dob )
    {
        this.name = name;
        this.email = email;
        this.dob = new Date( dob.getTime() );
    }

    public static CustomImmutable createNewInstance( String name, String email, Date dob )
    {
        return new CustomImmutable( name, email, dob );
    }

    public String getName()
    {
        return name;
    }

    public String getEmail()
    {
        return email;
    }

    public Date getDob()
    {
        return new Date( dob.getTime() );
    }

}
