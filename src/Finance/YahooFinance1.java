package Finance;

/**
 * Created by Admin on 04.07.2016.
 */


import org.w3c.dom.Document;
        import org.w3c.dom.Element;
        import org.w3c.dom.NodeList;
        import javax.xml.parsers.DocumentBuilder;
        import javax.xml.parsers.DocumentBuilderFactory;
        import java.io.*;
        import java.net.URL;
public class YahooFinance1 {


    public static void main(String[] args) throws Exception {
        String request = "http://query.yahooapis.com/v1/public/yql?format=xml&q=select%20*%20from%20" +
                "yahoo.finance.xchange%20where%20pair%20in%20(\"USDEUR\",%20\"USDUAH\")&env=store://datatables.org/alltableswithkeys";

        try {

            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            URL url = new URL(request);
            InputStream stream = url.openStream();

            Document document = documentBuilder.parse(stream);

            Element root = document.getDocumentElement();
            NodeList nodeList = root.getElementsByTagName("rate");

            System.out.println("Read XML: " + " Root element:" + root.getNodeName() + " Lenght:" + nodeList.getLength());
            System.out.println("----------------------");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Element element = (Element) nodeList.item(i);

                System.out.println("Rate №:" + i);

                System.out.println("Name: " + element.getElementsByTagName("Name").item(0)
                        .getChildNodes().item(0).getNodeValue());

                System.out.println("Rate: " + element.getElementsByTagName("Rate").item(0)
                        .getChildNodes().item(0).getNodeValue());

                System.out.println("Date: " + element.getElementsByTagName("Date").item(0)
                        .getChildNodes().item(0).getNodeValue());

                System.out.println("Time: " + element.getElementsByTagName("Time").item(0)
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
