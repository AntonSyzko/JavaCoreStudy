package BitwiseOpeartions;

/**
 * Created by Admin on 18.07.2016.
 */
public class SwapAll {

    public static void main(String[] args) {
        int i = 0xFFFFFFF1;
        int j = ~i;
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));
        System.out.println(j);
        System.out.println(Integer.toBinaryString(j));

        int a = -4>>1;
        System.out.println(Integer.toBinaryString(a));

    }
}
