package Lesson_20_ArrayList;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<StringBuilder>list=new ArrayList<>();
        StringBuilder sb1=new StringBuilder("hello");
        StringBuilder sb2=new StringBuilder("ok");
        StringBuilder sb3=new StringBuilder("privet");
        StringBuilder sb4=new StringBuilder("poka");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        for (int i = 0; i <list.size() ; i++) {
            list.get(i).append("!!!");
        }
        for (StringBuilder sb:list) {
            System.out.print(sb+" ");
        }
 //  list.remove(2);
 //      for (StringBuilder sb:list) {
 //          System.out.print(sb+" ");
 //      }
        list.remove(sb1);//удаляем обьект sb1
        list.remove("poka");

        ArrayList<String> list2=new ArrayList<>();
        ArrayList<String> list3=new ArrayList<>();
        list2.add("Petrov");
        list2.add("Sidorov");

        list3.add("poka");
        list3.add("privet");
        list2.addAll(list3);//добавили в конец list2 - list3

    }
}
