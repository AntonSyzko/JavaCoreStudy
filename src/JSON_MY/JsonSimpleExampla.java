package JSON_MY;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Admin on 26.07.2016.
 */
public class JsonSimpleExampla {

    public static void main(String[] args) {
        JSONObject myJSObja = new JSONObject();
        myJSObja.put("A","AContecnt");
        myJSObja.put("B","BContent");
        JSONArray jsarra = new JSONArray();
        jsarra.add("Comp : FB");
        jsarra.add("Comp : APPLE");
        myJSObja.put("Companies",jsarra);

  try(FileWriter file = new FileWriter("D:\\IdeaProjects\\Random\\src\\JSON_MY\\a.json")){
      file.write(myJSObja.toJSONString());
      System.out.println(" succesfully wrote json obja");
      System.out.println(" json obj " + myJSObja);
  } catch (IOException e) {
      e.printStackTrace();
  }

    }
}
