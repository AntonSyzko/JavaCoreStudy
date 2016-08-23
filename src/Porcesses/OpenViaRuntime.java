package Porcesses;

import java.io.IOException;

/**
 * Created by Admin on 24.06.2016.
 */
public class OpenViaRuntime {
    public static void main(String[] args) throws InterruptedException {
        Runtime rtm = Runtime.getRuntime();
        String [] arr = {"C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe","http://javaconceptoftheday.com/"};
        String [] arr2 = {"C:\\Program Files (x86)\\Foxit PhantomPDF\\FoxitPhantomPDF.exe","D:\\dowloadshdd\\java-m3.pdf"};
        try {
            Process prc1 = rtm.exec("notepad C:\\Users\\Admin\\Desktop\\qwe.txt");
           Process prc2 = rtm.exec(arr);
            Process prc3 = rtm.exec(arr2);

            Thread.sleep(5000);

            prc1.destroy();
            prc2.destroy();
            prc3.destroy();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
