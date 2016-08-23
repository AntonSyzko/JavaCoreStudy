package PATTERNS.Creational.Factory.AbstractFactory;

/**
 * Created by Admin on 31.07.2016.
 */
public class TellnetShellFactory extends AbstractShellFactory {
    @Override
    Shell createShell() {
        return new TellnetShell();
    }

    @Override
    Command createCommand() {
        return new TellnetCommand();
    }
}
