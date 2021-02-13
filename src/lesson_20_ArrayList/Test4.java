package lesson_20_ArrayList;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<StringBuilder>list=new ArrayList<>();
        list.add(new StringBuilder("Privet"));
        list.add(new StringBuilder("Poka"));
        list.add(new StringBuilder("Ok"));
        list.add(new StringBuilder("Hello"));
        list.add(new StringBuilder("Sorry"));
        for (StringBuilder s:list
             ) {
            System.out.print(s+" ");

        }
        System.out.println(list.indexOf("Hello"));
    }
}
