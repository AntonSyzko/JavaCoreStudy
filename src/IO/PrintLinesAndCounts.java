package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Admin on 26.07.2016.
 */
public class PrintLinesAndCounts {

    public static void main(String[] args) {

        printLinesAndCountAll("D:\\IdeaProjects\\Random\\src\\IO\\forMaxWordCount.txt");
    }

    public static void  printLinesAndCountAll(String fileName){
        BufferedReader br = null;
        int countChars = 0;
        int countLines = 0;
        int countWords = 0;
        String singleLine;

        try{
            br = new BufferedReader(new FileReader(fileName));

            while ((singleLine = br.readLine())!=null){

                countLines++;

                String[]words = singleLine.replaceAll("\\s+"," ").split(" ");
                for(String each : words){
                    countChars +=each.length();
                }

                countWords += words.length;
            }

            System.out.println(" lines " + countLines + " words " + countWords + " chars " + countChars);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
