package OOP;

import java.lang.reflect.Method;

/**
 * Created by Admin on 04.08.2016.
 */
public class LoadClassDynamically {

    public static void main(String[] args) {
        try {
            Class<?> a = Class.forName("AddressMaskCounter");
            try {
               Object res =  a.newInstance();
                Method [] mtds = a.getDeclaredMethods();

                for(Method each : mtds){
                    System.out.println(each.toString());
                }
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


}
class ForDynamicLoading{
public String a = "got it ";
    public String getField(){
        return  a;
    }
}
