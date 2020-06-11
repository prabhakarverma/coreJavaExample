package api;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class DeleteOrgApi
{
    public static void main( String[] args )
    {
        String csvFile = "E:\\GIT_EXAMLPE\\coreJavaExample\\src\\main\\java\\api\\ORG_DEV_DEL_NEW.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        try
        {
            try
            {
                br = new BufferedReader( new FileReader( csvFile ) );
                while( ( line = br.readLine() ) != null )
                {
                    String[] country = line.split( cvsSplitBy );
                    URL url = new URL( "https://secure.dev.30preprod.com/api/abcpg/payment-token/bank/" + country[0] );
                    //URL url = new URL( "https://prod.abc30release.com/api/abcblg/payor-profile/" + country[0] );
                    //URL url = new URL( "https://staging.abc30release.com/api/member-action-code/" + country[0] );
                    //URL url = new URL( "https://dev.30preprod.com/api/member-action-code/" + country[0] );
                    //URL url = new URL( "https://dev.30preprod.com/api/organization/" + country[0] );
                    //URL url = new URL( "https://staging.abc30release.com/api/organization/" + country[0] );
                    //URL url = new URL( "https://dev.30preprod.com/api/abcblg/adjustment-code/" + country[0] );
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    conn.setRequestMethod( "DELETE" );
                    conn.setRequestProperty( "Authorization","bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJ0ZW5hbnRfaWQiOiI0MTQyNDMyMC00MzZmLTZkNzAtNjE2ZS03OTIwMjAyMDIwMjAiLCJhdWQiOlsiYWJjLXBheW1lbnQtZ2F0ZXdheSIsInNlY3VyZS1kb2N1bWVudCIsInNlY3VyZS1hdXRob3JpemF0aW9uIl0sIl90IjoiQ0xJRU5UX09OTFkiLCJzY29wZSI6WyJzZWN1cmU6cHJvdGVjdGVkIl0sImV4cCI6MTU5MTAwMjMzMSwiYXV0aG9yaXRpZXMiOlsiY29tcGFueTpjbGllbnQtcmVhZCIsIm1lcmNoYW50OmNsaWVudC1kZWxldGUiLCJiYW5rLWNhdGFsb2c6Y2xpZW50LWRlbGV0ZSIsInRyYW5zYWN0aW9uOmNsaWVudC1yZWFkIiwid2ViaG9vazpjbGllbnQtZGVsZXRlIiwicGF5bWVudC10b2tlbjpjbGllbnQtZGVsZXRlIiwicHVibGljLWZpbGUtcmVjb3JkOmNsaWVudC13cml0ZSIsInB1YmxpYy1maWxlLXJlY29yZDpjbGllbnQtcmVhZCIsInB1YmxpYy1maWxlLXJlY29yZDpjbGllbnQtcHJvdGVjdGVkIiwicGF5bWVudDpjbGllbnQtY3JlYXRlIiwicHJvY2Vzc29yOmNsaWVudC1yZWFkIiwic2VjdXJlLWRvY3VtZW50OmNsaWVudC1hZG1pbiJdLCJqdGkiOiIxZDU1ZDE2YS0wNTE3LTRjZDItOTc2ZC01ZTM1ODc1MGI3YmQiLCJjbGllbnRfaWQiOiJNSUdSQVRJT05fQUdFTlQifQ.N3GNNAxgY5vBxK0gmkFYHPL_7UJTqKXxAl2KwpK4FTxudICk5-lA7HTzjfa3-ieuLplztcPsvN2KMljD2RPR-u-lj32F7826aJkSI8d_RfX5OhPczaPgN9UWsawnNJpKUqh1_7R4FbXmGniECdu0u-KmnNrqNsusoUxLW5PN2WXfm-IXi3_njqhs_Sw6ghu-XxGaSze8TYfORa7NBbtBFlF6gXRs91u6tae1IkDM0f1v2j9dj_4DN6dCUsiZyreEZUnpONETJTNINEAH2ce45MZXHvEW5-Siw34MVEvGsVsrEoEHJMl627KMISHMsCsVUujXnuXlKPCk5GjyupUYcQ");//+GetTokenApi.gettoken());

                    conn.setRequestProperty( "Accept", "application/json" );

                    System.out.println( conn.getResponseCode() );
                }
            }
            catch( Exception e )
            {
                e.printStackTrace();
            }
            finally
            {
                if( br != null )
                {
                    try
                    {
                        br.close();
                    }
                    catch( IOException e )
                    {
                        e.printStackTrace();
                    }
                }
            }
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
    }
}