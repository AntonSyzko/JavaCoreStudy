package StringsExercises;

import java.io.OutputStream;
import java.io.PrintStream;

/**
 * Created by Admin on 06.08.2016.
 */
public class SettingMyOut {

    /*
     static {
    System.out.println("Right");
    System.exit(0);
    }
     */


    /*
      public static void main(java.lang.String[] args) {// detailed indication to java.lang.string class - this is  entry point
        System.out.println("Right");
    }

    class String {}   //thus main1 meth string class  is custom class and  this main is not the entry point anymore .....
     */

    static {
        System.setOut(new MyStream(System.out));
    }


    public static void main(String[] args) {
        System.out.println("Wrong");
    }

    private static class MyStream extends PrintStream {

        public MyStream(OutputStream out) {
            super(out);
        }

        @Override
        public void println(final String text) {
            super.println("Right");
        }
    }


}

/*
class Main {
class Inner{
public static void main(String[] args) {
System.out.println("Wrong");
}
}
public static void main(String[] args) {
System.out.println("Right");
}
}
 */
