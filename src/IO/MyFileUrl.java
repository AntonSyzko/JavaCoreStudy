package IO;

import java.io.File;

/**
 * Created by Admin on 14.08.2016.
 */
public class MyFileUrl {

    public static void main(String a[]){
        File f = new File("D:\\IdeaProjects\\Random\\src\\IO\\forMaxWordCount.txt");
        System.out.println(f.toURI());
    }
}
