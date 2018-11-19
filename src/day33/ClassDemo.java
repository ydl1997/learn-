package day33;

import java.lang.reflect.Constructor;

public class ClassDemo {
    public static void main(String[] args) throws Exception {
        Class c1 =Class.forName("day33.Student");

        Constructor constructor1 = c1.getConstructor();
       Constructor constructor2 = c1.getConstructor(String.class,String.class,Integer.class,String.class,String.class);
        Object o1 = constructor1.newInstance();
       Object o2 = constructor2.newInstance(String.class,String.class,Integer.class,String.class,String.class);
        System.out.println(o1);
        System.out.println(o2);

    }
}
