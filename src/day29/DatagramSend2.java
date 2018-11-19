package day29;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramSend2 {
    public static void main(String[] args) throws  Exception{
        DatagramSocket datagramSocket = new DatagramSocket();

        byte[] by ="小老弟，我来了".getBytes();
        InetAddress Address =InetAddress.getByName("192.168.0.107");
        int port =10086;
        DatagramPacket packet = new DatagramPacket(by,by.length,Address,port);

        datagramSocket.send(packet);
        datagramSocket.close();

    }
}
