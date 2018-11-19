package day29;

import java.io.*;
import java.net.Socket;

public class Client2 {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("192.168.1.108",8888);
        OutputStream outputStream = socket.getOutputStream();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        bufferedWriter.write("你好小老弟");
        bufferedWriter.flush();

        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        String result =objectInputStream.readUTF();
        System.out.println("请求有效，服务端有响应");

        socket.shutdownInput();

        System.out.println("请求完毕");

    }
}
