/**
 * Created by Admin on 30.06.2016.
 */
public class FibonacciSeries {
    public static void main(String[] args) {
//printFibonacci();
        fib2();
    }
    public static void printFibonacci(){

         int [] fib = new  int[7];
         fib [0] = 0;
         fib [1] = 1;
         for(int i = 2; i<fib.length; i++){
           fib[i] =   fib[i-1] + fib[i-2];
         }
        for(int j = 0; j < fib.length; j++){
            System.out.print( fib[ j ] + "  ");
        }
        }

    public static void fib2(){
        int current = 0;
        int next = 1;
        int sum = 0;
        int step = 7;

        while (step >0){
            sum = current + next;
            System.out.print(sum  + "  ");
            current = next;
            next = sum;
            step --;
        }
    }





    }

