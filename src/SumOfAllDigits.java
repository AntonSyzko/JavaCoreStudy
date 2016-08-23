/**
 * Created by Admin on 29.06.2016.
 */
public class SumOfAllDigits {
    public static void main(String[] args) {
        int sum = sumOfAll(123);
        System.out.println(sum);
        int sumRec = sumRecursive(123);
        System.out.println("Recursive " + sumRec);
    }

    static int sumOfAll(int a){
       int sum = 0;
        int copy = a;
        while (copy > 0){
            int current = copy%10;
            sum += current;
            copy = copy/10;
        }

        return sum;
    }


    static int sumRecursive(int number){
        int sum = 0;
        if(number == 0){
            return sum;
        }else{
            sum = number%10;
            return sum + sumRecursive(number/10);
        }


    }
}
