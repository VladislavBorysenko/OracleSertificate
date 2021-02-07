package Lesson_30_Generics;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Hello");
        al.add("HI");
        al.add("Yes");
        al.add("NO");
        System.out.println(GenMethod.getSecondElement(al));
    }
}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> arrayList) {
        return arrayList.get(1);
    }
}