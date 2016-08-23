/**
 * Created by Admin on 06.07.2016.
 */
public class PrimeCheck {

    public static void main(String[] args) {

        boolean res = isPrime(9);
        System.out.println(res);
    }

    public static boolean isPrime(int num) {


        for (int i = 2; i < num / 2; i++) {
            if ((num % i) == 0) {
                return false;
            }

        }

        return true;

    }

}
