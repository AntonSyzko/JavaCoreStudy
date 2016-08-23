package TrickyMathTasks;

/**
 * Created by Admin on 20.07.2016.
 */
public class ClosestNumberInArray {

    public static void main(String[] args) {
      int[]a = {2,6,9,1,23,55};
        int res = closestNum(a,10);

        System.out.println("closest to 10 is " + res);
    }

    public static int closestNum(int [] array, int givenNum){
        int diff = Math.abs( givenNum - array[0]);
        int res = array[0];
        for(int i = 1; i<array.length; i++){
          if(diff>Math.abs(givenNum-array[i])){
              res=array[i];
          }

        }

        return res;
    }
}
