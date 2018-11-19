package day28;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class WriterDemo1 {
    public static void main(String[] args) throws  Exception {
        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("d:\\javastest\\WD1.txt"));
        String by = "assaddfvx";
        out.write(by, 2, 2);
        out.flush();
        out.close();
    }
        }

