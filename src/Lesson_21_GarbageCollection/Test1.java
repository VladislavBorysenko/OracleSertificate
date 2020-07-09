package Lesson_21_GarbageCollection;

import java.util.Collection;

public class Test1 {
    public static void main(String[] args) {
       // int a=4;
       // System.out.println((a<4?7:"Privet"));
       int a=5;
        int b=5;
        int c=(a<6?a++:b++);
        System.out.println(a);
        System.out.println(b);

    }
}
