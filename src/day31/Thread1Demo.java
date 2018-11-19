package day31;

public class Thread1Demo {
    public static void main(String[] args) {
        Thread1 th =new Thread1();

        Thread thread1 = new Thread(th);
        Thread thread2 = new Thread(th);
            thread1.setName("no.1");
            thread1.start();
        for (int i =10;i>=0;i--){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
