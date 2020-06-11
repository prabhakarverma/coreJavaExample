package api;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetTokenApi
{

    public static void main( String[] args )throws  Exception
    {
        GetTokenApi.gettoken( );
    }
    public static String gettoken( ) throws IOException
    {
        String token = null;
        URL url = new URL( "https://secure.dev.30preprod.com/api/token?grant_type=client_credentials" ); //staging token
        //URL url = new URL( "https://dev.30preprod.com/api/token?grant_type=client_credentials" );
        //URL url = new URL( "https://prod.abc30release.com/api/token?grant_type=client_credentials" ); //staging token
        //URL url = new URL( "https://staging.abc30release.com/api/token?grant_type=client_credentials" ); //staging token
        //URL url = new URL( "https://dev.30preprod.com/api/token?grant_type=client_credentials" ); // LDAP token
        //URL url = new URL( "https://qa.30preprod.com/api/token?grant_type=client_credentials" ); // LDAP token
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod( "POST" );

        conn.setRequestProperty( "client_id", "AUTOMATED_TESTING" );
        //conn.setRequestProperty( "Authorization", "Basic QVVUT01BVEVEX1RFU1RJTkc6dDNzdEBsbHRoM3RoMW5ncw==" );//client staging
        conn.setRequestProperty( "Authorization", "Basic TUlHUkFUSU9OX0FHRU5UOnQzc3RAbGx0aDN0aDFuZ3M=" );//migration agent
        conn.setRequestProperty( "Accept", "application/json" );

        //conn.setRequestProperty( "Authorization", "Basic TUlHUkFUSU9OX0FHRU5UOnQzc3RAbGx0aDN0aDFuZ3M=" ); // for ldap

        if( conn.getResponseCode() != 200 )
        {
            throw new RuntimeException( "Failed : HTTP error code : "
                                        + conn.getResponseCode() );
        }
        BufferedReader br = new BufferedReader( new InputStreamReader(
            ( conn.getInputStream() ) ) );
        String output, body = "";

        while( ( output = br.readLine() ) != null )
        {
            body = body + output;
        }
        try
        {
            Object obj = new JSONParser().parse( body );
            JSONObject jo = (JSONObject) obj;
            token = (String) jo.get( "access_token" );

            System.out.println(token);
            conn.disconnect();
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
        return  token;
    }
}