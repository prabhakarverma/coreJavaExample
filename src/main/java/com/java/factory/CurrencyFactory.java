package com.java.factory;

class CurrencyFactory
{

    public static void main( String args[] )
    {
        String country = "India";
        Currency currency = CurrencyFactory.createCurrency( country );
        System.out.println( currency + "     " + currency.getSymbol() );
    }

    public static Currency createCurrency( String country )
    {
        if( country.equalsIgnoreCase( "India" ) )
        {
            return new Rupee();
        }
        else if( country.equalsIgnoreCase( "Singapore" ) )
        {
            return new SGDDollar();
        }
        else if( country.equalsIgnoreCase( "US" ) )
        {
            return new USDollar();
        }
        throw new IllegalArgumentException( "No such currency" );
    }

}