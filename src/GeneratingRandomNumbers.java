import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Admin on 29.06.2016.
 */
public class GeneratingRandomNumbers {
    public static void main(String[] args) {

        generateRandom1();
        generateRandom12();
        generateRandom13();
    }

    public static void generateRandom1(){
        Random rnd = new Random();
        for(int i = 0; i<3;i++){

            System.out.println(rnd.nextInt(50));
    }
}



    public static void generateRandom12(){
        for(int i = 0; i<3;i++){
            System.out.println((int)(java.lang.Math.random()*50));
        }
    }


    public static void generateRandom13(){
        for(int i = 0; i<3;i++){
            System.out.println(ThreadLocalRandom.current().nextInt(0,50));
        }
    }
}
