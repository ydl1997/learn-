package day29;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetDemo1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address =InetAddress.getByName("192.168.0.107");
    String Address=    address.getHostAddress();
    String Name=   address.getHostName();
        System.out.println(Address+"---"+Name);
    }
}
