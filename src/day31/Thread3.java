package day31;

import java.util.Scanner;

public class Thread3 implements Runnable{

    Scanner scanner =new Scanner(System.in);

    public synchronized void  run() {
//        while(true){
            System.out.println(Thread.currentThread().getName()+"想要取走多少");
            int get =scanner.nextInt();
        System.out.println("您和您的爱人当前有"+(10000-get)+"元");

    }
}
//}
