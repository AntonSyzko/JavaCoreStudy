/**
 * Created by Admin on 28.06.2016.
 */
public class PerfectNumberOrNot {
    public static void main(String[] args) {

        boolean res = perfectNum(28);
        System.out.println(res);
    }

    static boolean perfectNum(int number){
        int sum = 0;

        for(int i = 1; i<=number/2; i++){
            if((number % i)==0){
                sum+=i;
            }

        }

        if(sum == number){
            return true;
        }

        return false;
    }
}
