package IO;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Admin on 17.08.2016.
 */
public class SortTextFile {


    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try{
            br = new BufferedReader(new FileReader("D:\\IdeaProjects\\Random\\src\\IO\\forMaxWordCount.txt"));
            ArrayList<String> lines = new ArrayList<String>();
            String line = br.readLine();
            while (line !=null){
                lines.add(line);
                line = br.readLine();
            }
            Collections.sort(lines);

            bw = new BufferedWriter(new FileWriter("D:\\IdeaProjects\\Random\\src\\IO\\SortedText"));

            for(String eachLine : lines){
                bw.write(eachLine);
                bw.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(br !=null){
                    br.close();
                }
                if(bw !=null){
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
