package BitwiseOpeartions;

/**
 * Created by Admin on 12.07.2016.
 */
public class PowerOfTwoBitCheck {

    public static void main(String[] args) {


        boolean res = isPowerOfTwo(4);
        System.out.println(res);
    }
// is for power of two or zero check
    public static boolean isPowerOfTwo(int a){

        if((a &(a-1))==0){
            return true;
        }else{
            return false;
        }
    }
}
