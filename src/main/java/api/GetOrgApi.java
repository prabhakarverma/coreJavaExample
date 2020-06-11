package api;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class GetOrgApi
{

    public static void main( String[] args )
    {
        try
        {
            URL url = new URL( "https://dev.30preprod.com/api/organization/" );
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod( "GET" );
            conn.setRequestProperty( "Authorization",
                "Bearer " +
                "eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsiYXV0aG9yaXphdGlvbiIsImNhdGFsb2ciLCJvcmdhbml6YXRpb24iLCJhYmNiaWxsaW5nIiwidGF4YXRpb24iXSwiX3QiOiJDTElFTlRfT05MWSIsInNjb3BlIjpbInBsYXRmb3JtOnByb3RlY3RlZCJdLCJleHAiOjE1NzQ2ODI0NTAsImF1dGhvcml0aWVzIjpbImNhdGFsb2ctaXRlbTpjbGllbnQtd3JpdGUiLCJjbGllbnQtcHJvZmlsZTpjbGllbnQtcmVhZCIsIndlYmhvb2s6Y2xpZW50LXdyaXRlIiwib3JnYW5pemF0aW9uLXNldHRpbmdzOmNsaWVudC1yZWFkIiwic2V0dGxlbWVudDpjbGllbnQtcmVhZCIsIm1lbWJlcjpjbGllbnQtd3JpdGUiLCJvcmdhbml6YXRpb24tZG9jdW1lbnQ6Y2xpZW50LXdyaXRlIiwidGF4LWNvZGU6Y2xpZW50LXJlYWQiLCJ0YXhhdGlvbi1sb2NhdGlvbjpjbGllbnQtZGVsZXRlIiwiY2xpZW50LWFjY291bnQ6Y2xpZW50LWNyZWF0ZSIsImFjdGlvbi1jb2RlOmNsaWVudC13cml0ZSIsIm9yZ2FuaXphdGlvbjpjbGllbnQtcmVhZCIsIm1lbWJlci10cmFuc2FjdGlvbi1mZWUtY29uZmlnOmNsaWVudC1jcmVhdGUiLCJsb2NhdGlvbi1kb2N1bWVudDpjbGllbnQtcmVhZCIsImFwcHJvdmFsLXF1ZXVlOmNsaWVudC13cml0ZSIsInRheGF0aW9uLXRyYW5zYWN0aW9uOmNsaWVudC1jcmVhdGUiLCJtZW1iZXItZG9jdW1lbnQ6Y2xpZW50LXdyaXRlIiwiY2F0ZWdvcnktdGF4LWNvZGU6Y2xpZW50LXJlYWQiLCJwYXlvci1pbnZvaWNlOmNsaWVudC1yZWFkIiwiYWN0aW9uLWNvZGU6Y2xpZW50LXJlYWQiLCJiYW5rLWFjY291bnQ6Y2xpZW50LWNyZWF0ZSIsImZlZTpjbGllbnQtcmVhZCIsImVtcGxveWVlOmNsaWVudC1yZWFkIiwicGF5b3ItcHJvZmlsZTpjbGllbnQtcmVhZCIsImNsaWVudC10cmFuc2FjdGlvbi1mZWUtY29uZmlnOmNsaWVudC1jcmVhdGUiLCJhZGp1c3RtZW50LWNvZGU6Y2xpZW50LWRlbGV0ZSIsInBheW1lbnQtbWV0aG9kLWFjY291bnQ6Y2xpZW50LWNyZWF0ZSIsInN1YnNjcmlwdGlvbi1vcGVyYXRpb246Y2xpZW50LWNyZWF0ZSIsInN1YnNjcmlwdGlvbjpjbGllbnQtY3JlYXRlIiwibG9jYXRpb246Y2xpZW50LXJlYWQiLCJtZW1iZXJzaGlwdHlwZTpjbGllbnQtcmVhZCIsImxvY2F0aW9uOmNsaWVudC13cml0ZSIsImVtcGxveWVlOmNsaWVudC13cml0ZSIsImFncmVlbWVudDpjbGllbnQtY3JlYXRlIiwibWVtYmVyc2hpcHR5cGU6Y2xpZW50LXdyaXRlIiwicGF5bWVudC1tZXRob2Q6Y2xpZW50LXJlYWQiLCJjYXRlZ29yeS10YXgtY29kZTpjbGllbnQtcHJvdGVjdGVkIiwiY2xpZW50LXByb2ZpbGU6Y2xpZW50LWNyZWF0ZSIsImRldmVsb3BlcjpjbGllbnQtcmVhZCIsIm9yZ2FuaXphdGlvbjpjbGllbnQtYWRtaW4iLCJiYW5rLWFjY291bnQ6Y2xpZW50LXJlYWQiLCJtZW1iZXItZG9jdW1lbnQ6Y2xpZW50LXJlYWQiLCJtZW1iZXI6Y2xpZW50LXJlYWQiLCJyZWFzb24tY29kZTpjbGllbnQtY3JlYXRlIiwicGF5bWVudC1tZXRob2Q6Y2xpZW50LWNyZWF0ZSIsImNsaWVudC1wcm9maWxlOmNsaWVudC1kZWxldGUiLCJkZXZlbG9wZXI6Y2xpZW50LXdyaXRlIiwib3JnYW5pemF0aW9uLWRhdGE6Y2xpZW50LWFkbWluIiwic2NoZWR1bGVkLWZlZS1jb25maWc6Y2xpZW50LWNyZWF0ZSIsImxvY2F0aW9uLWRvY3VtZW50OmNsaWVudC13cml0ZSIsInBheW1lbnQtbWV0aG9kLWFjY291bnQ6Y2xpZW50LXJlYWQiLCJhZGp1c3RtZW50LWNvZGU6Y2xpZW50LXdyaXRlIiwiYWdyZWVtZW50OmNsaWVudC1yZWFkIiwidGF4YXRpb24tbG9jYXRpb246Y2xpZW50LXByb3RlY3RlZCIsInN1YnNjcmlwdGlvbjpjbGllbnQtcmVhZCIsImNhdGFsb2ctaXRlbTpjbGllbnQtcmVhZCIsInJvbGU6Y2xpZW50LXdyaXRlIiwidGF4YXRpb24tYWRkcmVzczpjbGllbnQtcmVhZCIsImFwcGxpY2F0aW9uOmNsaWVudC1yZWFkIiwiY29udHJhY3QtcXVldWU6Y2xpZW50LXdyaXRlIiwicGF5b3ItcHJvZmlsZTpjbGllbnQtY3JlYXRlIiwiYWRqdXN0bWVudC1jb2RlOmNsaWVudC1yZWFkIiwiZmVlOmNsaWVudC1jcmVhdGUiLCJhZGp1c3RtZW50LWNvZGU6Y2xpZW50LWNyZWF0ZSIsInN0YXRlbWVudDpjbGllbnQtcmVhZCIsIm9yZ2FuaXphdGlvbi1kb2N1bWVudDpjbGllbnQtcmVhZCIsIm9yZ2FuaXphdGlvbi1zZXR0aW5nczpjbGllbnQtd3JpdGUiLCJhcHBsaWNhdGlvbjpjbGllbnQtd3JpdGUiXSwianRpIjoiOGY2NTEwZTUtNTdjZC00NjE4LWE4ZDQtYTc5ODNhNWM4MGRjIiwiY2xpZW50X2lkIjoiTUlHUkFUSU9OX0FHRU5UIn0.FkxR-TY0omZKGpV8OC5EvZGM6mzPXuRksf7nOLvqiVzB0-8x13IZDd32yHsB74UbOahtJwJP06UBWEG3sU2_SpzUiEjoZOlzxM4DMQd7a1A3iBOwSV4YxIR2fcb-tSfLCGZYRVqC4ebWjO1g88-vqnVU9srVfRz7-oJ4I1AD55RI9vLC391CHhcnXVZMAqudTkNTWx2EXeec9ILkMMTGEDvtIt1VTVAbDo8szE7c658vsTO5QFQYga7p5Z1Gv8yW8hhamX4i8R7YGNhkaob89K4wwfjjAnb51ZMh97gv-bov_bTm6kAiWeztT62U5Ez9BJs6HN77Gmww5AW3uGgccA" );
            conn.setRequestProperty( "Accept", "application/json" );

            if( conn.getResponseCode() != 200 )
            {
                throw new RuntimeException( "Failed : HTTP error code : "
                                            + conn.getResponseCode() );
            }



            /*BufferedReader br = new BufferedReader( new InputStreamReader(
                ( conn.getInputStream() ) ) );
            String output, body = "";
            System.out.println( "Response Body .... " );

            while( ( output = br.readLine() ) != null )
            {
                body = body + output;
                //System.out.println( output );
            }
            System.out.println( body );
            try
            {
                Object obj = new JSONParser().parse( body );
                JSONObject jo = (JSONObject) obj;
                List<Map<Object, Object>> content = (List<Map<Object, Object>>) jo.get( "content" );

                content.stream().forEach( mapsData -> {
                    mapsData.entrySet().forEach( mapData -> {
                        System.out.println( "Key:  " + mapData.getKey() + " Value:   " + mapData.getValue() );
                    } );
                } );

            }
            catch( ParseException e )
            {
                e.printStackTrace();
            }*/







            conn.disconnect();
        }
        catch( MalformedURLException e )
        {
            e.printStackTrace();
        }
        catch( IOException e )
        {
            e.printStackTrace();
        }

    }

}