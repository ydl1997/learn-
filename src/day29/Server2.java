package day29;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
    public static void main(String[] args)throws  Exception {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("您好，服务器已经响应;");
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line =bufferedReader.readLine();
        System.out.println(line);

        accept.shutdownInput();

        OutputStream outputStream = accept.getOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeUTF("你好啊，小老弟");
        objectOutputStream.flush();

        accept.shutdownOutput();
    }
}
