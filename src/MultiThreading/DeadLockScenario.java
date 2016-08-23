package MultiThreading;

/**
 * Created by Admin on 24.06.2016.
 */

    class Shared{

        public synchronized void method1(Shared sharedClass){
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + "is executing method1");
            System.out.println(t.getName() + "is executing method2");
            sharedClass.method2(this);
            System.out.println(t + "is finishing executing method1");


        }

        public synchronized void method2(Shared sharedClass){
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + "is executing method1");
            System.out.println(t.getName() + "is executing method2");
            sharedClass.method1(this);
            System.out.println(t + "is finishing executing method1");


        }
    }//schared

public class DeadLockScenario {

    public static void main(String[] args) {
       final  Shared first = new Shared();
        final Shared second = new Shared();

        Thread t1 = new Thread(){
            public void run(){
                first.method1(second);
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                second.method2(first);
            }
        };

        t1.start();
        t2.start();
    }
}
