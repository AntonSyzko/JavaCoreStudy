package TrickyMathTasks;

/**
 * Created by Admin on 25.07.2016.
 */
public class ArithmenticsUsingOnlyPlus {

    public static void main(String[] args) {
    int subtraction = subtract(5,3);
        System.out.println(subtraction);
        int mult = multiply(2,5);
        System.out.println("mult 2 * 5 " + mult);
    }

    //to return as multiplied by -1
    //Отрицательное значение k получается суммированием k раз числа -1.
    public  static int negate(int a){
     int neg = 0;

        // if a is less than zero - than on contrary - multiply by 1 - to get the minus
         int d = a<0? 1 : -1;
        while (a!=0){

            neg+=d;//adds -1( or 1 accordingly )  each time
            a=a+d;//a+=d;
        }
        return neg;
    }

  //  a - b = a +(-1)*b
    public  static int  subtract(int a, int b){
        int res = a + negate(b);

        return res;
    }








    public  static int multiply(int a, int b){

        if(a<b){
            return multiply(b,a);
        }

        int sum = 0;
        for(int i = abs(b);i>0;i--){
            sum+=a;
        }
        if(b<0){
            sum = negate(sum);
        }

        return sum;

    }

    public  static int abs(int a){
        if(a<0){
            return negate(a);
        }else {
            return a;
        }
    }
}
