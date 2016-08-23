package Collections;

import java.beans.IntrospectionException;
import java.util.Collections;
import java.util.Stack;

/**
 * Created by Admin on 13.07.2016.
 */
public class SortStackWithTempStack {

    public static Stack<Integer> sortStak(Stack<Integer> input){

        Stack<Integer> tempStack = new Stack<Integer>();

        while (!input.isEmpty()){

            int temp = input.pop();
            System.out.println(" taken fron original " + temp);

            while (!tempStack.isEmpty()&& tempStack.peek()>temp){
                System.out.println("adding back to original " + tempStack.peek());
                input.push(tempStack.pop());
            }
            tempStack.push(temp);
        }


        return tempStack;
    }


    public static void main(String[] args) {
        Stack<Integer> original = new Stack<Integer>();
        original.add(3);
        original.add(1);
        original.add(2);
        System.out.println(original.toString());
        Stack<Integer> sorted = sortStak(original);
        System.out.println(sorted.toString());



    }
}
