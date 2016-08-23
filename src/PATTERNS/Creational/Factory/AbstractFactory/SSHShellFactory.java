package PATTERNS.Creational.Factory.AbstractFactory;

/**
 * Created by Admin on 31.07.2016.
 */
public class SSHShellFactory extends AbstractShellFactory {

    @Override
    Shell createShell() {
        return new SSHShell();
    }

    @Override
    Command createCommand() {
        return new SSHCommand();
    }
}
