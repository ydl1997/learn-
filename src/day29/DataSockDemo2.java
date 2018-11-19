package day29;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DataSockDemo2 {
    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket(10010);

        byte[] by =new byte[1024];
        int length=by.length;
        DatagramPacket packet = new DatagramPacket(by,length);

        datagramSocket.receive(packet);

        InetAddress Address =packet.getAddress();
        String ip =Address.getHostAddress();
        byte[] by2 =packet.getData();
        int length2 =packet.getLength();
        String s =new String(by2,0,length2);
        System.out.println(ip+":"+s);
        datagramSocket.close();


    }
}
