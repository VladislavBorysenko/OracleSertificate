package lesson_20_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Test9 {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        System.out.println(al1);
        ArrayList<String> al2 = new ArrayList<>();
        al2.add("two");
        al2.add("three");
        al1.removeAll(al2);
        System.out.println(al1);
        //   boolean result = al1.containsAll(al2);
        //   System.out.println(result);
        List<String> sublist = al1.subList(1, 3);
        System.out.println(sublist);
        sublist.add("ten");
        System.out.println(sublist);
        System.out.println(al1);
        Object[] array = al1.toArray();
        String[] array2 = al1.toArray(String[]::new);
        String[] array3 = al1.toArray(new String[3]);
        for (String s : array2
        ) {
            System.out.println(s);
        }
        System.out.println("----------------------------------------");
        for (String s : array3
        ) {
            System.out.println(s);

        }
        System.out.println("_____________________________________________");

        List<String> list = List.of("Odin", "dva", "tri");
        System.out.println("list = " + list);
        List<String> list2 = List.copyOf(al1);
        System.out.println("list2 = "+list2);
    }
}
