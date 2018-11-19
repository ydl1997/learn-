package day29;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class ChangeStreamDemo1 {
    public static void main(String[] args) throws Exception {
        OutputStreamWriter ou = new OutputStreamWriter(new FileOutputStream("d:\\javastest\\cd1.txt"),"gbk");
        ou.write("柴金海牛逼");
        ou.flush();
        ou.close();
//        System.out.println(ou.getEncoding());
        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream("d:\\javastest\\cd1.txt"));
        out.write(1233);
        out.flush();
        out.close();
//        System.out.println(out.getEncoding());

        FileInputStream in = new FileInputStream("D:\\javastest\\cd1.txt");
        int read = 0;
        while ((read =in.read())!=-1){
            System.out.println(read);
        }
    }
}