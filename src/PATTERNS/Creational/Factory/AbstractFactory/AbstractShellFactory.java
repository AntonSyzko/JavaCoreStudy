package PATTERNS.Creational.Factory.AbstractFactory;

/**
 * Created by Admin on 31.07.2016.
 */
public abstract class AbstractShellFactory {
    abstract Shell createShell();
    abstract Command createCommand();
}
