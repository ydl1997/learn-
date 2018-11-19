package day31;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Thread2 implements Runnable {
    public void run() {

        try {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + i + "岁了");
            }
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
          }



