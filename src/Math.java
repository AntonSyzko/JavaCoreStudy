/**
 * Created by Admin on 14.07.2016.
 * Напишите метод, который будет подсчитывать количество цифр «2», используемых в записи чисел от 0 до n (включительно)
 */
public class Math {
    public static void main(String[] args) {


        int res = countTwosInrange(20);
        System.out.println(" there are " + res + " number two in 10");

        int res2 = count2sInRange(20);
        System.out.println(res2);
    }

    public  static int countNumsOfTwoInASingleNumber(int input){

        int copy = input;
        int count = 0;
        while (copy>0){
            if((copy %10)==2){
                count ++;
            }
            copy = copy/10;
        }


        return count;
    }


    public  static int countTwosInrange(int till){
            int count = 0;
        for(int i = 2; i<till; i++){
            count += countNumsOfTwoInASingleNumber(i);
        }


        return count;
    }


    public static int count2sInRangeAtDigit(int number, int d) {
        int powerOf10 = (int) java.lang.Math.pow(10, d);
        int nextPowerOf10 = powerOf10 * 10;
        int right = number % powerOf10;

        int roundDown = number - number % nextPowerOf10;
        int roundUp = roundDown + nextPowerOf10;

        int digit = (number / powerOf10) % 10;
        if (digit < 2) { // если digit меньше 2
            return roundDown / 10;
        } else if (digit == 2) {
            return roundDown / 10 + right + 1;
        } else {
            return roundUp / 10;
        }
    }

    public static int count2sInRange(int number) {
        int count = 0;
        int len = String.valueOf(number).length();
        for (int digit = 0; digit < len; digit++) {
            count += count2sInRangeAtDigit(number, digit);
        }
        return count;
    }
}
