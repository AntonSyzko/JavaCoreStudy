package BitwiseOpeartions;

/**
 * Created by Admin on 12.07.2016.
 */
public class CompareWithoutIf {


    public static void main(String[] args) {
        CompareWithoutIf c = new CompareWithoutIf();
        int max = c.getMax(2,6);
        System.out.println(max);
    }

    int flip(int bit) {

        return 1^bit;
    }

    /* Возвращаем 1, если число положительное, и 0, если отрицательное*/
    int sign(int a) {

        return flip((a >> 31) & 0x1);
    }

    int getMaxNaive(int a, int b) {
        int k = sign(a - b);
        int q = flip(k);
        return a * k + b * q;
    }

    int getMax(int a, int b) {
        int c = a - b;

        int sa = sign(a); // если a >= 0, то 1, иначе 0
        int sb = sign(b); // если a >= 1, то 1, иначе 0
        int sc = sign(c); // зависит от переполнения a - b

    /* Цель: найти k, которое = 1, если а > b, и 0, если a < b.
     * если a = b, k не имеет значения */

        // Если у а и b равные знаки, то k = sign(a)
        int use_sign_of_a = sa ^ sb;

        // Если у a и b одинаковый знак, то k = sign(a - b)
        int use_sign_of_c = flip(sa ^ sb);

        int k = use_sign_of_a * sa + use_sign_of_c * sc;
        int q = flip(k); // отражение к

        return a * k + b * q;
    }
}
