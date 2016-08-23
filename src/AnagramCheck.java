import java.util.Arrays;

/**
 * Created by Admin on 28.06.2016.
 */
public class AnagramCheck {

    public static void main(String[] args) {
       String one = "keep";
        String two = "peek";
        boolean res = anagramOneCheck(one,two);
        System.out.println(res);
    }

    static boolean anagramOneCheck(String one, String two){
        boolean res = false;
        String copyone = one.replaceAll("\\s","");
        String copytwo = two.replaceAll("\\s","");
        if(copyone.length()!=copytwo.length()){
            res = false;

        }else{
            char[]oneaschars = copyone.toCharArray();
            char[] twoaschars = copytwo.toCharArray();
            Arrays.sort(oneaschars);
            Arrays.sort(twoaschars);
           res = Arrays.equals(oneaschars,twoaschars);
        }



        return res;
    }
}
