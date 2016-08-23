package Arrays;

/**
 * Created by Admin on 14.07.2016.
 * You are given an array of numbers. Find out the array index or position where sum of numbers preceeding the
 * index is equals to sum of numbers succeeding the index.
 */
public class MiddleSumIndex {

    public static void main(String[] args) {


        int[] num = { 2, 4, 4, 5, 4, 1 };
        try {
            int res = indexMidSum(num);
            System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int indexMidSum(int [] inputArray) throws Exception {
        int start = 0;
        int end = inputArray.length-1;
        int leftSum = 0;
        int rightSum = 0;

        while (true){
            if( leftSum > rightSum){
                rightSum += inputArray[end--];
            }else{
                leftSum += inputArray[start++];
            }

            if(start>end){
                if(leftSum == rightSum){
                    break;
                }else{
                    throw new Exception(" provide valid arguments ");
                }
            }
        }

        return end;
    }
}
