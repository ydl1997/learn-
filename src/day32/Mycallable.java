package day32;

import java.util.concurrent.Callable;

public class Mycallable implements Callable<Integer> {
    private  String str;
    public Mycallable(String str){
        this.str=str;
    }
    public Integer call() throws Exception {
        for (int i = 0; i <100 ; i++) {
            System.out.println("柴金海爱上了"+str);
        }
        return null;
    }
}

