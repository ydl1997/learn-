package day27;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyDemo1 {
    public static void main(String[] args) throws  Exception {
        FileInputStream in =new FileInputStream("d:\\javastest\\1.bmp");
        FileOutputStream out =new FileOutputStream("d:\\javastest\\2.bmp");

        int read =0;
        while((read=in.read())!=-1){
            out.write(read);
        }
        in.close();
        out.close();
    }
}
