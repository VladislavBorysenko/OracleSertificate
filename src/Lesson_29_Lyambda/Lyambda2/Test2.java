package Lesson_29_Lyambda.Lyambda2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = List.of("privet", "poka", "kak dela", "Vse normalno");
//        for (String s:list
//             ) {
//            System.out.println(s);
//        }

        for (String s:list
             ) {
            Predicate<String>p=x->x.length()>4;
        }
        list.forEach(s -> System.out.println(s));

        ArrayList<Integer>al=new ArrayList<>();
        for (int i = 1; i <=7; i++) {
            al.add(i);
        }
        al.forEach(s-> System.out.println(s));
//        al.removeIf(element->element%3==0);
//        Predicate<Integer> p =element -> element %3==0;
//        al.remove(p);
        al.sort((x,y)->-x.compareTo(y));//сортировка в обратном порядке?
        System.out.println(al);
        al.sort((x,y)->x.compareTo(y));
        System.out.println(al);
    }
}
