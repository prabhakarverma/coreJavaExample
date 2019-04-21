package com.pra.concurrency;

public class Message
{
    private String msg;

    public Message( String str )
    {
        this.msg = str;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg( String msg )
    {
        this.msg = msg;
    }
}
