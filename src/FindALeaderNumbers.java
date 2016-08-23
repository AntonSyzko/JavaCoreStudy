import java.util.Arrays;

/**
 * Created by Admin on 04.07.2016.
 */
public class FindALeaderNumbers {

    public static void main(String[] args) {

        int [] i = {12, 9, 7, 14, 8, 6, 3};
        //leaders(i);

        printleadres2(i);
    }

    static void leaders(int [] a){
        int n = a.length;
        int max = a[n-1];
        System.out.println("in " + Arrays.toString(a));
        System.out.println("leaders are " + a[a.length - 1]);
        for(int i = n-2; i>=0;i--){
            if(a[i]>max){
                System.out.println(a[i]);
                max = a[i];

            }
        }
    }


    static void printleadres2(int [] a){

        System.out.println("leadres in " + Arrays.toString(a));
        for(int i = 0; i < a.length; i++){
            boolean flag = true;

            for(int j =  i+1; j<a.length-1;j++){
                if(a[j] > a[i]){

                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(a[i]);

            }
        }
    }
}
