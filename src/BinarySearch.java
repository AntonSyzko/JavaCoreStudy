import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Admin on 26.06.2016.
 */
public class BinarySearch {

    public static void main(String[] args) {

        int [] array = {1,2,4,3,56,78,987,5};
        //int index = binarySearch(array,5);
        int index = binSerchRecursion(array, 5,0,array.length);
//        if(index == -1){
//            System.out.println(" not found ");
//        }else{
//            System.out.println(" element " + 5 + " was  found  at index " + index);
//
//        }
        System.out.println(index);
    }

//    static int binarySearch(int [] array, int toSearch){
//        System.out.println(Arrays.toString(array));
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//        int start, end, midpoint;
//        start = 0;
//        end = array.length -1;
//
//        while (start <= end){
//            midpoint = (start + end)/2;
//
//            if(array[midpoint]==toSearch){
//                return  midpoint;
//            }else if( array[midpoint] < toSearch){
//                start =midpoint +1;
//            }else{
//                end = midpoint - 1;
//            }
//        }
//
//        return -1;
//
//    }
//


    static int binSerchRecursion(int [] aray, int tosearch, int start, int end){
        Arrays.sort(aray);


        if(start < end){
            int midpoint = start + (end - start) / 2;

            if(tosearch < aray[midpoint]){
               return  binSerchRecursion(aray,tosearch,start,midpoint);
           }else if(tosearch > aray[midpoint]){
              return binSerchRecursion(aray,tosearch,midpoint +1, end);
           }else{
               return midpoint;
           }
        }


return -1;

    }






}
