package StringsExercises;

/**
 * Created by Admin on 18.07.2016.
 */
public class RemoveWhitespaces {

    public static void main(String[] args) {


        String a = "qwe dfg vbn   u y t    ";
        String res1 = removeWhitespacesReplace(a);
        System.out.println(res1);
        String res2 = removeWhitespaces(a);
        System.out.println(res2);
    }

    public static String removeWhitespacesReplace(String input){

        String res = input.replaceAll("\\s","");
        return res;
    }

    public static String removeWhitespaces(String input){
         StringBuffer sb = new StringBuffer();
        for(int i = 0; i<input.length(); i++){
            if(!Character.isWhitespace(input.charAt(i))){
                sb.append(input.charAt(i));
            }
        }

        return sb.toString();

    }
}
