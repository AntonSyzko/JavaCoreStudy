package Recursion;

/**
 * Created by Admin on 06.07.2016.
 */
public class ReverseStringRecursively {

    public static void main(String[] args) {
       String a = " ABC";
        String reversed = reverseRecursion(a);
        System.out.println(reversed);
    }


    public static String reverseRecursion(String input){
        String res = "";
        if(input.length()==1){
            return input;
        }else{
            res += input.charAt(input.length()-1) +  reverseRecursion(input.substring(0,input.length()-1));
        }
                    return res;
    }
}
