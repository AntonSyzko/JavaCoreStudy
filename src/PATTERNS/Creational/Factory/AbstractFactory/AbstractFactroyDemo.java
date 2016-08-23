package PATTERNS.Creational.Factory.AbstractFactory;

/**
 * Created by Admin on 31.07.2016.
 */
public class AbstractFactroyDemo {


    public static void main(String[] args) {
           ececuteRemoteControl(new TellnetShellFactory());
        System.out.println("**************************");
        ececuteRemoteControl(new SSHShellFactory());
    }

    static void ececuteRemoteControl(AbstractShellFactory abs){
        Shell shell = abs.createShell();
        shell.connect();
        Command commd = abs.createCommand();
        commd.execute();

    }
}
