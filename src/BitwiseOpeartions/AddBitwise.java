package BitwiseOpeartions;

/**
 * Created by Admin on 12.07.2016.
 * Напишите функцию суммирования двух целых чисел без использования «+» и других арифметических операторов
 */
public class AddBitwise {

    public static void main(String[] args) {

        int res = sumBitwise(3,5);
        System.out.println(res);
    }

    public  static int sumBitwise(int a, int b){

        if( b == 0){
           return a;
        }else{
            int sum = a ^ b;//summ without carry
            int carry = (a & b)<<1; /// just carry
            return sumBitwise(sum,carry);
        }


    }
}
