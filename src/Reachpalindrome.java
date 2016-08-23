/**
 * Created by Admin on 25.06.2016.
 * Take number from the user, reverse it and add it to itself. If the sum is not a palindrome then repeat the procedure until you get a palindrome.
 */
public class Reachpalindrome {

    public static void main(String[] args) {

     reverseAndadd(12381);
    }

    public static boolean isPalindrome(int number) {

        int copy = number;
        int reversed = 0;

        while (copy != 0 ){
            int remainder = copy% 10;
            reversed = reversed *10 + remainder;
            copy = copy / 10;
        }

        if( number == reversed){
            return  true;
        }
        return false;
    }

    public static  int reverseNumber(int input){
        int copy = input;
        int reversed = 0;
        while (copy != 0){
            int remainder = copy % 10;
            reversed = reversed *10 + remainder;
            copy /= 10;
        }

        return  reversed;
    }

    static  boolean checkPalindrome(int input){
       int reversed = reverseNumber(input);

        if(input == reversed){
            return true;
        }else{
            return false;
        }
    }





    static void reverseAndadd(int input){
        if(checkPalindrome(input)){
            System.out.println(" number is already a palindome");
        }else{
            while (!checkPalindrome( input)){
                int reverse = reverseNumber(input);
                int sum = input + reverse;
                System.out.println(input + " + " + reverse + " = " + sum);
                input = sum;
            }
        }
    }


}
