import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by Admin on 01.07.2016.
 */
public class FindAllDistinctWordsFromFile {

    public static void main(String[] args) {

        String file = "D:\\IdeaProjects\\Random\\src\\distinctworlds.txt";
        List<String> res = findASllDist(file);
        Iterator<String> iter = res.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }


    static List<String> findASllDist(String fileNamefile){

      FileInputStream fis = null;
        DataInputStream dis = null;
        BufferedReader br = null;
        List<String> res = new ArrayList<String>();
        try{
            fis = new FileInputStream(fileNamefile);
            dis = new DataInputStream(fis);
            br = new BufferedReader(new InputStreamReader(dis));
            String bufferLine = null;
            while((bufferLine = br.readLine())!=null){
                StringTokenizer tok = new StringTokenizer(bufferLine," '\".,;:/");
                while (tok.hasMoreTokens()){
                    String toPass = tok.nextToken();
                    if(!res.contains(tok)){
                        res.add(toPass);
                    }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(br != null){
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
            return res;
    }
}
