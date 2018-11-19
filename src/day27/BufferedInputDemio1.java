package day27;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputDemio1 {
    public static void main(String[] args) throws Exception{
        BufferedInputStream in =new BufferedInputStream(new FileInputStream("d:\\javastest\\test1.txt"));

        int read =in.read();
        System.out.println((char)read);
        in.close();
    }
}
