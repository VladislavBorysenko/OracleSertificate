package Lesson_20_ArrayList;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("poka");
        list.add("privet");
        list.add("Hello");
        list.add("ok");
        list.add(1,"Pavel");
        for (String s : list) {
            System.out.print(s+" ");
        }
        System.out.println("\n"+list.get(2));
        list.set(1,"zamena");
        for (String s : list) {
            System.out.print(s+" ");
        }
    }
}
