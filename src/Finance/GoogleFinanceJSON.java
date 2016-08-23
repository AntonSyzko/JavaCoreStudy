package Finance;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Admin on 10.07.2016.
 */

//// [ { "id": "694653" ,"t" : "GOOGL" ,"e" : "NASDAQ" ,"l" : "717.78" ,"l_fix" : "717.78" ,"l_cur" : "717.78" ,"s": "0" ,"ltt":"4:00PM EDT" ,"lt" : "Jul 8, 4:00PM EDT" ,"lt_dts" : "2016-07-08T16:00:01Z" ,"c" : "+10.52" ,"c_fix" : "10.52" ,"cp" : "1.49" ,"cp_fix" : "1.49" ,"ccol" : "chg" ,"pcls_fix" : "707.26" } ]
public class GoogleFinanceJSON {
    public static void main(String[] args) throws Exception {

//        String request = "http://finance.google.com/finance/info?client=ig&q=NASDAQ:GOOGL";
//        String result = performRequest(request);
       String input = "//[ { \"id\": \"694653\" ,\"t\" : \"GOOGL\" ,\"e\" : \"NASDAQ\" ,\"l\" : \"717.78\" ,\"l_fix\" : \"717.78\" ,\"l_cur\" : \"717.78\" ,\"s\": \"0\" ,\"ltt\":\"4:00PM EDT\" ,\"lt\" : \"Jul 8, 4:00PM EDT\" ,\"lt_dts\" : \"2016-07-08T16:00:01Z\" ,\"c\" : \"+10.52\" ,\"c_fix\" : \"10.52\" ,\"cp\" : \"1.49\" ,\"cp_fix\" : \"1.49\" ,\"ccol\" : \"chg\" ,\"pcls_fix\" : \"707.26\" } ]";
        JsonParser parser = new JsonParser();
        JsonObject mainObject = parser.parse(input).getAsJsonObject();

        JsonArray pItem = mainObject.getAsJsonArray("t");
        for (JsonElement user : pItem) {
            JsonObject userObject = user.getAsJsonObject();
            if (userObject.get("id").getAsInt() == 694653) {
                System.out.println(userObject.get("e"));
                return;
            }
        }

    }

    private static String performRequest(String urlStr) throws IOException {
        URL url = new URL(urlStr);
        StringBuilder sb = new StringBuilder();
        HttpURLConnection http = (HttpURLConnection)url.openConnection();

        try {
            BufferedReader a = new BufferedReader(new InputStreamReader(http.getInputStream()));
            char[] buf = new char[1000000];
            boolean r = false;

            int r1;
            do {
                if((r1 = a.read(buf)) > 0) {
                    sb.append(new String(buf, 0, r1));
                }
            } while(r1 > 0);
        } finally {
            http.disconnect();
        }

        int[][] a1 = new int[4][5];
        return sb.toString();
    }
}
