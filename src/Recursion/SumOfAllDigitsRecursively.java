package Recursion;

/**
 * Created by Admin on 17.08.2016.
 */
public class SumOfAllDigitsRecursively {

    //Initializing sum to 0

    int sum = 0;

    //Recursive function to calculate sum of all digits of a number

    int sumOfAllDigits(int inputNumber)
    {
        if(inputNumber == 0)
        {
            //if input number is 0, returning sum

            return sum;
        }
        else
        {
            //Getting last digit of input number

            int lastDigit = inputNumber%10;

            //Adding last digit to sum

            sum = sum + lastDigit;

            //Removing last digit from input number

            inputNumber = inputNumber/10;

            //Calling the function recursively

            sumOfAllDigits(inputNumber);
        }

        return sum;
    }

    public static void main(String[] args)
    {
        SumOfAllDigitsRecursively mainClass = new SumOfAllDigitsRecursively();

        System.out.println(mainClass.sumOfAllDigits(123));
    }
}
