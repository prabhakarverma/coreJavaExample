package api;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.List;
import java.util.Map;

public class read_json_id
{
    public static Object readJsonSimpleDemo(String filename) throws Exception {
        FileReader reader = new FileReader(filename);
        JSONParser jsonParser = new JSONParser();
        return jsonParser.parse(reader);
    }

    public static void main(String[] args) throws Exception {
        JSONObject jsonObject = (JSONObject) readJsonSimpleDemo("D:\\DATA_MIGRATION\\coreJavaExample\\src\\main\\java\\api\\data_sta.json");
        //System.out.println(jsonObject);




        System.out.println(jsonObject.get("content"));
        List<Map<Object, Object>> content = (List<Map<Object, Object>>) jsonObject.get("content");

        content.stream().forEach( mapsData -> {
            mapsData.entrySet().forEach( mapData -> {
                if(mapData.getKey().equals( "id" )){
                    System.out.println(mapData.getValue());
                }


            } );
        } );

    }
}
