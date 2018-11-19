package day27;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutWriterDemo1 {
    public static void main(String[] args) throws  Exception {
        OutputStreamWriter out =new OutputStreamWriter(new FileOutputStream("d:\\javastest\\testow1.txt"));

        out.write("您好，这个测试是我实现人生逆袭的某一个环节，很高兴与你相遇，java");
    out.close();
    }
}
