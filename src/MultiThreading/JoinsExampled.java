package MultiThreading;

/**
 * Created by Admin on 25.07.2016.
 */
public class JoinsExampled {
    public static void main(String[] args) throws InterruptedException {

        System.out.println(" print from 0 to 3000");
       final  Thread t1 = new Thread(){
            public void run(){
                for(int i = 0; i<=1000; i++){
                    System.out.print(i + " ");
                }
                System.out.println(" printing nums from 0 to 1000");
            }
        };

        final  Thread t2 = new Thread(){
            public void run(){
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for(int i = 1001; i<=2000; i++){
                    System.out.print(i + " ");
                }
                System.out.println(" printing nums from 1001 to 2000");
            }
        };

        final  Thread t3= new Thread(){
            public void run(){

                try {
                    t2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for(int i = 2001; i<=3000; i++){
                    System.out.print(i + " ");
                }
                System.out.println(" printing nums from 2001 to 3000");
            }
        };
        t3.start();
        t2.start();
        t1.start();

        t3.join();

        System.out.println(" prining done ");


    }
}
