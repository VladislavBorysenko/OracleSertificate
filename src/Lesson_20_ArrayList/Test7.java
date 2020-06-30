package Lesson_20_ArrayList;

import java.util.*;

public class Test7 {
    public static void main(String[] args) {
        String s1="A";
        String s2="B";
        String s3="C";
        String s4="D";
        String s5="E";
        String s6="F";

        ArrayList<String>list= new ArrayList<String>();
        list.add(s2);
        list.add(s5);
        list.add(s4);
        list.add(s1);
        list.add(s6);
        list.add(s3);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        ArrayList<String>list2=list;
        System.out.println(list.equals(list2));

        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        ListIterator<String>lit=list.listIterator();
        while (lit.hasNext()){
            System.out.print("\n"+lit.next());
        }
//Удаляем элемент
        while (it.hasNext()){
            it.next();
            it.remove();
        }


    }
}
