package day29;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DataSocketDemo1 {
    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket();
        byte[] by ="小伙子6666".getBytes();
        int length = by.length;
        InetAddress Address =InetAddress.getByName("192.168.0.107");
        int port =10010;
        DatagramPacket packet =new DatagramPacket(by,length,Address,port);

        datagramSocket.send(packet);
        datagramSocket.close();
    }
}
