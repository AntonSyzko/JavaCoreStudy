import java.util.*;


/**
 * Created by Admin on 25.06.2016.
 */
public class CommonElementsBetweenTwoArrays {
    public static void main(String[] args) {
        Integer []a = {1,2,3,56,67,35};
        Integer  []b = {1,2,6,1,3,46,234,65};
        //common2(a,b);
        common1(a,b);
    }

    public static <T>  void common1(T[]aa, T[]b){
       HashSet<T> hs1 = new HashSet<T>(Arrays.asList(aa));
        HashSet<T>hs2 = new HashSet<T>(Arrays.asList(b));
        hs1.retainAll(hs2);
        System.out.println(hs1);
    }


    public  static void common2(Integer[] a, Integer[] b){
        HashSet hs = new HashSet();
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<b.length; j++){
                if(a[i]==b[j]){
                    hs.add(a[i]);
                }
            }
        }
        System.out.println(hs);
    }
}
