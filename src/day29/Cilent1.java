package day29;

import java.io.OutputStream;
import java.net.Socket;

public class Cilent1 {
    public static void main(String[] args)throws Exception {
        Socket socket = new Socket("192.168.1.101",8888);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("cc".getBytes());
        socket.shutdownOutput();


    }
}
