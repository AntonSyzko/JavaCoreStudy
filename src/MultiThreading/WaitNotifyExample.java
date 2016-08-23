package MultiThreading;

/**
 * Created by Admin on 08.07.2016.
 */
public class WaitNotifyExample {

    public static void main(String[] args) {

        final WaitNotifyExample wtne = new WaitNotifyExample();
        Thread th1 = new Thread(){
            public void run(){

                wtne.waitFunction();//waits
            }
        };
        th1.start();
        Thread th2= new Thread(){
            public void run()
            {
                wtne.waitFunction();
            }
        };
        th2.start();
        Thread th3 = new Thread(){
            public void run()
            {
                wtne.waitFunction();
            }
        };
        th3.start();

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread th4 = new Thread(){
             public void run(){

                 wtne.notifyOneThreadFunction();//releases
             }
        };
        th4.start();
    }

    synchronized void waitFunction(){
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + " releases the lock/monitor of the  object and  going to wait untill someone notifies him ");
        try{
            wait();// on the  posessed object
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getName() + " has  been notified and got its object lock back and running now  ");


    }

    synchronized void notifyOneThreadFunction(){
        Thread t = Thread.currentThread();
        // here notifyAll()  will inform all waiting threads that lock has been released and one  after another they will get the lock
        notify();// on the posessed object
        System.out.println(t.getName() + " has  notified one random thread that the object lock has been realeased ");



    }
}
