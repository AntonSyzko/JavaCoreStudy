/**
 * Created by Admin on 26.06.2016.
 */
public class RotationStringOrNot {

    public static void main(String[] args) {
        String a = "BelieveInYourself";
        String b = "YourselfBelieveIn";
        boolean isRotation = rotationOrNot(a,b);
        System.out.println(isRotation);
    }

    static boolean rotationOrNot(String a, String b){

        String both = a + a;
        if(both.contains(b)){
           return  true;
        }

        return  false;
    }
}
