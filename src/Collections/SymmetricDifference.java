package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by Admin on 06.07.2016.
 */
public class SymmetricDifference {

    public static void main(String[] args) {

        List<String> a = new ArrayList<String>(Arrays.asList("A","B","C"));
        List<String> b = new ArrayList<String>(Arrays.asList("D","B","C"));

        Collection<String> intersecRes = symmetricDiff(a,b);

        System.out.println(" collection a " + Arrays.toString(a.toArray()));
        System.out.println(" collection b " + Arrays.toString(b.toArray()));
        System.out.println(" collection c " + Arrays.toString(intersecRes.toArray()));



    }

    static  <T>  Collection<T> symmetricDiff(Collection<T> a, Collection<T> b){
          Collection<T> intersection = new ArrayList<T>(a);
        intersection.retainAll(b);
        Collection<T> result = new ArrayList<T>(a);
        result.addAll(b);
        result.removeAll(intersection);
        return result;
    }
}
