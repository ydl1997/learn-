package day32;

import java.util.Timer;

public class TimeDemo {
    public static void main(String[] args) {
        new Thread(){
            public void run(){
                for (int i = 1; i <100; i++) {
                    System.out.println("柴金海牛逼！！！");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }.start();
        Timer t =new Timer();
        t.schedule(new Timethings(),4000,5000);
    }
}
