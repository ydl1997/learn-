package day27;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class InputbarrayDemo {
    public static void main(String[] args) throws  Exception {
        FileInputStream in =new FileInputStream("D:\\javastest\\test1.txt");
        FileOutputStream out =new FileOutputStream("d:\\javastest\\testbarr.txt");
        byte[] by =new byte[10];
        int read =in.read(by);

            System.out.println(new String(by));


    }
}
