import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Admin on 30.06.2016.
 */
public class NoDuplictesArrayDisplaying {

    public static void main(String[] args) {
        int [] arra = {1,2,3,44,5,44,1,2,3,6,7,8};
        //printNoDuplsSet(arra);
        printArrayNoDups(arra);
    }


    static void printNoDuplsSet(int [] array){
        Set setik = new HashSet();
        for(int i = 0; i<array.length; i++){
            setik.add(array[i]);
        }

        System.out.println(setik.toString());
    }

    static void printArrayNoDups(int [] array){
        for (int i = 0; i<array.length; i++){
            boolean marker = false;

            for(int j = 0; j<i; j++){
                  if(array[i]==array[j]){
                      marker = true;
                      break;
                  }
            }
            if(!marker){
                System.out.print(array[i] + "   ");
            }
        }
    }
}
