package Finance.Stocks;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by Admin on 12.07.2016.
 */
public class YahooStockXML {

    public static void main(String[] args) throws Exception {
//        String request = "http://query.yahooapis.com/v1/public/yql?format=xml&q=select%20*%20from%20" +
//                "yahoo.finance.xchange%20where%20pair%20in%20(\"USDEUR\",%20\"USDUAH\")&env=store://datatables.org/alltableswithkeys";

        String request = "https://query.yahooapis.com/v1/yql?q=select%20*%20from%20"+
                "yahoo.finance.quotes%20where%20symbol%20in%20(%22YHOO%22%2C%22AAPL%22%2C%22GOOG%22%2C%22MSFT%22)%20%0A&diagnostics=true\n";//\n

        try {

            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            URL url = new URL(request);
            InputStream stream = url.openStream();

            Document document = documentBuilder.parse(stream);

            Element root = document.getDocumentElement();
            NodeList nodeList = root.getElementsByTagName("quote");

            System.out.println("Read XML: " + " Root element:" + root.getNodeName() + " Lenght:" + nodeList.getLength());
            System.out.println("----------------------");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Element element = (Element) nodeList.item(i);

                System.out.println("Quote №:" + i);

                System.out.println("Symbol: " + element.getElementsByTagName("Symbol").item(0)
                        .getChildNodes().item(0).getNodeValue());


                System.out.println("Ask: " + element.getElementsByTagName("Ask").item(0)
                        .getChildNodes().item(0).getNodeValue());

                System.out.println("Bid: " + element.getElementsByTagName("Bid").item(0)
                        .getChildNodes().item(0).getNodeValue());

                System.out.println("----------------------");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
