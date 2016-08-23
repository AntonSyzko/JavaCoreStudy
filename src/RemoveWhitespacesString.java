/**
 * Created by Admin on 25.06.2016.
 * Write a java program to remove all white spaces from a string.?
 */
public class RemoveWhitespacesString {
    public static void main(String[] args) {
        String withoutSpaces = removeReplaceAll("as as as");
        String withoutspaces2 = replace2("dfg fdg \t dfgdgf    dfg");
        System.out.println(withoutspaces2);
    }

    public static String removeReplaceAll(String input){
        String res = null;
        res = input.replaceAll("/s","");
        return res;
    }

    public static String replace2(String input){
        char[] array = input.toCharArray();
        StringBuffer stb = new StringBuffer();
        for(int i = 0; i<array.length;i++){
            if((array[i]!=' ')&& (array[i]!='\t')){
                stb.append(array[i]);
            }
        }

        return stb.toString();
    }
}
