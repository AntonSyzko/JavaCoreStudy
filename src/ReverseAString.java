/**
 * Created by Admin on 24.06.2016.
 */
public class ReverseAString {
    public static void main(String[] args) {

        //String ans1 = reverseBuf("java");
       // System.out.println(ans1);
        //reverseChar("java");
        String recursive = recursiveMethod("java");
        System.out.println(recursive);
    }

    public  static  String reverseBuf(String input){
        String result = null;
        StringBuffer resbuf = new StringBuffer(input);
        result = String.valueOf(resbuf.reverse());
        return result;
    }


    public static void reverseChar(String input){
        char[] asCharArray = input.toCharArray();
        for(int i = asCharArray.length-1;i>=0;i--){
            System.out.print(asCharArray[i]);
        }
    }


    static String recursiveMethod(String str)
    {
        if ((null == str) || (str.length() <= 1))
        {
            return str;
        }

        return recursiveMethod(str.substring(1)) + str.charAt(0);
    }
}
