package JSON_MY.Jackson;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Admin on 23.08.2016.
 */
public class JsonToMapEx {


    public static void main(String[] args) {

            String jsonStr = "{\"name\":\"Anton Syzko\", \"job\":\"successfull and rich musician and innovator \"}";
            Map<String,String> resultMap = new HashMap<String,String>();
            ObjectMapper mapperObj = new ObjectMapper();

            System.out.println("Input Json: "+jsonStr);
            try {
                resultMap = mapperObj.readValue(jsonStr,
                        new TypeReference<HashMap<String,String>>(){});
                System.out.println("Output Map: "+resultMap);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

