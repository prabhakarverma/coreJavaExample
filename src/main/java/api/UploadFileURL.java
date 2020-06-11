package api;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class UploadFileURL
{

    public static void main( String[] args )throws  Exception
    {
        UploadFileURL.gettoken( );
    }
    public static String gettoken( ) throws IOException
    {
        String token = null;
       URL url = new URL( "https://secure.dev.30preprod.com/api/secure-document/11ea7317-224d-132a-b4a4-23974c1c95b4/file-record?file-category=AGREEMENT&owner-type=member" ); // LDAP token
        //URL url = new URL( "https://qa.30preprod.com/api/token?grant_type=client_credentials" ); // LDAP token
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod( "POST" );

        //conn.setRequestProperty( "Authorization", "Basic QVVUT01BVEVEX1RFU1RJTkc6dDNzdEBsbHRoM3RoMW5ncw==" );//client staging
        conn.setRequestProperty( "Authorization", "Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0ZW5hbnRfaWQiOiI0MTQyNDMyMC00MzZmLTZkNzAtNjE2ZS03OTIwMjAyMDIwMjAiLCJhdWQiOlsiYWJjLXBheW1lbnQtZ2F0ZXdheSIsInNlY3VyZS1kb2N1bWVudCIsInNlY3VyZS1hdXRob3JpemF0aW9uIl0sIl90IjoiQ0xJRU5UX09OTFkiLCJzY29wZSI6WyJzZWN1cmU6cHJvdGVjdGVkIl0sImV4cCI6MTU4NTkxMjgxNywiYXV0aG9yaXRpZXMiOlsiY29tcGFueTpjbGllbnQtcmVhZCIsIm1lcmNoYW50OmNsaWVudC1kZWxldGUiLCJiYW5rLWNhdGFsb2c6Y2xpZW50LWRlbGV0ZSIsInRyYW5zYWN0aW9uOmNsaWVudC1yZWFkIiwid2ViaG9vazpjbGllbnQtZGVsZXRlIiwicGF5bWVudC10b2tlbjpjbGllbnQtZGVsZXRlIiwicHVibGljLWZpbGUtcmVjb3JkOmNsaWVudC13cml0ZSIsInB1YmxpYy1maWxlLXJlY29yZDpjbGllbnQtcmVhZCIsInB1YmxpYy1maWxlLXJlY29yZDpjbGllbnQtcHJvdGVjdGVkIiwicGF5bWVudDpjbGllbnQtY3JlYXRlIiwicHJvY2Vzc29yOmNsaWVudC1yZWFkIiwic2VjdXJlLWRvY3VtZW50OmNsaWVudC1hZG1pbiJdLCJqdGkiOiIxNzc4ZmMyZi0yN2E3LTQ1YzgtYmRkZC1lYWRhYzFmNzFlYTAiLCJjbGllbnRfaWQiOiJNSUdSQVRJT05fQUdFTlQifQ.fi7WY_twsJV-hlBOhgZ2l0NlpFOo_Gs5dwrHp4l-HfQOUrwW8gcblK-7Iy5QOxwlgeRAK2VPyZLMT530qTqbPrfpNKPYWNDev00wFu-T5MqtPKSFGEhRiA43w-fvwb14SeoBMB9BBEWzztnX3f-PDMhRgvZxToK4ACh99X0GxTBBCoQzpodhi6ouEl5hTfNFoT4mZR2lqmxOKV0sdMHwu7nHv0QXJfnNzSpMSx3fE1Krafs0Z-6ycUNmo0tYm28ejmtRBARQmD25LFwdpuOZ2k0hH5uMlxfyA22JFWxceQrPQFJdTRs2EKxa0fI21P4qpufcRFQMJl81KtJXw2vJDA" );//migration agent
        conn.setRequestProperty( "Accept", "multipart/form-data" );
        conn.setRequestProperty( "Content-Type", "application/json" );

        System.out.println(conn.getResponseCode());
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
            //JSONObject jo = (JSONObject) obj;
            //token = (String) jo.get( "access_token" );

            System.out.println(body);
            conn.disconnect();
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
        return  token;
    }
}