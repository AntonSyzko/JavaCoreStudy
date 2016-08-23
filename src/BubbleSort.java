/**
 * Created by Admin on 25.06.2016.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int [] input = {1,3,5,9,7,88,521,1,9};
        bubble2(input);
    }

//    static void bubbleSort( int [] unsorted){
//
//        for(int i = 0; i<unsorted.length;i++){
//            for(int j = 0; j< unsorted.length -i -1; j++){
//                if(unsorted[j]>unsorted[j+1]){
//                   unsorted[j] ^= unsorted[j+1];
//                    unsorted[j+1] ^= unsorted[j];
//                    unsorted[j] ^= unsorted[j+1];
//                }
//            }
//        }
//        print(unsorted);
//    }

    static  void swap(int a, int b){
        a ^= b;
        b ^= a;
        a ^= b;
    }

    static void print(int [] arr){
        System.out.print(" [ ");
        for( int i = 0; i < arr.length; i++){
            System.out.print(arr [i] + " ");
        }
        System.out.println(" ] ");
    }


    static void bubble2(int [] unsorted){
        for(int i = unsorted.length; i>=0;i--){
            for(int j = 0; j<unsorted.length - 1; j++){
                if(unsorted[j]>unsorted[j+1]){
                    unsorted[j] ^= unsorted[j+1];
                    unsorted[j+1] ^= unsorted[j];
                    unsorted[j] ^= unsorted[j+1];
                }
            }
        }
        print(unsorted);
    }
}
