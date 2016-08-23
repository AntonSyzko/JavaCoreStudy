package Networking;

/**
 * Created by Admin on 12.08.2016.
 */
import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyIPAddress {

    public static void main(String a[]){

        try {
            InetAddress ipAddr = InetAddress.getLocalHost();
            System.out.println(ipAddr.getHostAddress());
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }

        getHostAddress();
        getHostName();
        getmachineHostname();
        listAllIPsOfAGivenHost();
    }



    public static void getHostAddress(){
        try {
            InetAddress host = InetAddress.getByName("www.java2novice.com");
            System.out.println(host.getHostAddress());
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }


    public static void getHostName(){
        try {
            InetAddress host = InetAddress.getByName("72.167.232.155");
            System.out.println(host.getHostName());
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }


    public static void getmachineHostname(){
        try {
            InetAddress myHost = InetAddress.getLocalHost();
            System.out.println(myHost.getHostName());
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }


    public static void listAllIPsOfAGivenHost(){

        try {
            InetAddress[] myHost = InetAddress.getAllByName("www.google.com");
            for(InetAddress host:myHost){
                System.out.println(host.getHostAddress());
            }
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
    }
}
