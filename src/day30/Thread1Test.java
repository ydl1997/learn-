package day30;

public class Thread1Test {
    public static void main(String[] args) {
        ThreadDemo1 t1 =new ThreadDemo1();
        ThreadDemo1 t2 = new ThreadDemo1();

        t1.setName("黄竞喆");
        t2.setName("黄焖鸡");
        t1.start();
        t2.start();
    }
}
