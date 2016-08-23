package Arrays;

/**
 * Created by Admin on 18.07.2016.
 */
public class TriangleCicle {

    public static void main(String[] args) {

        printTriangle("JAVA2EE");
    }

    public  static void  printTriangle(String input){
        char[] arrray = input.toCharArray();
        for(int i = 0; i< arrray.length; i++){
            for(int j = 0; j<=i;j++){
                System.out.print(arrray[j]);
            }
            System.out.println();
        }

    }
}
