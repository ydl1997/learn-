package day29;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DataSockRecieve2 {
    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket(10086);
        System.out.println("服务器已启动：");
        byte[] by =new byte[1024];
        DatagramPacket packet = new DatagramPacket(by,by.length);

        datagramSocket.receive(packet);
        byte[] by2 =packet.getData();
        String ip =packet.getAddress().getHostAddress();
        String s =new String(by2,0,by2.length);
        System.out.println(ip+":"+s);


    }
}
