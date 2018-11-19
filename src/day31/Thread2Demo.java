package day31;

public class Thread2Demo {
    public static void main(String[] args) {
        Thread2 th =new Thread2();

        Thread t1 = new Thread(th);
        Thread t2 = new Thread(th);
        t1.setName("柴金海");
        t2.setName("柴铁海");
        t1.start();
        t2.start();

    }
}
