package MultiThreading;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Admin on 26.07.2016.
 */
public class ExecutorsServiceExampla {

    private static final int MYTHTREADS = 30;

    public static void main(String[] args) {
        ExecutorService exservice = Executors.newFixedThreadPool(MYTHTREADS);
        String[] hostList =
                { "http://crunchify.com", "http://yahoo.com",
                        "http://www.ebay.com", "http://google.com",
                        "http://www.example.co", "https://paypal.com",
                        "http://bing.com/", "http://techcrunch.com/",
                        "http://mashable.com/", "http://thenextweb.com/",
                        "http://wordpress.com/", "http://wordpress.org/",
                        "http://example.com/", "http://sjsu.edu/",
                        "http://ebay.co.uk/", "http://google.co.uk/",
                        "http://www.wikipedia.org/",
                        "http://en.wikipedia.org/wiki/Main_Page" };


for(int i = 0; i<hostList.length; i++){
    String theVeryUrla = hostList[i];
    Runnable worler =  new MyRunnable(theVeryUrla);
    exservice.execute(worler);

}
exservice.shutdown();
        while (!exservice.isTerminated()){

        }
        System.out.println(" finished work ");
    }





    public static class MyRunnable implements Runnable{

        private final String url;

        public MyRunnable(String url){
            this.url = url;
        }

        @Override
        public void run(){
             String result = "";
             int code  = 200;

            try{
                URL siteURLa = new URL(url);
                HttpURLConnection conn = (HttpURLConnection) siteURLa.openConnection();
                conn.setRequestMethod("GET");
                conn.connect();
                code = conn.getResponseCode();

                if(code == 200){
                    result="green \t";
                }

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }catch (Exception e){
                result = "->red<-\t";
            }
            System.out.println(url + "  status "+result);
        }
    }
}


