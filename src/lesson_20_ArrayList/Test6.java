package lesson_20_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("a");
        StringBuilder sb2 = new StringBuilder("b");
        StringBuilder sb3 = new StringBuilder("c");

        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        //   ArrayList<StringBuilder> list1 = (ArrayList<StringBuilder>) list.clone();
        //  System.out.println(list == list1);
        //  System.out.println(list.toString() + "\n" + list1.toString());
//
        //  list.get(0).append("!!!");
        //  list.set(0,      new StringBuilder("D"));
        //  System.out.println(list1.toString());

        Object[] array1 =list.toArray();
        for (Object o:array1
             ) {
            System.out.println(o);

        }
        StringBuilder[]arr2=list.toArray(new StringBuilder[10]);
        for (StringBuilder sb:arr2
             ) {
            System.out.println(sb);
            
        }

        StringBuilder []array={sb1,sb2,sb3,sb2};
        List<StringBuilder>list8= Arrays.asList(array);
        System.out.println(list8);
    }
}
