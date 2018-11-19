package day27;

import java.io.FileInputStream;

public class InputDemo1 {
    public static void main(String[] args) throws  Exception{
        FileInputStream in =new FileInputStream("d:\\javastest\\test1.txt");

        int read =0;
        while((read=in.read())!=-1){
            System.out.println((char)read);
        }
        in.close();
    }
}
