package JSON_MY.Jackson;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Admin on 23.08.2016.
 */
public class MapToJsonEx {


    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        Map<String,String> myMapa = new HashMap<String, String>();
        myMapa.put("A","AA");
        myMapa.put("B","BB");
        try{
            String jsonFromMap = mapper.writeValueAsString(myMapa);
            System.out.println(jsonFromMap);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
