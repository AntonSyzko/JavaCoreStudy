package IO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 05.07.2016.
 */
public class MaxWordsCount {

    private int maxCount = 0;
    private List<String> lines = new ArrayList<String>();

    public int getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }

    public List<String> getLines() {
        return lines;
    }

    public void setLines(List<String> lines) {
        this.lines = lines;
    }

    public static void main(String[] args) {

        MaxWordsCount mx = new MaxWordsCount();
        String file = "D:\\IdeaProjects\\Random\\src\\IO\\forMaxWordCount.txt";
        mx.calculateMaxWordCount(file);
        System.out.println("words in maxLine "  + mx.getMaxCount());



        System.out.println("line with max words is ");

        List<String> list = mx.getLines();
        for(String each : list){
            System.out.println(each.toString());
        }


    }

    public  void calculateMaxWordCount(String fileName){
        FileInputStream fis = null;
        DataInputStream dis = null;
        BufferedReader br = null;

        try{
            fis = new FileInputStream(fileName);
            dis = new DataInputStream(fis);
            br = new BufferedReader(new InputStreamReader(dis));
            String line = null;

            while ((line = br.readLine())!= null){

                int currCount = line.split("\\s+").length;
                if(currCount>maxCount){
                    lines.clear();
                    lines.add(line);
                    maxCount = currCount;

                }else if(currCount == maxCount){
                    lines.add(line);
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {


            if((br != null)){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }





}
