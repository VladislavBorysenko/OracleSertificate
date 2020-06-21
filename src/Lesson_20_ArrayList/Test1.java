package Lesson_20_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        Car c = new Car();
        list.add(c);
        Student s = new Student();
        list.add(s);
        ArrayList<String>list2=new ArrayList<String>();
        list2.add("Privet");
       // list2.add(s); неи можем добавить тип данных Student?  так как list2 принимает только String
        List<StringBuilder> list3=new ArrayList<>();
        list3.add(new StringBuilder("Poka"));

    }
}

class Student {
}

class Car {
}