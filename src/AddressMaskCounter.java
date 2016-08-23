import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by Admin on 23.06.2016.
 */
public class AddressMaskCounter {

    public static void main(String[] args) {


        long address = 19_216_811L;

        long mask = 2552552240L;

        Long res = AddressMask(address,mask);
        System.out.println(res);

    }



    public  static long AddressMask(long a, long b){
        long res = a & b;
        return res;
    }
}
