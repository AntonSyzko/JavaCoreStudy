package StringsExercises;

/**
 * Created by Admin on 11.08.2016.
 */
public class Reversions {

    public static void main(String[] args) {
        String input = "God, let me know are You with me ?";
        String reversed = reversRecursively(input);
        System.out.println(reversed);
        String revByChararay = reverseArray(input);
        System.out.println(revByChararay);
    }


    public static String reversRecursively(String input){
        if((null == input) || (input.length()<=1)){
            return input;
        }

        return reversRecursively(input.substring(1))+ input.charAt(0);
    }

    public static String reverseArray(String input){
        char[]chAraray  = input.toCharArray();

        StringBuilder sb = new StringBuilder(input.length());
        for(int i = chAraray.length-1; i>=0; i--){
            sb.append(chAraray[i]);
        }

        return sb.toString();
    }
}
