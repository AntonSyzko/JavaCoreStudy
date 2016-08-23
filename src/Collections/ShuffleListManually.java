package Collections;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Admin on 29.06.2016.
 */
public class ShuffleListManually {

    public static void main(String[] args) {
     int [] unshuffled = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(unshuffled) + "\r\n");

        shuffle(unshuffled);
        System.out.println(Arrays.toString(unshuffled));

    }

    public static void shuffle(int [] arr) {
        Random rnd = new Random();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = i + rnd.nextInt(n-i);
            swap(arr,i,j);

        }
    }

    public static void swap(int [] arr, int a, int b){
        if(arr[a] == arr[b]){
            return;
        } else{
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }


    }
}
