package day27;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class InputDemo2 {
    public static void main(String[] args)throws  Exception {
        FileInputStream in =new FileInputStream("d:\\javastest\\test1.txt");
        FileOutputStream out =new FileOutputStream("d:\\javastest\\testinputdemo2");

        byte[] by =new byte[10];
        int read =0;
        while((read=in.read(by))!=-1){
            out.write(by);
            System.out.println(new String(by,0,read));
        }
    }
}
