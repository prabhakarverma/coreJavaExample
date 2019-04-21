package com.java.factory;

interface Currency
{
    String getSymbol();
}

public class Rupee implements Currency
{
    @Override
    public String getSymbol()
    {
        return "Rs";
    }
}

class SGDDollar implements Currency
{
    @Override
    public String getSymbol()
    {
        return "SGD";
    }
}

class USDollar implements Currency
{
    @Override
    public String getSymbol()
    {
        return "USD";
    }
}