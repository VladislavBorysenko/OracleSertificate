package Lesson_20_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class HomeWork {
    public static void main(String[] args) {
        ArrayList list1 = abc("papa", "mama", "ded", "papa", "babka", "vnuchka", "ded");

    }

    public static ArrayList abc(String... n) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : n
        ) {
            if (!list.contains(s)){
                list.add(s);
            }
        }
        Collections.sort(list);
        System.out.println(list);

        return list;
    }
}
