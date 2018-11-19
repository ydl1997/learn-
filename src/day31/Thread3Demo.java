package day31;

public class Thread3Demo {
    public static void main(String[] args) {
        Thread3 th =new Thread3();
        Thread t1 =new Thread(th);
        Thread t2 =new Thread(th);
        t1.setName("张三");
        t2.setName("张三的妻子—柴金海");
        t1.start();
        t2.start();
    }
}
