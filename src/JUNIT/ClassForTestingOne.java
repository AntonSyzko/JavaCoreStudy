package JUNIT;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 18.08.2016.
 */
public class ClassForTestingOne {


    List<String> lista = new ArrayList<String>();

    public void fillList(){
        lista.add("A");
    }
    public boolean isEvenNumber(int number){

        boolean result = false;
        if(number%2 == 0){
            result = true;
        }
        return result;
    }
}
