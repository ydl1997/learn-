package day27;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputReaderDemo1 {
    public static void main(String[] args) throws  Exception {
        InputStreamReader in =new InputStreamReader(new FileInputStream("d:\\javastest\\test1.txt"),"gbk");
//        Byte[] by =new Byte[5];
        int read =0;
        while((read=in.read())!=-1){
            System.out.println((char)read);
        }

    in.close();
    }
}
