package lesson_20_ArrayList;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add(new String("Privet"));
        list.add(new String("Poka"));
        list.add(new String("Ok"));
        list.add(new String("Hello"));
        list.add(new String("Privet"));
        list.add(new String("Sorry"));

        for (String s:list
        ) {
            System.out.print(s+" ");
        }
        System.out.println("-----------------------------------------------------------");
        System.out.println(list.indexOf(new String("Hello")));
        System.out.println(list.lastIndexOf(new String("Privet")));
        System.out.println("Size ArrayList "+list.size());
        //list.clear();
        System.out.println("Size ArrayList "+list.isEmpty());
        System.out.println(list.contains("Poka"));
        System.out.println(list.toString());
    }
}

