package TrickyMathTasks;

import java.util.LongSummaryStatistics;

/**
 * Created by Admin on 18.07.2016.
 * Напишите программу, которая будет печатать числа Фибоначчи максимально долго (без ошибок времени выполнения)
 */
public class PrintFibonacciEternal {

    public static void main(String[] args) {
            printFibsForever();
           //fibRecursion(0,1);
    }

    public static void printFibsForever(){
        int a = 0;
        int b = 1;
        int sum = 0;
        System.out.print(a + " " + b + " ");
        while ((a + b ) < Long.MAX_VALUE){
            sum = a+b;
            System.out.println( sum  + " " );

            a=b;
            b=sum;
        }
    }

    public static void fibRecursion(int a , int b){
        int sum = a + b;
        System.out.println( sum);
        a = b;
        b = sum;
        if(Long.MAX_VALUE - a > b){
            fibRecursion(a,b);
        }
    }
}
