package IOFileSystemOperas;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 18.07.2016.
 */
public class SearchFileRecursion {
    private static List<String> result = new ArrayList<>();
    private static String filenameToSearch;


    public static String getFilenameToSearch(){
        return filenameToSearch;
    }

    public  List<String> getResult(){

        return result;
    }
    public void setFilenameToSearch(String fileName){
        this.filenameToSearch = fileName;
    }
    public static void main(String[] args) {
        System.out.println(findFile(new File("D:\\IdeaProjects\\Random"), "test2.txt", new ArrayList<String>()));
    }

    public static List<String> findFile(File dir, String fileName, ArrayList<String> list) {
        File file = new File(dir.getAbsolutePath() + "//" + fileName);

        if (file.isFile() && file.exists()) {
            list.add(file.getAbsolutePath());
        }
        File[] files = dir.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                findFile(f, fileName,list);
            }
        }
        return list;
    }

}
