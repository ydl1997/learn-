package day26;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputDem01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream out =new FileOutputStream("D:\\javastest\\test007");
        String str ="自己学了下输出字节流";
        out.write(str.getBytes());

    }
}
