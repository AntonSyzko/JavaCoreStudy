/**
 * Created by Admin on 25.06.2016.
 * Step 1 : First we find out sum of ‘n’ numbers by using formula n*(n+1)/2.

 Step 2 : Then we will find sum of all elements of array ‘a’.

 Step 3 : Missing_Number = (Sum of 1 to ‘n’ numbers) – (Sum of elements of array ‘a’)
 */
public class MissingNumberInArray {
    public static void main(String[] args) {

        int[]a = {1,2,3,4,6,7,8,9,10};

        int res = misiing(a,10);
        System.out.println(res);
    }

       static int countSumOfIndexes(int n){
           int res = ((n * (n+1))/2);
           return  res;
       }

        static  int countSumOfGivenElems(int [] array){
            int res = 0;
            for(int i = 0; i<array.length; i++){
                res += array[i];
            }

            return  res;
        }

        static int misiing (int [] arr, int n){

            int res = countSumOfIndexes(n) - countSumOfGivenElems(arr);
            return res;
        }



 }
