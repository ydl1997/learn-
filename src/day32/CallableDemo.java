package day32;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);

        pool.submit(new Mycallable("西门庆"));
        pool.submit(new Mycallable("大牙"));
        pool.submit(new Mycallable("汤斌"));

        pool.shutdown();
    }
}
