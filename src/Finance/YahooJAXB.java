package Finance;

import javax.xml.bind.JAXBContext;

/**
 * Created by Admin on 04.07.2016.
 */



import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.xml.sax.InputSource;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
public class YahooJAXB {


    public static void main(String[] args) throws Exception {
//        String request = "http://query.yahooapis.com/v1/public/yql?format=json&q=select%20*%20from%20yahoo.finance.xchange%20where%20pair%20in%20(\"USDEUR\",%20\"USDJPY\",%20\"GBPUSD\")&env=store://datatables.org/alltableswithkeys";
//        String request = "http://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20yahoo.finance.xchange%20where%20pair%20in%20(%22EURUSD%22%2C%22GBPUSD%22)&diagnostics=true&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys ";
        String request = "https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20yahoo.finance.xchange%20where%20pair%20in%20(%22EURUSD%22%2C%22GBPUSD%22)&format=json&diagnostics=true&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys&callback=";
        //String request = "http://finance.yahoo.com/connection/currency-converter-cache?date=20140102";
        String result = performRequest(request);
        System.out.println(result);
        Gson gson = (new GsonBuilder()).create();
        JSON json = (JSON)gson.fromJson(result, JSON.class);
        Rate[] var5 = json.query.results.rate;
        int var6 = var5.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            Rate rate = var5[var7];
            System.out.println(rate.id + " = " + rate.Rate);
        }

        System.out.println("JSON: \n\t" + gson.toJson(json));
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
