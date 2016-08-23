package PATTERNS.Creational.Factory.Builder;

/**
 * Created by Admin on 07.08.2016.
 */
public class Computer {

    private String HHD;
    private boolean isBluetoothEnabled;

    private Computer(ComputerBuilder builder){
       this.HHD = builder.HDD;
        this.isBluetoothEnabled = builder.isBlthEnabled;
    }

    public String getHHD() {
        return HHD;
    }

    public void setHHD(String HHD) {
        this.HHD = HHD;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public void setBluetoothEnabled(boolean bluetoothEnabled) {
        isBluetoothEnabled = bluetoothEnabled;
    }


    public static class ComputerBuilder{
        private  String HDD;
        private  boolean isBlthEnabled;

        public ComputerBuilder(String hdd){

            this.HDD = hdd;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBlthEnabled){
            this.isBlthEnabled = isBlthEnabled;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
