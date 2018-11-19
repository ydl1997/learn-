package day30;

public class ThreadDemo1 extends Thread {
    @Override
    public void run() {
        for (int i =0;i<=100;i++){
            System.out.println(Thread.currentThread().getName()+i+"岁了");
        }
    }

}
