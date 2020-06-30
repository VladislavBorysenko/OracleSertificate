package Lesson_20_ArrayList;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<Integer,String>map=new java.util.HashMap<>();
        map.put(777,"Ivanov");
        map.put(778,"Triguluv");
        map.put(779,"Sidorova");
        map.put(780,"Sidorova");
        map.put(778,"Roberta");//заменили значение
        System.out.println("map "+map);
        map.remove(778);//удоляем значение
        System.out.println("map "+map);
    }
}
