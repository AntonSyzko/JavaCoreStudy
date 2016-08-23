package Finance;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 10.07.2016.
 */
public class YahooStockJAXB {


    public static void main(String[] args) throws Exception {
        String request = "https://developer.yahoo.com/yql/console/?q=show%20tables&env=store://datatables.org/alltableswithkeys#h=select+*+from+yahoo.finance.quotes+where+symbol+in+(%22YHOO%22%2C%22AAPL%22%2C%22GOOG%22%2C%22MSFT%22)+%0A\n";
        String result = performRequest(request);
        System.out.println(result);
        Gson gson = (new GsonBuilder()).create();
        JSONStock jsonstk = (JSONStock)gson.fromJson(result, JSONStock.class);
        Quote[] quotes = jsonstk.queryStock.resultsStock.quote;
        int var6 = quotes.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            Quote qt = quotes[var7];
            System.out.println(qt.symbol + " = " + qt.Name + "  " + qt.Ask + " " + qt.Bid);
        }

        System.out.println("JSON: \n\t" + gson.toJson(jsonstk));
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
