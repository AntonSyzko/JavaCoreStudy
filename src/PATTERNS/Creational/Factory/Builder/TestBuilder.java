package PATTERNS.Creational.Factory.Builder;

/**
 * Created by Admin on 07.08.2016.
 */
public class TestBuilder {

    public static void main(String[] args) {
        Computer comp = new Computer.ComputerBuilder("700TB").setBluetoothEnabled(true).build();


    }
}
