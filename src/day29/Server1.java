package day29;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
    public static void main(String[] args)throws  Exception {
        ServerSocket serverSocket = new ServerSocket(8888);

        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();

        byte[] by =new byte[1024];
        int length =inputStream.read(by);
        String s =new String(by,0,length);
        System.out.println(s);
    }
}
