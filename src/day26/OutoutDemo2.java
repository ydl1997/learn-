package day26;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutoutDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream out =new FileOutputStream("d:\\javastest\\test03.txt");

        byte [] bys ={97,98,99,100,101,102};
        out.write(bys);
        out.close();
    }
}
