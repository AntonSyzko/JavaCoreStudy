package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

/**
 * Created by Admin on 14.08.2016.
 */
public class MyPropertyFileStore {

    public static void main(String a[]) throws IOException {

        OutputStream os = null;
        Properties prop = new Properties();
        prop.setProperty("name", "java2novice");
        prop.setProperty("domain", "www.java2novice.com");
        prop.setProperty("email", "java2novice@gmail.com");
        try {
            os = new FileOutputStream("MyProp.properties");
            prop.store(os, "Dynamic Property File");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
