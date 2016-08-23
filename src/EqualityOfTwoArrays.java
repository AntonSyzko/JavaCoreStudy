import java.util.Arrays;

/**
 * Created by Admin on 26.06.2016.
 */
public class EqualityOfTwoArrays {


    public static void main(String[] args) {

        String [] arrayA = {"A","B","C"};
        String [] arrayB = {"A","B","C"};


        boolean ans = compareArrays1(arrayA,arrayB);
        System.out.println(ans);

    }


    public static boolean compareArrays1(String [] arrayA, String [] arrayB){
        boolean eqonot = true;

        if(arrayA.length == arrayB.length){

            for(int i = 0; i<arrayA.length; i++){
                if(arrayA[i]!=arrayB[i]){
                    eqonot = false;
                }
            }
        }else{
            eqonot = false;
        }

        return eqonot;

    }


    public static boolean compareArraysB(String [] a, String [] b){

        boolean res = false;

        if(Arrays.equals(a,b) == true){
            res = true;
        }else {
            res = false;
        }

        return res;
    }


    public static boolean compareArraysDeep(String [] a, String [] b){

        boolean res = false;

        if(Arrays.deepEquals(a,b)){
            res = true;
        }else {
            res = false;
        }

        return res;
    }
}
