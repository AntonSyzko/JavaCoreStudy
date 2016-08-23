package IO;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Admin on 17.08.2016.
 */
 class StudentForTextSort {

     String name;
     int mark;
    public StudentForTextSort(String name, int mark)
    {
        this.name = name;

        this.mark = mark;
    }
}
class StudentNameComparator  implements Comparator<StudentForTextSort>{

    @Override
    public int compare(StudentForTextSort st1, StudentForTextSort st2) {
        return st1.name.compareTo(st2.name) ;
    }
}
class StudentMarkComparartor implements Comparator<StudentForTextSort>{

    @Override
    public int compare(StudentForTextSort o1, StudentForTextSort o2) {
        return o2.mark - o1.mark;
    }
}

public class SortTextWithTwoColumns {


    public static void main(String[] args) {

        try{
            BufferedReader br = new BufferedReader(new FileReader("D:\\IdeaProjects\\Random\\src\\IO\\studiksUnsorted"));
            ArrayList<StudentForTextSort> listOfStuds = new ArrayList<StudentForTextSort>();
            String currentLine = br.readLine();
            while (currentLine != null){
                String[] studUnit = currentLine.split(" ");
                String studName = studUnit[0];
                int mark = Integer.valueOf(studUnit[1]);
                listOfStuds.add(new StudentForTextSort(studName,mark));
                currentLine = br.readLine();
            }
            Collections.sort(listOfStuds, new StudentMarkComparartor());
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\IdeaProjects\\Random\\src\\IO\\StudiksSorted"));
            for(StudentForTextSort each : listOfStuds){
                bw.write(each.name);
                bw.write(" "+each.mark);
                bw.newLine();
            }
            br.close();
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        }
    }
