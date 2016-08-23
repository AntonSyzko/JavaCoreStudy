/**
 * Created by Admin on 05.07.2016.
 */
public class PrimeSum {


    public static void main(String[] args) {
       int sumof1000 = sumOfprimes();

        System.out.println(sumof1000);

    }


    public static boolean isPrime(int num){

        for(int i = 2; i<num/2;i++){
            if((num % i)==0){
                 return false;
            }
        }

        return true;
    }


    static int sumOfprimes(){

        int sum = 0;
        int counter = 0;
        int number = 2;

        while (counter <1000){
            if(isPrime(number)){
                sum += number;
                counter++;
            }

            number++;
        }

        return sum;
    }
}
