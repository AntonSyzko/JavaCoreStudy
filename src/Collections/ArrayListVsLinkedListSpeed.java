package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by Admin on 20.07.2016.
 */
public class ArrayListVsLinkedListSpeed {

    private static void testCollections(){
        final int MAX = 100000;
        long startTime = 0;
        startTime = System.nanoTime();
        ArrayList<Integer> al = new ArrayList<Integer>(MAX);
        for(int i=0; i<MAX; i++) al.add(i);
        System.out.println("AL add = " + (System.nanoTime() - startTime));
        startTime = System.nanoTime();
        LinkedList<Integer> ll = new LinkedList<Integer>();
        for(int i=0; i<MAX; i++)ll.add(i);
        System.out.println("LL add = " + (System.nanoTime() - startTime));
        startTime = System.nanoTime();
        for(int i=0; i<100; i++)al.add(MAX/2,i);
        System.out.println("AL expand = " + (System.nanoTime() - startTime));
        startTime = System.nanoTime();
        for(int i=0; i<100; i++){
            ListIterator<Integer> it = ll.listIterator(MAX/2);
            it.add(new Integer(i));
        }
        System.out.println("LL expand = " + (System.nanoTime() - startTime));
    }

    public static void main(String[] args) {
        testCollections();
    }
}
