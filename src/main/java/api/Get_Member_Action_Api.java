package api;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import sun.nio.cs.UTF_32;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Map;

public class Get_Member_Action_Api
{

    public static void main( String[] args )
    {
        try
        {
            String filename = "E:\\DATA_MIGRATION\\coreJavaExample\\src\\main\\java\\api\\ORG_DEV_DEL_NEW.csv";
            //URL url = new URL( "https://dev.30preprod.com/api/organization?size=100" );
            //URL url = new URL( "https://staging.abc30release.com/api/organization?size=2000" );
            //URL url = new URL( "https://staging.abc30release.com/api/organization?size=1000" );
            //URL url = new URL( "https://dev.30preprod.com/api/location-action-code?size=2000" );
            URL url = new URL( "https://dev.30preprod.com/api/abcblg/adjustment-code?size=100" );
            //URL url = new URL( "https://staging.abc30release.com/api/member-action-code?size=2000" );
            //URL url = new URL( "https://staging.abc30release.com/api/item?page=2&size=2000" );
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod( "GET" );
            conn.setRequestProperty( "Authorization","bearer "+GetTokenApi.gettoken());
            conn.setRequestProperty( "Accept", "application/json" );

            if( conn.getResponseCode() != 200 )
            {
                throw new RuntimeException( "Failed : HTTP error code : "
                                            + conn.getResponseCode() );
            }

            BufferedReader br = new BufferedReader( new InputStreamReader(
                ( conn.getInputStream() ) ) );
            String output, body = "";
            System.out.println( "Response Body .... " );

            while( ( output = br.readLine() ) != null )
            {
                body = body + output;
            }
            try
            {
                System.out.println(body);
                Object obj = new JSONParser().parse( body );
                JSONObject jo = (JSONObject) obj;
                List<Map<Object, Object>> content = (List<Map<Object, Object>>) jo.get( "content" );

                content.stream().forEach( mapsData -> {
                    mapsData.entrySet().forEach( mapData -> {
                        if( mapData.getKey().equals( "id" ) )
                        {
                            try
                            {
                                //Map<Object, Object> item = (Map<Object, Object>) mapData.getValue();
                                //String contentToAppend = item.get( "id" )+"\r\n";
                                String contentToAppend = mapData.getValue()+"\r\n";
                                Files.write(
                                    Paths.get(filename),
                                    contentToAppend.getBytes(),
                                    StandardOpenOption.CREATE,
                                    StandardOpenOption.APPEND);
                            }
                            catch( Exception pp )
                            {
                                pp.printStackTrace();
                            }
                        }
                    } );
                } );

            }
            catch( Exception e )
            {
                e.printStackTrace();
            }

            conn.disconnect();
        }
        catch( MalformedURLException e )
        {
            e.printStackTrace();
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }

    }

}