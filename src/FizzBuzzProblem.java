import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

/**
 * Created by Admin on 24.06.2016.
 *
 * Write a program in java which prints the numbers from 1 to 100. But,
 * multiples of 3 should be replaced with “Fizz”, multiples of 5 should be replaced with “Buzz”
 * and multiples of both 3 and 5 should be replaced with “FizzBuzz”?
 */
public class FizzBuzzProblem {
    public static void main(String[] args) {

        //fizbuzz();
        //nearestTo100(25,36);
        //isBiggerThan(41,40);
        //printFormatted("java");
        //openNotepad();
        printFprmattedDate(new Date("12/12/2012"));
    }

    public static void fizbuzz() {

       for(int i = 0; i<=100; i++){
           if((i%3)==0){
               System.out.println("fizz");
           }else if ((i%5)==0){
               System.out.println("buzz");

           } if((i % (3*5)) == 0){
               System.out.println("fizzbuzz");
           }else{
               System.out.println(i);
           }
       }


    }


    public static void nearestTo100(int a, int b){
        int diff1 = java.lang.Math.abs(100 - a);
        int diff2 = java.lang.Math.abs(100 - b);
        if(diff1>diff2){
            System.out.println(b  + " is closer to 100");
        }else if(diff1<diff2){
            System.out.println(a + "is closer to 100");
        }else {
            System.out.println(a + " = " + b);
        }
    }

    /*
    There are two numbers ‘a’ and ‘b’. Write a java program which should print ‘a’ if ‘a’
    is bigger than ‘b’ by 2 or more or should print ‘b’ if ‘b’ is bigger than ‘a’ by 2 or more
    . Otherwise, it should print “INCONCLUSIVE”?
     */
    public  static void isBiggerThan(int a, int b){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First number");

        a = sc.nextInt();

        System.out.println("Enter Second Number");

         b = sc.nextInt();

        if((a > b) && (a - b) >= 2)
        {
            System.out.println(a);
        }
        else if ((b > a) && (b - a) >=2)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println("INCONCLUSIVE");
        }
    }
    /*
    Given a string “JAVAJ2EE”, write java program to print this string in the below format?
     */
    public static void printFormatted(String input){
        char [] strasRray = input.toCharArray();
        for(int i = 0; i<strasRray.length; i++){
            for(int j = 0; j <=i;j++){
                System.out.print(strasRray[j]);
            }
            System.out.println();
        }
    }


    /*
    How do you prove that String s1 = new String(“ONE”) and String s2 = “ONE” are two different objects in the memory?
     */
    public static void proovequality(){
        String a = new String("one");
        String b= "one";
        System.out.println(a==b);
    }


    public  static void openNotepad(){
        try {
            Runtime.getRuntime().exec("notepad.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    Write a Java program to print the current date in “dd MMM yyyy” format?
     */

    public static  void printFprmattedDate(Date d){

        SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy") ;
        System.out.println(format.format(d));


    }
}




