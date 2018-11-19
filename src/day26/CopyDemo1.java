package day26;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyDemo1 {
    public static void main(String[] args) throws Exception {
            FileInputStream in = new FileInputStream("d:\\javastest\\test1.txt");
            FileOutputStream out = new FileOutputStream("d:\\javastest\\(test+i).txt");
            int read = in.read();
            while (read != -1) {
                out.write(read);
                read = in.read();
            }
            in.close();
            out.close();
        }
    }

