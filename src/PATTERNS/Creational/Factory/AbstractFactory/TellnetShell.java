package PATTERNS.Creational.Factory.AbstractFactory;

/**
 * Created by Admin on 31.07.2016.
 */
public class TellnetShell extends Shell{

    @Override
    void connect(){
        System.out.println(" connect to tellnet shell ");
    }
}
