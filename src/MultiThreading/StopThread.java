package MultiThreading;

/**
 * Created by Admin on 08.07.2016.
 */
public class StopThread {

    public static void main(String[] args) throws InterruptedException {

        MyThread mt = new MyThread();
        mt.start();
        try{
            Thread.sleep(1);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        mt.stopRunning();
        mt.join();//wait till finishes


        System.out.println("**********************");
        MyThreaadTwo mt2 = new MyThreaadTwo();
        mt2.start();

        try{
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        mt2.interrupt();
    }

    public static class MyThread extends Thread{

        private volatile boolean flag = true;

        public void stopRunning(){

            flag = false;
        }
        @Override
        public void run(){
            while (flag){
                System.out.println("running");
            }
            System.out.println("stopped");
        }
    }


    public static class MyThreaadTwo extends Thread{

        @Override
        public void run(){

            while (!isInterrupted()){
                System.out.println(" running two ");

            }

            System.out.println(" stopped two ");
        }

    }
}
