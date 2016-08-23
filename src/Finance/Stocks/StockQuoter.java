package Finance.Stocks;

/**
 * Created by Admin on 11.07.2016.
 */

/**
 * Created by Admin on 11.07.2016.
 *
 *  Retrieve stock quotes using YQL
 * http://developer.yahoo.com/yql
 *
 */
import java.net.URLEncoder;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;


public class StockQuoter {

    //"http://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20yahoo.finance.quotes%20where%20symbol%20in%20(%22YHOO%22%2C%22AAPL%22%2C%22GOOG%22%2C%22MSFT%22)&format=json&diagnostics=true&env=http%3A%2F%2Fdatatables.org%2Falltables.env&callback=cbfunc"

    /**
     * @param symbol the stock ticker symbol; eg: GOOG, AAPL, or QCOM
     * @author urbain, hornick
     * Retrieve stock quotes using YQL
     * @returns JSON string of stock information
     */
    public static String getStockQuote(String symbol) throws Exception {

        // Sanity check
        if (symbol == null || symbol.isEmpty()) {
            throw new Exception("null or empty symbol");
        }

        // Formulate the YQL query string incorporating the ticker symbol
        String stockString = "\"" + symbol.toUpperCase() + "\"";
        String yql = "http://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20yahoo.finance.quotes%20where%20symbol%20in%20(" +
                URLEncoder.encode(stockString, "UTF-8") +
                ")&format=json&diagnostics=true&env=http%3A%2F%2Fdatatables.org%2Falltables.env";


        // Form the HTTP request to Yahoo
        HttpTransport httpTransport = new NetHttpTransport();
        HttpRequestFactory requestFactory = httpTransport.createRequestFactory();
        JSONParser parser = new JSONParser();
        GenericUrl url = new GenericUrl(yql);
        HttpRequest request = requestFactory.buildGetRequest(url);
        HttpResponse httpResponse = request.execute();
        String httpResponseString = httpResponse.parseAsString();
        //System.out.println( "HTTP Response String: " + httpResponseString );

        JSONObject jsonObject = (JSONObject) parser.parse(httpResponseString);
        //System.out.println("JSON Object: " + jsonObject);

        JSONObject query = (JSONObject) jsonObject.get("query");
        //System.out.println("Query: " + query);
        JSONObject results = (JSONObject) query.get("results");
        //System.out.println("Results: " + results);

        return results.toJSONString();
    }

    /**
     * This is a very simple test harness for calling the above method
     *
     * @param args
     */
    public static void main(String[] args) throws Exception {
        String quoteApple = StockQuoter.getStockQuote("AAPL");
        String quoteGoogle = StockQuoter.getStockQuote("GOOG");

        String quoteYHOO = StockQuoter.getStockQuote("YHOO");
        String quoteMSFT = StockQuoter.getStockQuote("MSFT");

        System.out.println("Quote for Apple: " + quoteApple);
        System.out.println("for Google" + quoteGoogle);
    }
}
