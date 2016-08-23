package JSON_MY.Jackson;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * Created by Admin on 23.08.2016.
 */
public class JacksonTest
{

    public static void main(String[] args) {

        PersonagForJackson persona = new PersonagForJackson();
        ObjectMapper mapperObj = new ObjectMapper();
        try{
            String jsonPersonage = mapperObj.writerWithDefaultPrettyPrinter().writeValueAsString(persona);
            System.out.println(jsonPersonage);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("***************** reading  ********************");
        try{
            //json  or   text format files
            File jsonInput = new File("D:\\IdeaProjects\\Random\\src\\JSON_MY\\Jackson\\jsonInputAsJsonFormat.json");
            PersonagForJackson personageFromJson = mapperObj.readValue(jsonInput, PersonagForJackson.class);
            System.out.println(personageFromJson);
        }catch (IOException e){
            e.getCause();
        }



    }
}
