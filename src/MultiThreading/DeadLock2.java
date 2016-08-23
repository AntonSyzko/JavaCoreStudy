package MultiThreading;

/**
 * Created by Admin on 24.06.2016.
 */
public class DeadLock2 {

     String str1 = "one";
     String str2 = "two";

    Thread t1 = new Thread("thread one"){
        public void run(){
            while (true){
                synchronized (str1){
                    try {
                       Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (str2){
                        System.out.println(str1 + str2);
                    }
                }
            }
        }
    };

    Thread t2 = new Thread(" Sec thread"){
        public  void run(){
            while (true){
                synchronized (str2){
                    synchronized (str1){
                        System.out.println(str2 + str1);
                    }
                }
            }
        }
    };

    public static void main(String[] args) {
        DeadLock2 ds2 = new DeadLock2();
        ds2.t1.start();
        ds2.t2.start();
    }
}
