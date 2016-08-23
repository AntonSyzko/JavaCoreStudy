package MultiThreading;

import java.util.*;

/**
 * Created by Admin on 27.07.2016.
 */
public class ProducerConsumerProblem {

    private static Vector<Object> data = new Vector<Object>();
    private static  List<Object> storage  = Collections.synchronizedList(data);

    public static void main(String[] args) {


        new Producer().start();
        new Consumer().start();
    }


    public static class Consumer extends Thread {
        public Consumer() {

            super("consumer");
        }

        @Override
        public void run() {

            for (; ; ) {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (data){
                    @SuppressWarnings(" rawtypes")
                    Iterator ir = storage.iterator();
                    while (ir.hasNext()) {
                        System.out.println( ir.next());
                    }
                }

            }
        }
    }

    public static class Producer extends Thread {

        public Producer() {
            super(" producer ");
        }

        @Override
        public void run() {

            for (; ; ) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                storage.add(new Object());
                if (storage.size() > 1000) {
                    storage.remove(storage.size() - 1);
                }
            }
        }
    }
}

