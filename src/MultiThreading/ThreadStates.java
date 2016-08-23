package MultiThreading;

/**
 * Created by Admin on 02.08.2016.
 */
public class ThreadStates {

    public static void main(String[] args) {
        Thread.State [] states = Thread.State.values();
        int threadState_number = 0;
        for(Thread.State eachState : states){
            System.out.println(++threadState_number + " :  "   + eachState.toString()
             + " \r\n \t");
        }


    }
}
//new
//  runnable
//    blocked
// waiting
// timed_waiting
//  terminated

//java -XX:MaxPermSize - Perm Gen size

