package IOFileSystemOperas;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Admin on 18.07.2016.
 */
public class SearchFileInDirectory {


    private static List<String> result = new ArrayList<>();

    private static String filenameToSearch;

    public SearchFileInDirectory() {
    }

    public static String getFilenameToSearch(){

        return filenameToSearch;
    }

    public  List<String> getResult()
    {
        return result;
    }

    public void setFilenameToSearch(String fileName){
        this.filenameToSearch = fileName;
    }

    public static void searchFile(File fileName){


        if(fileName.isDirectory()){
            System.out.println(" searching file in " + fileName.getAbsoluteFile());
            if(fileName.canRead()){
                for(File each : fileName.listFiles()){
                    if(each.isDirectory()){
                        searchFile(each);
                    }else{
                        if(getFilenameToSearch().equals(each.getName().toLowerCase())){
                            result.add(each.getAbsoluteFile().toString());
                        }
                    }
                }
            }else {
                System.out.println(fileName.getAbsoluteFile() + " permission denied ");
            }
        }
    }

    public static void searchDirectory(File file, String fileName){
        if(file.isDirectory()){
            searchFile(file);
        }else {
            System.out.println(fileName + " is not a directory ");
        }
    }


    public  static void  inputVars(){
        System.out.println("Enter the path from start search:");
        Scanner in = new Scanner(System.in);
        String inPath = in.nextLine();
        System.out.println("Enter the file name:");
        String inName = in.nextLine();

         searchDirectory(new File(inPath),inName);
         int count = result.size();
        if(count==0){
            System.out.println(" no results ");
        }else{
            System.out.println(" have  found " + count + " results \n");

            for(String eachFile : result){
                System.out.println("found " + eachFile.toString());
            }
        }
    }

    public static void main(String[] args) {

        SearchFileInDirectory sfid = new SearchFileInDirectory();
        inputVars();
        searchDirectory(new File("D:\\IdeaProjects\\Random\\src\\IO"),"D:\\IdeaProjects\\Random\\src\\IOFileSystemOperas\\testIOFile.txt");
    }



}
