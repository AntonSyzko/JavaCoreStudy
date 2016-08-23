package Porcesses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Admin on 19.07.2016.
 */
public class ShellCall {

    public static void main(String[] args) throws IOException {
        Process proc = null;
        try {
            proc = Runtime.getRuntime().exec("tasklist.exe");
            InputStream inputstream = proc.getInputStream();
            InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
            BufferedReader bufferedreader = new BufferedReader(inputstreamreader);
            String line;
            while ((line = bufferedreader.readLine()) != null) {
                System.out.println("line = " + line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
