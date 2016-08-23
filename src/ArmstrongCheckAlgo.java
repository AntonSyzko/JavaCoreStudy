/**
 * Created by Admin on 27.06.2016.
 */
public class ArmstrongCheckAlgo {


    public static void main(String[] args) {
        int input = 153;
        int poweredsum = eachTopower(input);
        if(input == poweredsum){
            System.out.println("sim");
        }else{
            System.out.println("no");
        }

    }

    static int power(int input){
        int copyOfInp = input;
        int power = 0;

        while (copyOfInp >0){
            copyOfInp = copyOfInp/10;
            power ++;
        }

        return power;
    }

    static int totalSum ( int inp){

        int copy = inp;
        int sum = 0;
        while (copy != 0){
            int holder = copy%10;
            sum += holder;
            copy = copy/10;

        }
              return sum;
    }


    static int eachTopower (int inp){
        int copy = inp;

        int power = power(copy);
        int eachtopower = 0;

        while (copy != 0){
            int holder = copy%10;
            int holderinpower = (int)java.lang.Math.pow((double)holder,(double)power);
            eachtopower += holderinpower;
            copy = copy/10;

        }

        return eachtopower;
    }






}
