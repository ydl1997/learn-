package day26;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class InputDemo {
    public static void main(String[] args) throws IOException {
        File file =new File("d:\\javastest\\test1.txt");

        FileInputStream fileInputStream =new FileInputStream(file);
       int read= fileInputStream.read();
        while(read!=-1){
            System.out.println((char)read);
           read= fileInputStream.read();
        }
        fileInputStream.close();
    }
}
