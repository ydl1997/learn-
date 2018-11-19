package day26;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutDemo3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("d:\\javastest\\newtest",true);

        for (int i =0;i<10;i++){
        out.write(("arr"+i).getBytes());
        out.write("\r\n".getBytes());
        }
    }
}
